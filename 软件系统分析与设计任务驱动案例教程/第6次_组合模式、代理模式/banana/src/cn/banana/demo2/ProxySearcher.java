package cn.banana.demo2;

public class ProxySearcher implements Searcher {
	private RealSearch realSearch = new RealSearch();
	private AccessValidator validator;
	private Logger logger;

	@Override
	public String DoSearch(String userId, String keyWord) {
		// TODO Auto-generated method stub
		//如果身份验证成功
		if(this.Validate(userId)) {
			//调用真实主题对象的查询方法
			String result = realSearch.DoSearch(userId, keyWord);
		    this.Log(userId);
		    return result;
		
		}else {
			return null;
		}		
	}
	
	//
    //创建访问验证对象并调用其Validate()方法实现身份验证
    public boolean Validate(String userId) {
    	validator = new AccessValidator();
    	return validator.validate(userId);
    }
    
    //创建日志记录对象并调用其Log()方法实现日志记录
    public void Log(String userId) {
    	logger = new Logger();
    	logger.Log(userId);
    }
    

}
