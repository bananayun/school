package cn.banana.demo1;

public abstract class AbstractFile {
	//抽象文件类，抽象构件 
	public abstract void add(AbstractFile file);
	public abstract void remove(AbstractFile file);
	public abstract AbstractFile getChild(int i);
	public abstract void killVirus();
			
}
