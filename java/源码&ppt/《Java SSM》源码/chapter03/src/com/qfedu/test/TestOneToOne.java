package com.qfedu.test;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.pojo.Stu;

public class TestOneToOne {
	public static void main(String[] args) throws Exception {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		// 使用MyBatis查询结果sid为1的学生信息（包括学生的校园卡信息）
		Stu stu = session.selectOne("stu.findStudentBySid", 1);
		System.out.println(stu);
		session.close();
	}
}
