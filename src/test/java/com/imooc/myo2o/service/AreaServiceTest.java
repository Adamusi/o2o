package com.imooc.myo2o.service;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.myo2o.BaseTest;
import com.imooc.myo2o.entity.Area;
/**@author 张自强
 * @date  2020年11月8日 下午7:27:56
 * @version 1.0 
 */
public class AreaServiceTest extends BaseTest{

	@Autowired
	private AreaService areaService;
	@Test
	public void testGetAreaList() {
		List<Area> areaList = areaService.getAreaList();
		assertEquals("东苑", areaList.get(0).getAreaName());
	}
}
