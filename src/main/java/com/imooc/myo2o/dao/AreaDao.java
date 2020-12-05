package com.imooc.myo2o.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.imooc.myo2o.entity.Area;
/**@author 张自强
 * @date  2020年11月8日 下午3:09:02
 * @version 1.0 
 * @description  
 */
@Repository
public interface AreaDao {

	/**
	 * 列出区域列表
	 * @return areaList
	 */
	List<Area> queryArea();
}
