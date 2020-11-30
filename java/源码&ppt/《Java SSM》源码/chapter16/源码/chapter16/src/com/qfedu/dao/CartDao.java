/** 
* @author Feri 
*/
package com.qfedu.dao;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.qfedu.common.vo.ViewCart;
import com.qfedu.domain.Cart;
import com.qfedu.domain.CartDetail;
public interface CartDao {
	//新增-创建购物车
	@Insert("insert into t_cart(uid,money) values(#{uid},0)")
	public int insert(Cart cart);
	//购物车添加商品
	@Insert("insert into t_cartdetail(cid,gid,num,money) values(#{cid},#{gid},#{num},#{money})")
	public int insertDetail(CartDetail cd);
	//修改购物车商品
	@Update("update t_cart set money=#{money} where id=#{id}")
	public int update(Cart cd);
	//修改购物车中数量
	@Update("update t_cartdetail set num=${num},money=${money} where cid=#{cid} and gid=#{gid}")
	public int updateDetail(CartDetail cartdetail);
	//清空购物车
	@Update("update t_cart set money=0 where id=#{id}")
	public int updateEmpty(int id);
	//获取用户的购物车
	@Select("select * from t_cart where uid=#{uid}")
	@ResultType(Cart.class)
	public Cart queryByUid(int uid);
	//获取用户的购物车详情
	@Select("select cd.* from t_cartdetail cd left join t_cart c on cd.cid=c.id where c.uid=#{uid}")
	@ResultType(CartDetail.class)
	public List<CartDetail> queryByDetail(int uid);
	//删除购物车中的商品
	@Delete("delete from  t_cartdetail where cid=#{cid} and gid=#{gid}")
	public int deleteDetail(@Param("cid")int cid,@Param("gid")int gid);
	//清空购物车
	@Delete("delete from  t_cartdetail where cid=#{cid} ")
	public int deleteDetailByCid(int cid);
	//获取详情对象
	@Select("select * from t_cartdetail where cid=#{cid} and gid=#{gid}")
	@ResultType(CartDetail.class)
	public CartDetail queryByCdid(@Param("cid")int cid,@Param("gid")int gid);
	//购物车的数据
	@Select("SELECT cd.num,cd.money,cd.gid,g.name,g.price FROM t_cartdetail cd LEFT JOIN t_goods g ON cd.gid=g.id  WHERE cd.cid=#{cid}")
	@ResultType(ViewCart.class)
	public List<ViewCart> queryCart(int cid);
}