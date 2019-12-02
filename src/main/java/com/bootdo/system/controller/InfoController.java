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

import com.bootdo.system.domain.InfoDO;
import com.bootdo.system.service.InfoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-22 18:00:20
 */
 
@Controller
@RequestMapping("/system/info")
public class InfoController {
	@Autowired
	private InfoService infoService;
	
	@GetMapping()
	@RequiresPermissions("system:info:info")
	String Info(){
	    return "system/info/info";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:info:info")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<InfoDO> infoList = infoService.list(query);
		int total = infoService.count(query);
		PageUtils pageUtils = new PageUtils(infoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:info:add")
	String add(){
	    return "system/info/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:info:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		InfoDO info = infoService.get(id);
		model.addAttribute("info", info);
	    return "system/info/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:info:add")
	public R save( InfoDO info){
		if(infoService.save(info)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:info:edit")
	public R update( InfoDO info){
		infoService.update(info);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:info:remove")
	public R remove( Integer id){
		if(infoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:info:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		infoService.batchRemove(ids);
		return R.ok();
	}
	
}
