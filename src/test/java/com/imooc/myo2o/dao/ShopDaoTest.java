package com.imooc.myo2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.myo2o.BaseTest;
import com.imooc.myo2o.entity.Area;
import com.imooc.myo2o.entity.PersonInfo;
import com.imooc.myo2o.entity.Shop;
import com.imooc.myo2o.entity.ShopCategory;


public class ShopDaoTest extends BaseTest {
	@Autowired
	private ShopDao shopDao;
  
	@Ignore
	public void testInsertShop()  {
		Shop shop = new Shop();
		PersonInfo owner = new PersonInfo();
		Area area = new Area();
		ShopCategory shopCategory = new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(1L);
		shopCategory.setShopCategoryId(1L);
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		shop.setShopName("test");
		shop.setShopDesc("test");
		shop.setShopAddr("test");
		shop.setPhone("test");
		shop.setShopImg("test22");
		shop.setCreateTime(new Date());
		shop.setLastEditTime(new Date());
		shop.setEnableStatus(0);
		shop.setAdvice("test");
		int effectedNum = shopDao.insertShop(shop);
		assertEquals(1, effectedNum);
	
	}
	
	
	@Test
	public void testModifyShop()  {
		Shop shop = new Shop();
		shop.setShopId(15L);
		shop.setShopName("22");
		shop.setShopDesc("zzz");
		shop.setShopAddr("zzz");
		shop.setPhone("zzz");
		shop.setShopImg("zzz");
	    shop.setCreateTime(new Date()); 
	    shop.setLastEditTime(new Date());
		shop.setEnableStatus(0);
		shop.setAdvice("1");
		int effectedNum = shopDao.updateShop(shop);
		assertEquals(1, effectedNum);
	
	}

}
