package com.ming.controller;

import com.ming.model.MyUser;
import com.ming.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/4/27.
 */
@Controller
public class UserControl {
    @Autowired
    private MyUserService myUserService;
    @RequestMapping("/user/byName")
    public MyUser getUserByName(){
        return myUserService.getUserByName();
    }

    @RequestMapping("/find")
    public String find(ModelMap model, HttpServletRequest request){
        List<MyUser> deptList=myUserService.findAll();
        //将获取到的数据存入ModelMap中，以便页面取出
        model.addAttribute("depts", deptList);
        return "dept";
    }
}
