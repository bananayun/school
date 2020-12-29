/**
* @author Feri
*/ 
package banana.dao;
import banana.pojo.GoodsType;
import org.apache.ibatis.annotations.*;

import java.util.List;
public interface GoodsTypeDao {
	//新增
	@Insert("insert into t_goodstype(name,grade,parentname,flag) values(#{name},#{grade},#{parentname},1)")
	int save(GoodsType gt);
	//查询一级类型
	@Select("select * from t_goodstype where grade=1")
	@ResultType(GoodsType.class)
	List<GoodsType> queryByGrade();
	//查询全部
	@Select("select * from t_goodstype")
	@ResultType(GoodsType.class)
	List<GoodsType> queryAll();
	//根据商品等级和商品名称查询商品（admin）
	@Select("select * from t_goodstype where grade=#{flag} and name=#{name}")
	@ResultType(GoodsType.class)
	public List<GoodsType> queryNameAndFlag(@Param("name")String name, @Param("flag")int flag);
	//根据id删除商品类型
	@Delete("delete from  t_goodstype where id=#{id}")
	public int deleteType(@Param("id")int tid);
}