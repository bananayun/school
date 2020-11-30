package com.qfedu.test;

import java.io.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.mapper.StudentMapper;
import com.qfedu.pojo.Student;

public class TestSelect {
	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession = factory.openSession();
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			Student student = mapper.selectBySnameAndCourse("LiSi", "Java");
			System.out.println(student.toString());
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
