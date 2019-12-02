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

import com.bootdo.system.domain.LjuserDO;
import com.bootdo.system.service.LjuserService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-28 16:26:42
 */
 
@Controller
@RequestMapping("/system/ljuser")
public class LjuserController {
	@Autowired
	private LjuserService ljuserService;
	
	@GetMapping()
	@RequiresPermissions("system:ljuser:ljuser")
	String Ljuser(){
	    return "system/ljuser/ljuser";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:ljuser:ljuser")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<LjuserDO> ljuserList = ljuserService.list(query);
		int total = ljuserService.count(query);
		PageUtils pageUtils = new PageUtils(ljuserList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:ljuser:add")
	String add(){
	    return "system/ljuser/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:ljuser:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		LjuserDO ljuser = ljuserService.get(id);
		model.addAttribute("ljuser", ljuser);
	    return "system/ljuser/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:ljuser:add")
	public R save( LjuserDO ljuser){
		if(ljuserService.save(ljuser)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:ljuser:edit")
	public R update( LjuserDO ljuser){
		ljuserService.update(ljuser);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:ljuser:remove")
	public R remove( Integer id){
		if(ljuserService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:ljuser:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		ljuserService.batchRemove(ids);
		return R.ok();
	}
	
}
