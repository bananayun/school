package banana.dao;

import banana.pojo.CartDetail;
import org.apache.ibatis.jdbc.SQL;

public class CartDetailSqlProvider {

    public String insertSelective(CartDetail record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_cartdetail");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getCid() != null) {
            sql.VALUES("cid", "#{cid,jdbcType=INTEGER}");
        }
        
        if (record.getGid() != null) {
            sql.VALUES("gid", "#{gid,jdbcType=INTEGER}");
        }
        
        if (record.getNum() != null) {
            sql.VALUES("num", "#{num,jdbcType=INTEGER}");
        }
        
        if (record.getMoney() != null) {
            sql.VALUES("money", "#{money,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CartDetail record) {
        SQL sql = new SQL();
        sql.UPDATE("t_cartdetail");
        
        if (record.getCid() != null) {
            sql.SET("cid = #{cid,jdbcType=INTEGER}");
        }
        
        if (record.getGid() != null) {
            sql.SET("gid = #{gid,jdbcType=INTEGER}");
        }
        
        if (record.getNum() != null) {
            sql.SET("num = #{num,jdbcType=INTEGER}");
        }
        
        if (record.getMoney() != null) {
            sql.SET("money = #{money,jdbcType=BIGINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}