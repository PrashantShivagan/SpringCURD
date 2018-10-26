package com.cg.springmvc2.service;

import java.util.List;

import com.cg.springmvc2.dto.Mobile;

public interface MobileService {
	public void addMobile(Mobile mobile);
	public List<Mobile> showAllMobile();
	public void deleteMobile(int mobId);
	public Mobile searchMobile(int mobId);
}
