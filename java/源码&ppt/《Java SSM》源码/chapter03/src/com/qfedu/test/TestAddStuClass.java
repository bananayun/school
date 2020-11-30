package com.qfedu.test;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.pojo.StuClass;

public class TestAddStuClass {
	public static void main(String[] args) throws Exception {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		StuClass stuClass = new StuClass();
		stuClass.setCname("Java1803");
		stuClass.setSum(50);
		// 使用MyBatis插入一条班级信息
		//int result = session.insert("stuClass.addStuClass01", stuClass);
		int result = session.insert("stuClass.addStuClass02",stuClass );
		if (result > 0) {
			System.out.println("成功插入" + result + "条数据");
			System.out.println("插入数据的主键cid为:" + stuClass.getCid());
		} else {
			System.out.println("插入操作失败");
		}
		// 提交事务
		session.commit();
		// 关闭SqlSession
		session.close();
	}
}
