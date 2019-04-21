package com.jiang.dao;

import com.jiang.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ShiJiang
 * @desc
 * @date 2019/4/21 10:40 PM
 */
@Repository
public interface UserInfoDao {


    UserInfo findUserInfo(@Param("userId") int id);

    List<UserInfo> findUserInfoList();

}
