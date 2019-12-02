package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.system.domain.DescDO;
import com.bootdo.system.service.DescService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 14:53:33
 */
 
@Controller
@RequestMapping("/system/desc")
public class DescController {
	@Autowired
	private DescService descService;
	
	@GetMapping()
	@RequiresPermissions("system:desc:desc")
	String Desc(){
	    return "system/desc/desc";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:desc:desc")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<DescDO> descList = descService.list(query);
		int total = descService.count(query);
		PageUtils pageUtils = new PageUtils(descList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:desc:add")
	String add(){
	    return "system/desc/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:desc:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		DescDO desc = descService.get(id);
		model.addAttribute("desc", desc);
	    return "system/desc/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:desc:add")
	public R save( DescDO desc){
		if(descService.save(desc)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:desc:edit")
	public R update( DescDO desc){
		descService.update(desc);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:desc:remove")
	public R remove( Integer id){
		if(descService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:desc:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		descService.batchRemove(ids);
		return R.ok();
	}
	
}
