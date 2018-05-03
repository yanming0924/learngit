package com.ming.dao;

import com.ming.model.MyUser;

import java.util.List;

public interface MyUserMapper{

    List<MyUser> findAll();
}