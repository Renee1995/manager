package com.manager.controller.loginrecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.manager.common.aop.logger.LoggerManage;
import com.manager.common.web.ResponseUtil;
import com.manager.common.web.Result;
import com.manager.service.loginrecord.UserLoginRecordService;

@RestController
@RequestMapping("/userLoginRecord")
public class UserLoginRecordController {
    @Autowired
    private UserLoginRecordService userLoginRecordService;


    @RequestMapping(value = "/getLoginRecordList", method = RequestMethod.GET)
    @LoggerManage(description="获取用户登录记录")
    @ResponseBody
    public Result getLoginRecordList() {

        return ResponseUtil.success(userLoginRecordService.queryAllList());
    }

    @RequestMapping(value = "/getLoginRecordPage", method = RequestMethod.GET)
    @LoggerManage(description="获取用户登录记录分页")
    @ResponseBody
    public Result getLoginRecordPage(@RequestParam(value="page",required=false,defaultValue="1") Integer page,
                                     @RequestParam(value="size",required=false,defaultValue="10") Integer size) {

        return ResponseUtil.success(userLoginRecordService.queryPageListByWhere(page,size,null));
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @LoggerManage(description="根据id获取用户登录记录")
    @ResponseBody
    public Result getLoginRecordPage(@PathVariable("id")String id) {

        return ResponseUtil.success(userLoginRecordService.queryById(id));
    }

}
