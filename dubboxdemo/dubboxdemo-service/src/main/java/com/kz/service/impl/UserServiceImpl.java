package com.kz.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kz.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    public String getName() {

        return "itcats";

    }
}
