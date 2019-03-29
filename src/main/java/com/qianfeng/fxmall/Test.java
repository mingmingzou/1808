package com.qianfeng.fxmall;

import com.qianfeng.fxmall.goods.bean.WxbGood;
import com.qianfeng.fxmall.goods.dao.GoodsDAO;
import com.qianfeng.fxmall.goods.dao.Impl.GoodsDAOImpl;

import java.util.List;
/*
B改
//副本
* 第二次提交
* */
public class Test {

    public static void  main(String[] args){
        GoodsDAO goodsDAO=new GoodsDAOImpl();
        List<WxbGood> goods = goodsDAO.queryGoodsByPage(0);
        System.out.println(goods.get(0).getGoodName());
    }
}
