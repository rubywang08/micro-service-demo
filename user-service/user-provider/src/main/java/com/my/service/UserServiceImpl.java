package com.my.service;

import com.my.abs.AbstractRequest;
import com.my.abs.AbstractResponse;

public class UserServiceImpl implements IUserService{
    @Override
    public AbstractResponse createUser(AbstractRequest request) {
        System.out.println("test success");
        return null;
    }
}
