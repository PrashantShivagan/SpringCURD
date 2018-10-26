package com.cg.springmvc2.dao;

import java.util.List;

import com.cg.springmvc2.dto.Mobile;

public interface MobileDao {
	public void addMobile(Mobile mobile);
	public List<Mobile> showAllMobile();
	public void deleteMobile(int mobId);
	public Mobile searchMobile(int mobId);
}
