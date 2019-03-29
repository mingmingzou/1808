package com.qianfeng.fxmall.goods.dao;

import com.qianfeng.fxmall.goods.bean.WxbGood;

import java.util.List;

public interface GoodsDAO {
    List<WxbGood>  queryGoodsByPage(Integer page);
}
