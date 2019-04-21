package com.jiang.controller;

import com.jiang.dao.UserInfoDao;
import com.jiang.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * @author ShiJiang
 * @desc oneToMany test demo
 * @date 2019/4/21 10:55 PM
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoDao userInfoDao;


    @RequestMapping("/single")
    @ResponseBody
    public UserInfo single(int id){

        return userInfoDao.findUserInfo(id);
    }


    @RequestMapping("/list")
    @ResponseBody
    public List<UserInfo> list(){

        return userInfoDao.findUserInfoList();
    }


}

/**
 * @author ShiJiang
 * <p>
 * from mybatis-core
 */
