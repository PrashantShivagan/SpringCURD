package com.cg.springmvc2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mobileonlinedata")
public class Mobile {
	@Id
	@Column(name="mob_id")
	Integer mobid;
	@Column(name="mob_name")
	String mobNmae;
	@Column(name="mob_price")
	Double mobPrice;
	@Column(name="mob_cato")
	String mobCategory;
	@Column(name="mob_online")
	String mobonline;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	public Mobile(Integer mobid, String mobName, Double mobprice, String mobCategory, String mobonline){
		this.mobid = mobid;
		this.mobNmae = mobName;
		this.mobPrice = mobprice;
		this.mobCategory = mobCategory;
		this.mobonline = mobonline;
	}
	public Integer getMobid() {
		return mobid;
	}
	public void setMobid(Integer mobid) {
		this.mobid = mobid;
	}
	public String getMobNmae() {
		return mobNmae;
	}
	public void setMobNmae(String mobNmae) {
		this.mobNmae = mobNmae;
	}
	public Double getMobPrice() {
		return mobPrice;
	}
	public void setMobPrice(Double mobPrice) {
		this.mobPrice = mobPrice;
	}
	public String getMobCategory() {
		return mobCategory;
	}
	public void setMobCategory(String mobCategory) {
		this.mobCategory = mobCategory;
	}

	public String getMobonline() {
		return mobonline;
	}

	public void setMobonline(String mobonline) {
		this.mobonline = mobonline;
	}

	@Override
	public String toString() {
		return "Mobile [mobid=" + mobid + ", mobNmae=" + mobNmae
				+ ", mobPrice=" + mobPrice + ", mobCategory=" + mobCategory
				+ ", mobonline=" + mobonline + "]";
	}


	
}
