package com.jiang.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ShiJiang
 * @desc
 * @date 2019/4/21 10:38 PM
 */
@Setter
@Getter
@NoArgsConstructor
public class PostInfo {

    private int id;

    private UserInfo userInfo;

    private String title;

    private String content;

}

/**
 * @author ShiJiang
 * <p>
 * from mybatis-core
 */
