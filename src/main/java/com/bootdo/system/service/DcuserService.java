package com.bootdo.system.service;

import com.bootdo.system.domain.DcuserDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-28 15:31:02
 */
public interface DcuserService {
	
	DcuserDO get(Integer id);
	
	List<DcuserDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DcuserDO dcuser);
	
	int update(DcuserDO dcuser);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
