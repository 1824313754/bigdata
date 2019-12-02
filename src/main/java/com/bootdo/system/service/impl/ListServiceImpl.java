package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.ListDao;
import com.bootdo.system.domain.ListDO;
import com.bootdo.system.service.ListService;



@Service
public class ListServiceImpl implements ListService {
	@Autowired
	private ListDao listDao;
	
	@Override
	public ListDO get(Long id){
		return listDao.get(id);
	}
	
	@Override
	public List<ListDO> list(Map<String, Object> map){
		return listDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return listDao.count(map);
	}
	
	@Override
	public int save(ListDO list){
		return listDao.save(list);
	}
	
	@Override
	public int update(ListDO list){
		return listDao.update(list);
	}
	
	@Override
	public int remove(Long id){
		return listDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return listDao.batchRemove(ids);
	}

	@Override
	public List<String> zujian() {
		return listDao.zujian();
	}

	@Override
	public List<String> huanjin() {
		return listDao.huanjin();
	}
}
