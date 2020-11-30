package com.qfedu.bean;

import javax.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sch")
@Scope(scopeName = "singleton")
public class Sch {
	@Value("005")
	private int sid;
	@Autowired
	@Qualifier("stu")
	private Stu stu;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "Sch [sid=" + sid + ", stu=" + stu + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("Bean的初始化完成，调用init()方法");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bean的初始化完成，调用destroy()方法");
	}
}
