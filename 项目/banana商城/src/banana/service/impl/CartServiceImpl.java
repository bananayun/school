/**
* @author Feri 
*/
package banana.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import banana.common.vo.ViewCart;
import banana.dao.CartDao;
import banana.pojo.Cart;
import banana.pojo.CartDetail;
import banana.pojo.Goods;
import banana.service.CartService;
@Service
public class CartServiceImpl implements CartService{
	@Autowired
	private CartDao dao;
	@Override
	public boolean createCart(Cart cart) {
return dao.insert(cart)>0;
	}
	/* 在商品详情页面 加入购物车*/
	@Override
	public boolean add(int cid,Goods gds,int num) {
CartDetail detail=dao.queryByCdid(cid,gds.getId());
		//判断是新增还是修改
		if(detail==null) {
			//第一次
			CartDetail cd=new CartDetail();
			cd.setCid(cid);
			cd.setGid(gds.getId());
			cd.setNum(num);
			cd.setMoney(num*gds.getPrice());
			return dao.insertDetail(cd)>0;
		}else {
			//N次
			detail.setMoney(detail.getMoney()+gds.getPrice());
			detail.setNum(detail.getNum()+1);
			return dao.updateDetail(detail)>0;
		}
	}
	//更改数量
	@Override
	public boolean changeNum(int cid, Goods gds, int num) {
CartDetail detail=dao.queryByCdid(cid,gds.getId());
		if(num==-1) {
			gds.setPrice(-gds.getPrice());
			detail.setNum(detail.getNum()-1);
		}else {
			detail.setNum(detail.getNum()+1);
		}
		
		detail.setMoney(detail.getMoney()+gds.getPrice());
		
		return dao.updateDetail(detail)>0;
	}
	//查询
	@Override
	public Cart queryByUid(int uid) {
return dao.queryByUid(uid);
	}
	//详情查询
	@Override
	public List<ViewCart> queryCart(int cid) {
return dao.queryCart(cid);
	}
	//删除购物车中的商品
	@Override
	public int deleteDetail(int cid, int gid) {
		if(gid == 0) {//清空购物车
			return dao.deleteDetailByCid(cid);
		}else {
			return dao.deleteDetail(cid,gid);
		}
	}
}