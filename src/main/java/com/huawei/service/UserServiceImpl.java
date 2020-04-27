package com.huawei.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huawei.mapper.UserMapper;
import com.huawei.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findAll() {
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        List<User> userList = userMapper.selectList(null);
        return userList;
    }
}
