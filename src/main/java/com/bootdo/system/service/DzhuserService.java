package com.bootdo.system.service;

import com.bootdo.system.domain.DzhuserDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-28 16:26:39
 */
public interface DzhuserService {
	
	DzhuserDO get(Integer id);
	
	List<DzhuserDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DzhuserDO dzhuser);
	
	int update(DzhuserDO dzhuser);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
