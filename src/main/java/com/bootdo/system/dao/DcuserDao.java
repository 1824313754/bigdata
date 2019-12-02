package com.bootdo.system.dao;

import com.bootdo.system.domain.DcuserDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-28 15:31:02
 */
@Mapper
public interface DcuserDao {

	DcuserDO get(Integer id);
	
	List<DcuserDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DcuserDO dcuser);
	
	int update(DcuserDO dcuser);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
