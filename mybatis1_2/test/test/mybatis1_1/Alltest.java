package test.mybatis1_1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cn.gxa.orm.Classes;
import com.cn.gxa.util.SQLSessionFactoryUtil;

class Alltest {
	static SqlSession   session;
	@BeforeEach
	public   void Before() {
		SqlSessionFactory   factory=SQLSessionFactoryUtil.getSqlSessionFactory();
		//���session 
		System.out.println("���з���֮ǰ");//输出
		  session=factory.openSession();
	}
	@AfterEach
	public  void After() {
		System.out.println("���з���֮��");
		if(session!=null) {
			session.commit();
			session.close();
		}
	}

	@Test
	public   void  testSelectAll(){
		//session����
		//SqlSessionFactory   factory=SQLSessionFactoryUtil.getSqlSessionFactory();
		//���session 
		//SqlSession   session=factory.openSession();
		//����sql
		List<Classes> list=session.selectList("classes.selectAll");//���ļ�namescape idһ��
		
		for (Classes classes : list) {
			System.out.println(classes.getId()+":"+classes.getName());
		}
	}
	@Test
	public  void  testAdd(){
		session.insert("classes.insertCalsses",new Classes("��÷÷"));		
	}

}
