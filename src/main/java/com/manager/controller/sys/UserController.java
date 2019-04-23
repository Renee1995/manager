package com.manager.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manager.common.aop.logger.LoggerManage;
import com.manager.common.web.ResponseUtil;
import com.manager.common.web.Result;
import com.manager.service.sys.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    @LoggerManage(description="获取用户")
    public Result userList() {
        if(1/0==0){

        }
        return ResponseUtil.success(userService.queryAllList());
    }
}
