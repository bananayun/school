package com.qfedu.test;

import java.io.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.pojo.Student;

public class TestCache04 {
	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession01 = factory.openSession();
			SqlSession sqlSession02 = factory.openSession();
			SqlSession sqlSession03 = factory.openSession();
			Student student01 = new Student();
			student01.setSid(1);
			Student stu01 = sqlSession01.selectOne("student.findStudentBySid", student01);
			System.out.println(stu01.toString());
			sqlSession01.close();
			Student student02 = new Student();
			student02.setSid(3);
			student02.setSname("ZhaoLiu");
			student02.setAge("19");
			sqlSession02.update("student.updateStudent", student02);
			sqlSession02.commit();
			sqlSession02.close();
			Student stu02 = sqlSession03.selectOne("student.findStudentBySid", student01);
			System.out.println(stu02.toString());
			sqlSession03.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
