package banana.dao;

import banana.pojo.OrderDetail;
import org.apache.ibatis.jdbc.SQL;

public class OrderDetailSqlProvider {

    public String insertSelective(OrderDetail record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_orderdetail");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getGid() != null) {
            sql.VALUES("gid", "#{gid,jdbcType=INTEGER}");
        }
        
        if (record.getOid() != null) {
            sql.VALUES("oid", "#{oid,jdbcType=VARCHAR}");
        }
        
        if (record.getMoney() != null) {
            sql.VALUES("money", "#{money,jdbcType=BIGINT}");
        }
        
        if (record.getNum() != null) {
            sql.VALUES("num", "#{num,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(OrderDetail record) {
        SQL sql = new SQL();
        sql.UPDATE("t_orderdetail");
        
        if (record.getGid() != null) {
            sql.SET("gid = #{gid,jdbcType=INTEGER}");
        }
        
        if (record.getOid() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        
        if (record.getMoney() != null) {
            sql.SET("money = #{money,jdbcType=BIGINT}");
        }
        
        if (record.getNum() != null) {
            sql.SET("num = #{num,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}