package com.imooc.myo2o.service;
import java.io.File;

import com.imooc.myo2o.dto.ShopExecution;
import com.imooc.myo2o.entity.Shop;

/**@author 张自强
 * @date  2020年11月17日 下午8:13:40
 * @version 1.0 
 * @parameter  
 * @description  
 * @return 
 */
public interface ShopService {
	//添加店铺
	ShopExecution addShop(Shop shop, File shopImg);



	
	
}
