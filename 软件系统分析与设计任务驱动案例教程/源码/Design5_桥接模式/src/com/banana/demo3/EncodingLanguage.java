package com.banana.demo3;

//定义抽象编程语言类
public abstract class EncodingLanguage {
	OutPut output;
    public void setOuPut(OutPut out)
    {
        this.output=out;
    }
    public abstract void language(String system);
}

