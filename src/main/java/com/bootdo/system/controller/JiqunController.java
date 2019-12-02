package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.system.domain.JiqunVersionDO;
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

import com.bootdo.system.domain.JiqunDO;
import com.bootdo.system.service.JiqunService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-13 11:02:24
 */

@Controller
@RequestMapping("/system/jiqun")
public class JiqunController {
	@Autowired
	private JiqunService jiqunService;
	
	@GetMapping()
	@RequiresPermissions("system:jiqun:jiqun")
	String Jiqun(){
	    return "system/jiqun/jiqun";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:jiqun:jiqun")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<JiqunDO> jiqunList = jiqunService.list(query);

		int total = jiqunService.count(query);
		PageUtils pageUtils = new PageUtils(jiqunList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:jiqun:add")
	String add(){
	    return "system/jiqun/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:jiqun:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		JiqunDO jiqun = jiqunService.get(id);
		model.addAttribute("jiqun", jiqun);
	    return "system/jiqun/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:jiqun:add")
	public R save( JiqunDO jiqun){
		if(jiqunService.save(jiqun)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:jiqun:edit")
	public R update( JiqunDO jiqun){
		jiqunService.update(jiqun);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:jiqun:remove")
	public R remove( Integer id){
		if(jiqunService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:jiqun:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		jiqunService.batchRemove(ids);
		return R.ok();
	}

	/**
	 * 查所属平台
	 *
	 */
	@ResponseBody
	@GetMapping("/pingtai")
	public List<String> pingtai(){

		List<String> jiqunList = jiqunService.pingtai();

		return jiqunList;
	}
	/**
	 * 查cdh版本和cm版本
	 *
	 */
	@ResponseBody
	@GetMapping("/version")
	public JiqunVersionDO version(){

		List<String> version = jiqunService.version();
		List<String> cmversion = jiqunService.cmversion();
		JiqunVersionDO jiqunVersionDO = new JiqunVersionDO(version,cmversion);
		return jiqunVersionDO;
	}
}
