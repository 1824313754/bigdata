package com.bootdo.system.service;

import com.bootdo.system.domain.ListDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-08 16:28:23
 */
public interface ListService {
	
	ListDO get(Long id);
	
	List<ListDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ListDO list);
	
	int update(ListDO list);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
	List<String> zujian();
	List<String> huanjin();
}
