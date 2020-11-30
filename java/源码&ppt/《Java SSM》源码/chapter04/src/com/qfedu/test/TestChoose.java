package com.qfedu.test;
import java.io.*;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.pojo.Student;
public class TestChoose {
	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		try {
			InputStream in = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new 
             SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession = factory.openSession();
		Student student = new Student();
		student.setSid(2);
		List<Student> selectList = 
             sqlSession.selectList("student.findStudentByChoose",student);
		for (Student stu : selectList) {
			System.out.println(stu.toString());	
		}
		sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
