package com.bootdo.system.dao;

import com.bootdo.system.domain.LjuserDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-28 16:26:42
 */
@Mapper
public interface LjuserDao {

	LjuserDO get(Integer id);
	
	List<LjuserDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(LjuserDO ljuser);
	
	int update(LjuserDO ljuser);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
