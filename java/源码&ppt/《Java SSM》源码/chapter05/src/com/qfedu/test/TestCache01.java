package com.qfedu.test;

import java.io.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.pojo.Student;

public class TestCache01 {
	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession = factory.openSession();
			Student student = new Student();
			student.setSid(1);
			Student stu01 = sqlSession.selectOne("student.findStudentBySid", student);
			System.out.println(stu01.toString());
			Student stu02 = sqlSession.selectOne("student.findStudentBySid", student);
			System.out.println(stu02.toString());
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
