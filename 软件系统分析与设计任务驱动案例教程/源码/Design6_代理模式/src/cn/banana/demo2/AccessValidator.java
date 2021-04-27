package cn.banana.demo2;

public class AccessValidator {
	//模拟实验登陆验证
	public boolean validate(String userId) {
		if(userId.equals("张三")) {
			System.out.println("登陆成功！");
			return true;
		}else {
			System.out.println("登陆失败！");
			return false;
		}
	}

}
