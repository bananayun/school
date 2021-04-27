package cn.banana.demo1;

public class VideoFile extends AbstractFile {
    // 视频文件类：叶子构件
		private String name;
		public VideoFile(String name) {
			this.name = name;
		}
		public void add(AbstractFile file) {
			System.out.println("对不起，不支持该方法！");
			
		}
		public  void remove(AbstractFile file) {
			System.out.println("对不起，不支持该方法！");
		}
		public  AbstractFile getChild(int i) {
			System.out.println("对不起，不支持该方法！");
			return null;
		}
		public  void killVirus() {
			//模拟杀毒
			System.out.println("----- 对视频文件 "+name+" 杀毒");
		}
}
