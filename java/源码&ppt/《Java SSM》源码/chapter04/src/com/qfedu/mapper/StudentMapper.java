package com.qfedu.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.qfedu.pojo.Student;

public interface StudentMapper {
	@Select("select * from student where sid = #{sid}")
	Student selectStudent(int sid);
	@Insert("insert into student(sname,age,course) "
			+ " values(#{sname},#{age},#{course})")
	int insertStudent(Student student);
	@Update("update student "
    		+ "set sname = #{sname},age = #{age} where sid = #{sid}")
	int updateStudent(Student student);
	@Delete("delete from student where sid = #{sid}")
	int deleteStudent(int sid);
	
	@Select("select * from student where sname = #{param01} "
    		+ "and course = #{param02}")
	Student selectBySnameAndCourse(@Param("param01")String sname ,
			@Param("param02")String course);

	
}
