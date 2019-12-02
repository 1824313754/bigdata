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

import com.bootdo.system.domain.DzhuserDO;
import com.bootdo.system.service.DzhuserService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-28 16:26:39
 */
 
@Controller
@RequestMapping("/system/dzhuser")
public class DzhuserController {
	@Autowired
	private DzhuserService dzhuserService;
	
	@GetMapping()
	@RequiresPermissions("system:dzhuser:dzhuser")
	String Dzhuser(){
	    return "system/dzhuser/dzhuser";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:dzhuser:dzhuser")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<DzhuserDO> dzhuserList = dzhuserService.list(query);
		int total = dzhuserService.count(query);
		PageUtils pageUtils = new PageUtils(dzhuserList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:dzhuser:add")
	String add(){
	    return "system/dzhuser/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:dzhuser:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		DzhuserDO dzhuser = dzhuserService.get(id);
		model.addAttribute("dzhuser", dzhuser);
	    return "system/dzhuser/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:dzhuser:add")
	public R save( DzhuserDO dzhuser){
		if(dzhuserService.save(dzhuser)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:dzhuser:edit")
	public R update( DzhuserDO dzhuser){
		dzhuserService.update(dzhuser);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:dzhuser:remove")
	public R remove( Integer id){
		if(dzhuserService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:dzhuser:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		dzhuserService.batchRemove(ids);
		return R.ok();
	}
	
}
