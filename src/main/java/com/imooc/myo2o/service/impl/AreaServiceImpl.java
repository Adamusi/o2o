package com.imooc.myo2o.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.myo2o.dao.AreaDao;
import com.imooc.myo2o.entity.Area;
import com.imooc.myo2o.service.AreaService;

/**@author 张自强
 * @date  2020年11月8日 下午7:23:26
 * @version 1.0 
 */

@Service
public class AreaServiceImpl implements AreaService{
   
	@Autowired
	private AreaDao areaDao;
	@Override
    public List<Area> getAreaList() {
		return areaDao.queryArea();
	}

}
