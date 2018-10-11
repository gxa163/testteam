package com.cn.gxa.mapper;

import java.util.List;
import java.util.Map;

import com.cn.gxa.orm.Classes;
import com.cn.gxa.orm.Student;

public interface StudentMapper {
	
	public   List<Student>  all();
	public   List<Student>  resultMapStudent();
	public  List<Student> selectByNameAndSex(Map map);
	//查询  很多条件  
	// id  name 部门   性别   address  年龄    18  -24  业务 层
	//public  List<Student>  selectByMode(Student  stu);
	public  List<Student>  selectByMode(Map<String,Object>  map);
	//批量删除
	public   int  deleteByManyId (List<Long>  manyId);
	public  List<Student>  selectById(Map<String,Object>  map);
}
