package com.cg.springmvc2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.springmvc2.dao.MobileDao;
import com.cg.springmvc2.dto.Mobile;
@Service("mobileservice")
@Transactional
public class MobileServiceimpl implements MobileService {
	@Autowired
	MobileDao mobiledao;
	@Override
	public void addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		mobiledao.addMobile(mobile);

	}

	@Override
	public List<Mobile> showAllMobile() {
		// TODO Auto-generated method stub
		
		return mobiledao.showAllMobile();
	}

	@Override
	public void deleteMobile(int mobId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Mobile searchMobile(int mobId) {
		// TODO Auto-generated method stub
		return mobiledao.searchMobile(mobId);
	}

}
