package com.imooc.myo2o.dao;
import com.imooc.myo2o.entity.Shop;

/**@author 张自强
 * @date  2020年11月11日 下午9:01:11
 * @version 1.0 
 * @parameter  
 * @description  
 * @return 
 */
public interface ShopDao {
 
	/**
	 * 新增店铺
	 */
	int insertShop(Shop shop);
	
	/**
	 * 更新店铺
	 */
	int updateShop(Shop shop);
    //int updateShop(@Param("shop")Shop shop);
	
}


