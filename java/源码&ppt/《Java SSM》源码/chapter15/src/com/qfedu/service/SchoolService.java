package com.qfedu.service;
import java.util.List;
import com.qfedu.pojo.School;
public interface SchoolService {
	int save(School school);
	List<School> queryAll();
}