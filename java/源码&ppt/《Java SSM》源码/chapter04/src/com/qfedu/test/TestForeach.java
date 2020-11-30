package com.qfedu.test;

import java.io.*;
import java.util.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.pojo.Student;

public class TestForeach {
	public static void main(String[] args) {
		// 读取配置文件
		String resource = "mybatis-config.xml";
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			// 创建SQLSessionFactory对象
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
			// 创建SqlSession对象
			SqlSession sqlSession = factory.openSession();
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			// 调用SqlSession对象的selectList()方法执行查询
			List<Student> stuList = sqlSession.selectList("student.findStudentByForeach", list);
			for (Student stu : stuList) {
				System.out.println(stu.toString());
			}
			// 关闭SqlSession
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
