package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.DcuserDao;
import com.bootdo.system.domain.DcuserDO;
import com.bootdo.system.service.DcuserService;



@Service
public class DcuserServiceImpl implements DcuserService {
	@Autowired
	private DcuserDao dcuserDao;
	
	@Override
	public DcuserDO get(Integer id){
		return dcuserDao.get(id);
	}
	
	@Override
	public List<DcuserDO> list(Map<String, Object> map){
		return dcuserDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return dcuserDao.count(map);
	}
	
	@Override
	public int save(DcuserDO dcuser){
		return dcuserDao.save(dcuser);
	}
	
	@Override
	public int update(DcuserDO dcuser){
		return dcuserDao.update(dcuser);
	}
	
	@Override
	public int remove(Integer id){
		return dcuserDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return dcuserDao.batchRemove(ids);
	}
	
}
