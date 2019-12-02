package com.bootdo.system.service;

import com.bootdo.system.domain.JiqunDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-13 11:02:24
 */
public interface JiqunService {
	
	JiqunDO get(Integer id);
	
	List<JiqunDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(JiqunDO jiqun);
	
	int update(JiqunDO jiqun);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
	List<String> pingtai();
	List<String> version();
	List<String> cmversion();
}
