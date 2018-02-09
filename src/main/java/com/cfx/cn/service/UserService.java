package com.cfx.cn.service;

/**
 * Created by likun on 2018/2/9 0009.
 */
import com.cfx.cn.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public interface UserService {

    @WebMethod
    String getName(@WebParam(name = "userId") String userId);
    @WebMethod
    User getUser(String userId);
}
