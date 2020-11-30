package com.qfedu.test;

import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import com.qfedu.pojo.*;

public class TestManyToMany {
	public static void main(String[] args) throws Exception {
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		// 使用MyBatis查询cid为1的班级信息（包括该班级的教师信息）
		ClassInfo classInfo = session.selectOne("classInfo.findClassInfoByCid", 1);
		System.out.println("班级ID：" + classInfo.getCid() + "\n班级名称：" + classInfo.getCname() + "\n班级人数："
				+ classInfo.getSum() + "\n教师信息：");
		List<TeachInfo> teachInfoList = classInfo.getTeachInfoList();
		for (TeachInfo teachInfo : teachInfoList) {
			System.out.println(teachInfo.toString());
		}
		session.close();
	}
}
