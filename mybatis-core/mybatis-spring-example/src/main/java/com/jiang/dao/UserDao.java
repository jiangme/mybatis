package com.jiang.dao;

import com.jiang.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ShiJiang
 * @desc
 * @date 2019/4/21 8:41 PM
 */
@Repository
public interface UserDao {

    List<User> findUserList();

}
