package com.bdqn.dao;

import java.util.List;
import java.util.Map;

import com.bdqn.entity.AppInfo;
import org.springframework.data.repository.query.Param;


public interface AppInfoMapper {


	public List<AppInfo> list();
	

}
