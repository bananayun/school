package com.qfedu.dao;

import java.util.List;
import com.qfedu.bean.Student;

public interface UserDao {
	public void insert(Student student); // 添加

	public void delete(Integer sid); // 删除

	public void update(Student role); // 更新

	public Student selectOne(Integer sid); // 查询单个

	public List<Student> selectAll(); // 查询所有
}