package com.jiang.dao;

import com.jiang.pojo.PostInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ShiJiang
 * @desc
 * @date 2019/4/21 11:17 PM
 */
@Repository
public interface PostInfoDao {


    List<PostInfo> findPostList();

    PostInfo findPostInfo(int id);


}
