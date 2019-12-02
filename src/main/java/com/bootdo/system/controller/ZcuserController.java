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

import com.bootdo.system.domain.ZcuserDO;
import com.bootdo.system.service.ZcuserService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-28 15:30:39
 */
 
@Controller
@RequestMapping("/system/zcuser")
public class ZcuserController {
	@Autowired
	private ZcuserService zcuserService;
	
	@GetMapping()
	@RequiresPermissions("system:zcuser:zcuser")
	String Zcuser(){
	    return "system/zcuser/zcuser";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:zcuser:zcuser")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ZcuserDO> zcuserList = zcuserService.list(query);
		int total = zcuserService.count(query);
		PageUtils pageUtils = new PageUtils(zcuserList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:zcuser:add")
	String add(){
	    return "system/zcuser/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:zcuser:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		ZcuserDO zcuser = zcuserService.get(id);
		model.addAttribute("zcuser", zcuser);
	    return "system/zcuser/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:zcuser:add")
	public R save( ZcuserDO zcuser){
		if(zcuserService.save(zcuser)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:zcuser:edit")
	public R update( ZcuserDO zcuser){
		zcuserService.update(zcuser);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:zcuser:remove")
	public R remove( Integer id){
		if(zcuserService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:zcuser:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		zcuserService.batchRemove(ids);
		return R.ok();
	}
	
}
