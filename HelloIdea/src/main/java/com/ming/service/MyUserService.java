package com.ming.service;

import com.ming.model.MyUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/27.
 */
@Service
public interface MyUserService {
   MyUser getUserByName();
   List<MyUser> findAll();
}
