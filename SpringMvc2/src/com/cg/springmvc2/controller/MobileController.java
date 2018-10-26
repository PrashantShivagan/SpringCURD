package com.cg.springmvc2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvc2.dto.Mobile;
import com.cg.springmvc2.service.MobileService;

@Controller
public class MobileController {
	@Autowired
	MobileService service;
		@RequestMapping(value="/home")
		public String getAllMobile(@ModelAttribute("my") Mobile mob){
			return "AddMobile";
		}
		@RequestMapping(value="addata", method= RequestMethod.POST)
		public String addMobiledata(@ModelAttribute("my") Mobile mobile){
			service.addMobile(mobile);
			//System.out.println(mobile.getMobid()+" " +mobile.getMobNmae()+" "+mobile.getMobPrice()+" " +mobile.getMobCategory()+ " "+mobile.getMobonline());
			return "Welcome";
		}
		
		@RequestMapping(value="showall", method=RequestMethod.GET)
		public ModelAndView showAllMobileData(){
			List<Mobile> allMobile = service.showAllMobile();
			return new ModelAndView("mobileshow", "data", allMobile);
			
		}
		@RequestMapping(value="searchmobile", method=RequestMethod.GET)
		public String searchData(@ModelAttribute("yy") Mobile mob){
			return "searchmobile";
		}
		
		@RequestMapping(value="mobilesearch", method=RequestMethod.POST)
		public ModelAndView dataSearch(@ModelAttribute("yy") Mobile mob){
			Mobile mobSearch = service.searchMobile(mob.getMobid());
			//System.out.println(mobSearch);
			return new ModelAndView("showsearch","temp", mobSearch);
			
		}
		
		@RequestMapping(value="deletemobile", method=RequestMethod.GET)
		public String deleteData(@ModelAttribute("zz") Mobile mob){
			return "deletemobile";
			
		}
}
