package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.ZcuserDao;
import com.bootdo.system.domain.ZcuserDO;
import com.bootdo.system.service.ZcuserService;



@Service
public class ZcuserServiceImpl implements ZcuserService {
	@Autowired
	private ZcuserDao zcuserDao;
	
	@Override
	public ZcuserDO get(Integer id){
		return zcuserDao.get(id);
	}
	
	@Override
	public List<ZcuserDO> list(Map<String, Object> map){
		return zcuserDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return zcuserDao.count(map);
	}
	
	@Override
	public int save(ZcuserDO zcuser){
		return zcuserDao.save(zcuser);
	}
	
	@Override
	public int update(ZcuserDO zcuser){
		return zcuserDao.update(zcuser);
	}
	
	@Override
	public int remove(Integer id){
		return zcuserDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return zcuserDao.batchRemove(ids);
	}
	
}
