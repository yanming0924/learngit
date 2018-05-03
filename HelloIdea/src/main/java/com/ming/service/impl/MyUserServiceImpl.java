package com.ming.service.impl;

import com.ming.model.MyUser;
import com.ming.dao.MyUserMapper;
import com.ming.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by Administrator on 2018/4/27.
 */
@Service("myUserService")
public class MyUserServiceImpl implements MyUserService {
    @Autowired
    private MyUserMapper myUserMapper;

    public MyUser getUserByName() {
        MyUser myUser=new MyUser();
        myUser.setName("yy");
        return myUser;
    }

    public List<MyUser> findAll() {
        return myUserMapper.findAll();
    }
}
