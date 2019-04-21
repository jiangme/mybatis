package com.jiang.controller;

import com.jiang.dao.UserDao;
import com.jiang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ShiJiang
 * @desc
 * @date 2019/4/21 8:45 PM
 */
@Controller
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/list")
    @ResponseBody
    public List<User> list(){

        return userDao.findUserList();
    }


}

/**
 * @author ShiJiang
 * <p>
 * from mybatis-core
 */
