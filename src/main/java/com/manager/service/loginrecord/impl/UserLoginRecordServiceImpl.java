package com.manager.service.loginrecord.impl;

import org.springframework.stereotype.Service;

import com.manager.common.service.impl.BaseServiceImpl;
import com.manager.dao.loginrecord.UserLoginRecordDao;
import com.manager.entity.loginrecord.UserLoginRecord;
import com.manager.service.loginrecord.UserLoginRecordService;

@Service
public class UserLoginRecordServiceImpl extends BaseServiceImpl<UserLoginRecord,UserLoginRecordDao> implements UserLoginRecordService {

}
