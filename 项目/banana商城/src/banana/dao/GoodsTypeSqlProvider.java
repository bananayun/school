package banana.dao;

import banana.pojo.GoodsType;
import org.apache.ibatis.jdbc.SQL;

public class GoodsTypeSqlProvider {

    public String insertSelective(GoodsType record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_goodstype");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getGrade() != null) {
            sql.VALUES("grade", "#{grade,jdbcType=INTEGER}");
        }
        
        if (record.getParentname() != null) {
            sql.VALUES("parentname", "#{parentname,jdbcType=VARCHAR}");
        }
        
        if (record.getFlag() != null) {
            sql.VALUES("flag", "#{flag,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(GoodsType record) {
        SQL sql = new SQL();
        sql.UPDATE("t_goodstype");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getGrade() != null) {
            sql.SET("grade = #{grade,jdbcType=INTEGER}");
        }
        
        if (record.getParentname() != null) {
            sql.SET("parentname = #{parentname,jdbcType=VARCHAR}");
        }
        
        if (record.getFlag() != null) {
            sql.SET("flag = #{flag,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}