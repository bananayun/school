package cn.banana.demo2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Searcher searcher;
         searcher = (Searcher)XMLUtil.getBean();
         String result = searcher.DoSearch("张三", "设计模式");
	}

}
