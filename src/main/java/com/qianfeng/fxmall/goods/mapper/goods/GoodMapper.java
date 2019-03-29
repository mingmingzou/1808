package com.qianfeng.fxmall.goods.mapper.goods;

import com.qianfeng.fxmall.goods.bean.WxbGood;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodMapper {
    List<WxbGood>  queryGoodsByPage(@Param("page") Integer page,@Param("size") Integer size);
}
