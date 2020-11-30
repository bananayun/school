package com.qfedu.test;

import java.io.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.pojo.Student;

public class TestUpdate {
	public static void main(String[] args) {
		// 读取配置文件
		String resource = "mybatis-config.xml";
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			// 创建SQLSessionFactory对象
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
			// 创建SqlSession对象
			SqlSession sqlSession = factory.openSession();
			Student student = new Student();
			student.setSid(7);
			student.setSname("WuJiu");
			student.setCourse("Python");
			// 调用SqlSession对象的update()方法执行更新
			int result = sqlSession.update("student.updateStudent", student);
			if (result > 0) {
				System.out.println("成功更新" + result + "条数据");
			} else {
				System.out.println("更新操作失败");
			}
			// 提交事务
			sqlSession.commit();
			// 关闭SqlSession
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
