package cn.banana.demo2;

public class RealSearch implements Searcher {

	@Override
	public String DoSearch(String userId, String keyWord) {
		// TODO Auto-generated method stub

		System.out.println("用户" + userId + " 密码：" + keyWord + "查询商务信息");
		return "查询到的信息";
	}
}
