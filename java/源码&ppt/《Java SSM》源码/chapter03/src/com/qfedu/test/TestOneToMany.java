package com.qfedu.test;

import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.pojo.*;

public class TestOneToMany {
	public static void main(String[] args) throws Exception {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		// 使用MyBatis查询cid为1的班级信息（包括该班级的学生信息）
		StuClass stuClass = session.selectOne("stuClass.findStuClassByCid", 1);
		System.out.println("班级ID：" + stuClass.getCid() + "\n班级名称：" + stuClass.getCname() + "\n班级人数：" + stuClass.getSum()
				+ "\n学生信息：");
		List<StuInfo> stuInfoList = stuClass.getStuInfoList();
		for (StuInfo stuInfo : stuInfoList) {
			System.out.println(stuInfo);
		}
		session.close();
	}
}
