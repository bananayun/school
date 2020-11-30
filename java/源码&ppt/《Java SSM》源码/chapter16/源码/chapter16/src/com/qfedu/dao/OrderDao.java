/**  
* @Title: OrderDao.java  
* @Package com.qfedu.dao  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Feri 
* @date 2018年5月31日  
* @version V1.0  
*/  
package com.qfedu.dao;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.qfedu.common.vo.ViewOrder;
import com.qfedu.common.vo.ViewOrderDetail;
import com.qfedu.domain.Order;
import com.qfedu.domain.OrderDetail;
public interface OrderDao {
	//新增 订单详情
	@Insert("insert into t_orderdetail(oid,gid,money,num) values(#{oid},#{gid},#{money},#{num})")
	public int insertDetail(OrderDetail detail);
	//新增 订单
	@Insert("insert into t_order(id,uid,uaid,money,createtime,flag) values(#{id},#{uid},#{uaid},#{money},now(),1)")
	public int insert(Order order);
	//修改订单状态
	@Update("update t_order set flag=#{flag} where id=#{id}")
	public int update(@Param("id")String oid,@Param("flag")int flag);	
	//查询订单列表
	@Select("select o.*,CONCAT(ua.name,'-',ua.phone,'-',ua.detail)address from t_order o left join t_useraddress ua on o.uaid=ua.id where o.uid=#{uid}")
	@ResultType(Order.class)
	public List<Order> queryByUid(int uid);
	//查询订单
	@Select("SELECT * FROM t_order o LEFT JOIN t_useraddress ua ON o.uaid=ua.id WHERE o.id=#{oid}")
	@ResultType(Order.class)
	public ViewOrder queryOrder(String oid);
	//查询订单子项
	@Select("SELECT g.*,od.num,od.money FROM t_orderdetail od LEFT JOIN t_goods g ON od.gid=g.id WHERE od.oid=#{oid}")
	@ResultType(Order.class)
	public List<ViewOrderDetail> queryDetailList(String oid);
	//查询订单详情  较为复杂的sql
	@Select("SELECT g.*,od.num,od.money,o.createtime,o.money,ua.name,ua.phone,ua.detail FROM t_orderdetail od LEFT JOIN t_goods g ON od.gid=g.id LEFT JOIN t_order o ON od.oid=o.id LEFT JOIN t_useraddress ua ON o.uaid=ua.id WHERE od.oid=#{oid}")
	@ResultType(Order.class)
	public ViewOrder queryDetail(String oid);
	//查询全部订单
	@Select("SELECT o.*,u.username FROM t_order o LEFT JOIN t_user u ON o.uid=u.id")
	@ResultType(Order.class)
	public List<Order> queryAll();
	//根据用户姓名和订单的支付状态查询订单（admin）
	@Select("<script>" +
            "select o.*,u.username from t_order o LEFT JOIN t_user u ON o.uid=u.id" +
            "<where>" +
                "<if test='username != null'>" +
                    "and u.username like concat('%', #{username}, '%')"+
                "</if>"+
                "<if test='flag != null'>" +
                    "and o.flag = #{flag}"+
                "</if>"+
            "</where>" +
            "</script>")
	@ResultType(Order.class)
	public List<Order> selectByNameAndFlag(@Param("username")String username,@Param("flag")Integer flag);
	//删除订单（admin）
	@Delete("delete from t_order where id=#{id} ")
	int deleteById(int id);
}