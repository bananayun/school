/**  
* @Title: CartService.java  
* @Package banana.service
* @Description: TODO(用一句话描述该文件做什么)  
* @author Feri 
* @date 2018年5月30日  
* @version V1.0  
*/
package banana.service;
import java.util.List;

import banana.common.vo.ViewCart;
import banana.pojo.Cart;
import banana.pojo.Goods;
public interface CartService {
	// 创建购物车
	public boolean createCart(Cart cart);
	// 加入购物车 详情页
	public boolean add(int cid, Goods gds, int num);
	// 修改数量 购物车页面
	public boolean changeNum(int cid, Goods gds, int num);
	// 获取购物车对象
	public Cart queryByUid(int uid);
	// 购物车的数据
	public List<ViewCart> queryCart(int cid);
	// 删除购物车的商品
	public int deleteDetail(int cid,int gid);
}