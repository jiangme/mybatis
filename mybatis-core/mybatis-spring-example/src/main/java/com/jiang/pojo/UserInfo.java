package com.jiang.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author ShiJiang
 * @desc 用来测试一对多案例
 * @date 2019/4/21 10:36 PM
 */
@Setter
@Getter
public class UserInfo implements Serializable {

    private int id;
    private String userName;
    private String mobile;
    private List<PostInfo> posts;

}

/**
 * @author ShiJiang
 * <p>
 * from mybatis-core
 */
