package com.wayn.admin.api.mapper.shop;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wayn.admin.api.domain.shop.Goods;

/**
 * <p>
 * 商品基本信息表 Mapper 接口
 * </p>
 *
 * @author wayn
 * @since 2020-07-06
 */
public interface GoodsMapper extends BaseMapper<Goods> {

    IPage<Goods> selectGoodsListPage(Page<Goods> page, Goods goods);
}