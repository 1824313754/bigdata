package com.bootdo.system.service;

import com.bootdo.system.domain.DescDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 14:53:33
 */
public interface DescService {
	
	DescDO get(Integer id);
	
	List<DescDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DescDO desc);
	
	int update(DescDO desc);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
