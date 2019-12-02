package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.JiqunDao;
import com.bootdo.system.domain.JiqunDO;
import com.bootdo.system.service.JiqunService;



@Service
public class JiqunServiceImpl implements JiqunService {
	@Autowired
	private JiqunDao jiqunDao;
	
	@Override
	public JiqunDO get(Integer id){
		return jiqunDao.get(id);
	}
	
	@Override
	public List<JiqunDO> list(Map<String, Object> map){
		return jiqunDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return jiqunDao.count(map);
	}
	
	@Override
	public int save(JiqunDO jiqun){
		return jiqunDao.save(jiqun);
	}
	
	@Override
	public int update(JiqunDO jiqun){
		return jiqunDao.update(jiqun);
	}
	
	@Override
	public int remove(Integer id){
		return jiqunDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return jiqunDao.batchRemove(ids);
	}

	@Override
	public List<String> pingtai() {
		return jiqunDao.pingtai();
	}

	@Override
	public List<String> version() {
		return jiqunDao.version();
	}

	@Override
	public List<String> cmversion() {
		return jiqunDao.cmversion();
	}
}
