package com.ints.common.srv.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ints.common.dao.TaAdminMngMapper;
import com.ints.common.model.TaAdminMng;
import com.ints.common.srv.TaAdminMngService;
@Repository
public class TaAdminMngServiceImpl implements TaAdminMngService{

	@Autowired
	TaAdminMngMapper mapper;
	
	@Override
	public int checkAdminMngByAdminId(String id, String pass) {
		int check = 0;
		
		try{
		TaAdminMng vo = mapper.selectAdminMngById(id);
		
		
		if(vo.getAdminPass().equals(pass)){
			check=1;
			}
		}catch(Exception e){
			check=0;
		}
		
		return check;
	}

	@Override
	public TaAdminMng getAdminMngByAdminId(String id) {
		
		return mapper.selectAdminMngById(id);
	}

}
