package cn.banana.demo1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//针对抽象构件编程
		AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3,folder4;
        folder1 = new Folder("sunny 的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");
        
        file1 = new ImageFile("张三jpg");
        file2 = new ImageFile("李四.jpg");
        file3 = new TextFile("设计模式.txt");
        file4 = new TextFile("数据结构.txt");
        file5 = new VideoFile("权利的游戏.rmvb");
        
        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);
        
        //从“Sunny的资料”节点开始进行杀毒操作
        folder1.killVirus();
	}

}
