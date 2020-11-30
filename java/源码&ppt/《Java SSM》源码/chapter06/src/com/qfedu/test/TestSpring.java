package com.qfedu.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.qfedu.bean.Student;
import com.qfedu.bean.Teacher;
public class TestSpring {
	public static void main(String[] args) throws Exception  {
		//通过读取配置信息获取ApplicationContext对象
		ApplicationContext  applicationContext = new 
         	    ClassPathXmlApplicationContext("applicationContext.xml");
		//通过id值获取Student对象
		Student student = applicationContext.getBean
             ("student",Student.class);
		//调用Student对象的方法
		student.study();
		Teacher teacher = applicationContext.getBean("teacher",Teacher.class);
		teacher.teach();

	}
}
