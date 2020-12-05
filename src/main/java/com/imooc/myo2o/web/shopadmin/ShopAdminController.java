package com.imooc.myo2o.web.shopadmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/shopadmin2")
public class ShopAdminController {
    
	@RequestMapping(value="/shopOperation", method=RequestMethod.GET)
	public String shopOperation() {
		return "shopOperation";
	}
}
