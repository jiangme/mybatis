package com.jiang.sys.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jiang.sys.pojo.User;
import com.jiang.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ShiJiang
 * @since 2019-04-23
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *
     * 展示列表
     *
     * @return
     */
    @GetMapping("/list")
    public Object list(){

        return userService.list();
    }

    /**
     * 分页实例
     *
     * @param page
     *
     * @param size
     *
     * @return
     */
    @GetMapping("/page")
    public IPage<User> page(@RequestParam(defaultValue = "1", required = false) int page,
                            @RequestParam(defaultValue = "2", required = false) int size){

        return userService.page(new Page<>(page, size));
    }





}
