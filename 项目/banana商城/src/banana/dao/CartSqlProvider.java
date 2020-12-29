package banana.dao;

import banana.pojo.Cart;
import org.apache.ibatis.jdbc.SQL;

public class CartSqlProvider {

    public String insertSelective(Cart record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_cart");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUid() != null) {
            sql.VALUES("uid", "#{uid,jdbcType=INTEGER}");
        }
        
        if (record.getMoney() != null) {
            sql.VALUES("money", "#{money,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Cart record) {
        SQL sql = new SQL();
        sql.UPDATE("t_cart");
        
        if (record.getUid() != null) {
            sql.SET("uid = #{uid,jdbcType=INTEGER}");
        }
        
        if (record.getMoney() != null) {
            sql.SET("money = #{money,jdbcType=BIGINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}