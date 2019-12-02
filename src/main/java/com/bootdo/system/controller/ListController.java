package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.system.domain.OrcaleDO;
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

import com.bootdo.system.domain.ListDO;
import com.bootdo.system.service.ListService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-08 16:28:23
 */
 
@Controller
@RequestMapping("/system/list")
public class ListController {
	@Autowired
	private ListService listService;
	
	@GetMapping()
	@RequiresPermissions("system:list:list")
	String List(){
	    return "system/list/list";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:list:list")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ListDO> listList = listService.list(query);
		int total = listService.count(query);
		PageUtils pageUtils = new PageUtils(listList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:list:add")
	String add(){
	    return "system/list/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:list:edit")
	String edit(@PathVariable("id") Long id,Model model){
		ListDO list = listService.get(id);
		model.addAttribute("list", list);
	    return "system/list/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:list:add")
	public R save( ListDO list){
		if(listService.save(list)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:list:edit")
	public R update( ListDO list){
		listService.update(list);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:list:remove")
	public R remove( Long id){
		if(listService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody

	public R remove(@RequestParam("ids[]") Long[] ids){
		listService.batchRemove(ids);
		return R.ok();
	}
	/**
	 * 查cdh版本和cm版本
	 *
	 */
	@ResponseBody
	@GetMapping("/orcale")
	public OrcaleDO version(){

		List<String> component = listService.zujian();
		List<String> environment = listService.huanjin();
		OrcaleDO orcaleDO = new OrcaleDO(component,environment);
		return orcaleDO;
	}
}
