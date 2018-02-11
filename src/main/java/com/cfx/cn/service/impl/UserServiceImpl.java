package com.cfx.cn.service.impl;

/**
 * Created by likun on 2018/2/9 0009.
 */
import com.cfx.cn.entity.User;
import com.cfx.cn.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;



import javax.jws.WebService;


@WebService(targetNamespace="http://service.cn.cfx.com/",endpointInterface = "com.cfx.cn.service.UserService")
public class UserServiceImpl implements UserService {

    private Map<String, User> userMap = new HashMap<String, User>();
    public UserServiceImpl() {
        System.out.println("向实体类插入数据");
        User user = new User();
        user.setUserId("411001");
        user.setUsername("zhansan");
        user.setAge("20");
        user.setUpdateTime(new Date());
        userMap.put(user.getUserId(), user);

        user = new User();
        user.setUserId("411002");
        user.setUsername("lisi");
        user.setAge("30");
        user.setUpdateTime(new Date());
        userMap.put(user.getUserId(), user);

        user = new User();
        user.setUserId("411003");
        user.setUsername("wangwu");
        user.setAge("40");
        user.setUpdateTime(new Date());
        userMap.put(user.getUserId(), user);
    }
    @Override
    public String getName(String userId) {
        return "liyd-" + userId;
    }
    @Override
    public User getUser(String userId) {
        System.out.println("userMap是:"+userMap);
        return userMap.get(userId);
    }

}
