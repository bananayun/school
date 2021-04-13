package com.banana.demo3;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        OutPut output=null;
        EncodingLanguage language=null;
        //System.out.println(language);
        OperatingSystem system=null;
        if(output==null && language==null && system==null)
        {
        output=(OutPut)XmlUtil.getBean("OutPut");
        language=(EncodingLanguage)XmlUtil.getBean("EncodingLanguage");
        //System.out.println(language);
        system=(OperatingSystem)XmlUtil.getBean("OperatingSystem");

        System.out.println(output);
        System.out.println(language);
        System.out.println(system);
        }
        system.setlanguage(language);
        //System.out.println(language);
        language.setOuPut(output);
        system.type();

	}

}
