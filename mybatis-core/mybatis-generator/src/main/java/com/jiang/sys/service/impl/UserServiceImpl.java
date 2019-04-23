package com.jiang.sys.service.impl;

import com.jiang.sys.pojo.User;
import com.jiang.sys.mapper.UserDao;
import com.jiang.sys.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ShiJiang
 * @since 2019-04-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
