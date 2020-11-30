package com.qfedu.test;

import java.io.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.mapper.StudentMapper;

public class TestDelete {
	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession = factory.openSession();
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			int result = mapper.deleteStudent(5);
			if (result > 0) {
				System.out.println("成功删除" + result + "条数据");
			} else {
				System.out.println("删除操作失败");
			}
			sqlSession.commit();
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
