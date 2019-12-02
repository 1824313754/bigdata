package com.bootdo.system.service;

import com.bootdo.system.domain.ZcuserDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-28 15:30:39
 */
public interface ZcuserService {
	
	ZcuserDO get(Integer id);
	
	List<ZcuserDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ZcuserDO zcuser);
	
	int update(ZcuserDO zcuser);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
