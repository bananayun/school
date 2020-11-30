package com.qfedu.test;

import java.io.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.pojo.Student;

public class TestSet {
	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession = factory.openSession();
			Student student = new Student();
			// 为Student对象的成员属性赋值
			student.setSid(4);
			student.setSname("ZhaoLiu");
			student.setAge("20");
			// 调用sqlSession的update()方法
			int result = sqlSession.update("student.updateStudent", student);
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
