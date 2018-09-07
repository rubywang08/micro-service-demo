package com.my.service;

import com.my.abs.AbstractRequest;
import com.my.abs.AbstractResponse;

public interface IUserService {

    AbstractResponse createUser(AbstractRequest request);
}
