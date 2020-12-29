/**
 * @author Feri
 */
package banana.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import banana.common.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import banana.dao.GoodsDao;
import banana.pojo.Goods;
import banana.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao dao;

    @Override
    public boolean save(Goods goods) {
        goods.setPrice(goods.getPrice());
        return dao.save(goods) > 0;
    }

    @Override
    public List<Goods> queryAll() {
        return dao.queryAll();
    }

    @Override
    public Goods querySingle(int id) {
        return dao.querySingle(id);
    }

    @Override
    public List<Goods> queryByType(String type) {
        return dao.queryByType(type);
    }

    @Override
    public List<List<Goods>> queryIndex() {
        List<List<Goods>> list = new ArrayList<List<Goods>>();
        list.add(dao.queryIndex("笔记本电脑"));
        list.add(dao.queryIndex("显示器"));
        list.add(dao.queryIndex("手机"));
        return list;
    }

    @Override
    public List<Goods> queryByName(String name) {
        //模糊查询
        return dao.queryName(name);
    }

    @Override
    public List<Goods> queryNameAndPub(String name, String pubdate) {
        if (name != null && "".equals(name)) {
            name = null;
        }
        if (pubdate != null && "".equals(pubdate)) {
            pubdate = null;
        }
        // 根据商品名称和上架时间查询商品（admin）
        return dao.queryNameAndPub(name, pubdate);
    }

    @Override
    public int deleteById(int id) {
        // 删除商品
        return dao.deleteById(id);
    }
}