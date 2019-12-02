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

import com.bootdo.system.domain.DcuserDO;
import com.bootdo.system.service.DcuserService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-28 15:31:02
 */
 
@Controller
@RequestMapping("/system/dcuser")
public class DcuserController {
	@Autowired
	private DcuserService dcuserService;
	
	@GetMapping()
	@RequiresPermissions("system:dcuser:dcuser")
	String Dcuser(){
	    return "system/dcuser/dcuser";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:dcuser:dcuser")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<DcuserDO> dcuserList = dcuserService.list(query);
		int total = dcuserService.count(query);
		PageUtils pageUtils = new PageUtils(dcuserList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:dcuser:add")
	String add(){
	    return "system/dcuser/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:dcuser:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		DcuserDO dcuser = dcuserService.get(id);
		model.addAttribute("dcuser", dcuser);
	    return "system/dcuser/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:dcuser:add")
	public R save( DcuserDO dcuser){
		if(dcuserService.save(dcuser)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:dcuser:edit")
	public R update( DcuserDO dcuser){
		dcuserService.update(dcuser);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:dcuser:remove")
	public R remove( Integer id){
		if(dcuserService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:dcuser:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		dcuserService.batchRemove(ids);
		return R.ok();
	}
	
}
