package com.qfedu.test;

import java.io.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

public class TestDelete {
	public static void main(String[] args) {
		// 读取配置文件
		String resource = "mybatis-config.xml";
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			// 创建SQLSessionFactory对象
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
			// 创建SqlSession对象
			SqlSession sqlSession = factory.openSession();
			// 调用SqlSession对象的delete()方法执行删除
			int result = sqlSession.delete("student.deleteStudent", 7);
			if (result > 0) {
				System.out.println("成功删除" + result + "条数据");
			} else {
				System.out.println("删除操作失败");
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
