package com.nostalgia.mybatis_plus.service.impl;

import com.nostalgia.mybatis_plus.entity.Product;
import com.nostalgia.mybatis_plus.mapper.ProductMapper;
import com.nostalgia.mybatis_plus.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author nostalgia
 * @since 2020-07-11
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
