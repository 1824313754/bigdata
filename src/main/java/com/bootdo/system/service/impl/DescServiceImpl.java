package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.DescDao;
import com.bootdo.system.domain.DescDO;
import com.bootdo.system.service.DescService;



@Service
public class DescServiceImpl implements DescService {
	@Autowired
	private DescDao descDao;
	
	@Override
	public DescDO get(Integer id){
		return descDao.get(id);
	}
	
	@Override
	public List<DescDO> list(Map<String, Object> map){
		return descDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return descDao.count(map);
	}
	
	@Override
	public int save(DescDO desc){
		return descDao.save(desc);
	}
	
	@Override
	public int update(DescDO desc){
		return descDao.update(desc);
	}
	
	@Override
	public int remove(Integer id){
		return descDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return descDao.batchRemove(ids);
	}
	
}
