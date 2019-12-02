package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.LjuserDao;
import com.bootdo.system.domain.LjuserDO;
import com.bootdo.system.service.LjuserService;



@Service
public class LjuserServiceImpl implements LjuserService {
	@Autowired
	private LjuserDao ljuserDao;
	
	@Override
	public LjuserDO get(Integer id){
		return ljuserDao.get(id);
	}
	
	@Override
	public List<LjuserDO> list(Map<String, Object> map){
		return ljuserDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ljuserDao.count(map);
	}
	
	@Override
	public int save(LjuserDO ljuser){
		return ljuserDao.save(ljuser);
	}
	
	@Override
	public int update(LjuserDO ljuser){
		return ljuserDao.update(ljuser);
	}
	
	@Override
	public int remove(Integer id){
		return ljuserDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return ljuserDao.batchRemove(ids);
	}
	
}
