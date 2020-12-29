/**
* @author Feri 
*/
package banana.service.impl;
import banana.dao.GoodsTypeDao;
import banana.pojo.GoodsType;
import banana.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
	@Autowired
	private GoodsTypeDao dao;
	@Override
	public boolean save(GoodsType gt) {
return dao.save(gt)>0;
	}
	@Override
	public List<GoodsType> queryByGrade() {
return dao.queryByGrade();
	}
	@Override
	public List<GoodsType> queryAll() {
return dao.queryAll();
	}
	@Override
	public List<GoodsType> queryNameAndFlag(String name,int flag) {
		// 根据商品等级和商品名称查询商品（admin）
		return dao.queryNameAndFlag(name,flag);
	}
	//根据id删除商品类型
	@Override
	public int deleteType(int tid) {
return dao.deleteType(tid);
	}
}