package com.qianfeng.fxmall.goods.dao.Impl;

import com.qianfeng.fxmall.commons.info.FINALL;
import com.qianfeng.fxmall.commons.mybatis.SqlSessionU;
import com.qianfeng.fxmall.goods.bean.WxbGood;
import com.qianfeng.fxmall.goods.dao.GoodsDAO;
import com.qianfeng.fxmall.goods.mapper.goods.GoodMapper;

import java.util.List;

public class GoodsDAOImpl implements GoodsDAO {

    @Override
    public List<WxbGood> queryGoodsByPage(Integer page) {
        GoodMapper goodMapper= SqlSessionU.getSession().getMapper(GoodMapper.class);
        List<WxbGood> goods=goodMapper.queryGoodsByPage(page, FINALL.Page.PAGE_SIZE);
        return goods;
    }
}
