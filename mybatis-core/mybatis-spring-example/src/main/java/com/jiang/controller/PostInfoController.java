package com.jiang.controller;

import com.jiang.dao.PostInfoDao;
import com.jiang.pojo.PostInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ShiJiang
 * @desc
 * @date 2019/4/21 11:28 PM
 */
@Controller
@RequestMapping("/postInfo")
public class PostInfoController {

    @Autowired
    private PostInfoDao postInfoDao;

    @RequestMapping("/single")
    @ResponseBody
    public PostInfo findPostInfo(int id){

        return postInfoDao.findPostInfo(id);
    }


    @RequestMapping("/list")
    @ResponseBody
    public List<PostInfo> list(){

        return postInfoDao.findPostList();
    }


}

/**
 * @author ShiJiang
 * <p>
 * from mybatis-core
 */
