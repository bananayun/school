package com.qfedu.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import com.qfedu.pojo.School;
public interface SchoolDao {
	//ÐÂÔö
	@Insert("insert into t_school(name,persons) values(#{name},#{persons})")
	int insert(School school);
	//²éÑ¯
	@Select("select * from t_school")
	@ResultType(School.class)
	List<School> selectAll();
}
