package banana.dao;

import banana.pojo.Goods;
import org.apache.ibatis.jdbc.SQL;

public class GoodsSqlProvider {

    public String insertSelective(Goods record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_goods");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("price", "#{price,jdbcType=BIGINT}");
        }
        
        if (record.getPubdate() != null) {
            sql.VALUES("pubdate", "#{pubdate,jdbcType=DATE}");
        }
        
        if (record.getTypename() != null) {
            sql.VALUES("typename", "#{typename,jdbcType=VARCHAR}");
        }
        
        if (record.getIntro() != null) {
            sql.VALUES("intro", "#{intro,jdbcType=VARCHAR}");
        }
        
        if (record.getPicture() != null) {
            sql.VALUES("picture", "#{picture,jdbcType=VARCHAR}");
        }
        
        if (record.getFlag() != null) {
            sql.VALUES("flag", "#{flag,jdbcType=INTEGER}");
        }
        
        if (record.getStar() != null) {
            sql.VALUES("star", "#{star,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Goods record) {
        SQL sql = new SQL();
        sql.UPDATE("t_goods");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{price,jdbcType=BIGINT}");
        }
        
        if (record.getPubdate() != null) {
            sql.SET("pubdate = #{pubdate,jdbcType=DATE}");
        }
        
        if (record.getTypename() != null) {
            sql.SET("typename = #{typename,jdbcType=VARCHAR}");
        }
        
        if (record.getIntro() != null) {
            sql.SET("intro = #{intro,jdbcType=VARCHAR}");
        }
        
        if (record.getPicture() != null) {
            sql.SET("picture = #{picture,jdbcType=VARCHAR}");
        }
        
        if (record.getFlag() != null) {
            sql.SET("flag = #{flag,jdbcType=INTEGER}");
        }
        
        if (record.getStar() != null) {
            sql.SET("star = #{star,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}