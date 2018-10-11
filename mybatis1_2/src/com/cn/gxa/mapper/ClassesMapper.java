package com.cn.gxa.mapper;

import java.util.List;
import java.util.Map;

import com.cn.gxa.orm.Classes;

public interface ClassesMapper {
	
	public   List<Classes>  selectAll();
	public   List<Classes>  selectLike(String name);
	public  int  deleteByid(Long  id);

	public  int insertCalsses(Classes  cl);
	public  boolean updateClasses(Classes  cl);//boolean 或者int都可以
	public  Classes selectByIdandName(Map map);
}
