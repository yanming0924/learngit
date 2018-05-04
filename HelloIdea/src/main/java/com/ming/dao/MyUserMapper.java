package com.ming.dao;

import com.ming.model.MyUser;

import java.util.List;

public interface MyUserMapper{
    /**查询全部*/
    List<MyUser> findAll();
}
