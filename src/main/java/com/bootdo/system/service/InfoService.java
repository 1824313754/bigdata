package com.bootdo.system.service;

import com.bootdo.system.domain.InfoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-22 18:00:20
 */
public interface InfoService {
	
	InfoDO get(Integer id);
	
	List<InfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(InfoDO info);
	
	int update(InfoDO info);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
