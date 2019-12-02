package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.DzhuserDao;
import com.bootdo.system.domain.DzhuserDO;
import com.bootdo.system.service.DzhuserService;



@Service
public class DzhuserServiceImpl implements DzhuserService {
	@Autowired
	private DzhuserDao dzhuserDao;
	
	@Override
	public DzhuserDO get(Integer id){
		return dzhuserDao.get(id);
	}
	
	@Override
	public List<DzhuserDO> list(Map<String, Object> map){
		return dzhuserDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return dzhuserDao.count(map);
	}
	
	@Override
	public int save(DzhuserDO dzhuser){
		return dzhuserDao.save(dzhuser);
	}
	
	@Override
	public int update(DzhuserDO dzhuser){
		return dzhuserDao.update(dzhuser);
	}
	
	@Override
	public int remove(Integer id){
		return dzhuserDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return dzhuserDao.batchRemove(ids);
	}
	
}
