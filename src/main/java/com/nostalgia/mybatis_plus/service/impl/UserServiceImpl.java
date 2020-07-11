package com.nostalgia.mybatis_plus.service.impl;

import com.nostalgia.mybatis_plus.entity.User;
import com.nostalgia.mybatis_plus.mapper.UserMapper;
import com.nostalgia.mybatis_plus.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
