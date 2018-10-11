package com.cn.gxa.orm;
/**
 *  µÃÂ¿‡
 * @author admin
 *
 */
public class Classes {
	private  Long  id;
	private  String  name;
	
	public Classes(){}
	public Classes(String name) {
		super();
		this.name = name;
	}
	public Classes(Long id,String name) {
		this.id=id;
		this.name=name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
