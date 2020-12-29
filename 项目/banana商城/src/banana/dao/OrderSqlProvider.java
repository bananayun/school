package banana.dao;

import banana.pojo.Order;
import org.apache.ibatis.jdbc.SQL;

public class OrderSqlProvider {

    public String insertSelective(Order record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_order");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getUaid() != null) {
            sql.VALUES("uaid", "#{uaid,jdbcType=INTEGER}");
        }
        
        if (record.getUid() != null) {
            sql.VALUES("uid", "#{uid,jdbcType=INTEGER}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("createtime", "#{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMoney() != null) {
            sql.VALUES("money", "#{money,jdbcType=BIGINT}");
        }
        
        if (record.getFlag() != null) {
            sql.VALUES("flag", "#{flag,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Order record) {
        SQL sql = new SQL();
        sql.UPDATE("t_order");
        
        if (record.getUaid() != null) {
            sql.SET("uaid = #{uaid,jdbcType=INTEGER}");
        }
        
        if (record.getUid() != null) {
            sql.SET("uid = #{uid,jdbcType=INTEGER}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createtime = #{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMoney() != null) {
            sql.SET("money = #{money,jdbcType=BIGINT}");
        }
        
        if (record.getFlag() != null) {
            sql.SET("flag = #{flag,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}