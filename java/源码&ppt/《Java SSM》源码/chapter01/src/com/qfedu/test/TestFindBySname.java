package com.qfedu.test;

import java.io.*;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.pojo.Student;

public class TestFindBySname {
	public static void main(String[] args) {
		// 读取配置文件
		String resource = "mybatis-config.xml";
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			// 创建SQLSessionFactory对象
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
			// 创建SqlSession对象
			SqlSession sqlSession = factory.openSession();
			// 调用SqlSession的selectList()方法执行查询
			List<Student> selectList = sqlSession.selectList("student.findStudentBySname", "ZhangSan");
			for (Student student : selectList) {
				System.out.println(student.toString());
			}
			// 关闭SqlSession
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
