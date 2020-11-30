package com.qfedu.test;

import java.io.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.mapper.StudentMapper;
import com.qfedu.pojo.Student;

public class TestUpdate {
	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession = factory.openSession();
			Student student = new Student();
			student.setSid(5);
			student.setSname("WuJiu");
			student.setCourse("Python");
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			int result = mapper.updateStudent(student);
			if (result > 0) {
				System.out.println("成功更新" + result + "条数据");
			} else {
				System.out.println("更新操作失败");
			}
			sqlSession.commit();
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
