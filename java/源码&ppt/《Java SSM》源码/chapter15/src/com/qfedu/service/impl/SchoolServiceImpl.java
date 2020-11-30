package com.qfedu.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qfedu.dao.SchoolDao;
import com.qfedu.pojo.School;
import com.qfedu.service.SchoolService;
@Service
public class SchoolServiceImpl implements SchoolService{
	@Autowired
	private SchoolDao dao;
	@Override
	public int save(School school) {
		return dao.insert(school);
	}
	@Override
	public List<School> queryAll() {
		return dao.selectAll();
	}
}