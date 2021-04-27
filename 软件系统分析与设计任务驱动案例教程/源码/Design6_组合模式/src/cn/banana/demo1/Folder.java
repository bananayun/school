package cn.banana.demo1;

import java.util.ArrayList;

public class Folder extends AbstractFile {
	// 文本文件类：叶子构件
	        // //定义集合fileList，用于存储AbstractFile类型的成员 
	       private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
	
			private String name;
			public Folder(String name) {
				this.name = name;
			}
			public void add(AbstractFile file) {
				fileList.add(file);
				
			}
			public  void remove(AbstractFile file) {
				fileList.remove(file);
			}
			public  AbstractFile getChild(int i) {
				return (AbstractFile) fileList.get(i);
			}
			public  void killVirus() {
				//模拟杀毒
				System.out.println("----- 对文件夹 "+name+" 杀毒");
				//递归调用成员的killVirus()方法
				for(Object obj:fileList) {
					((AbstractFile)obj).killVirus();
				}
			}

}
