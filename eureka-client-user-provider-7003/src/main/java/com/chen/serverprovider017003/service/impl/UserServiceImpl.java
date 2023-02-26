package com.chen.serverprovider017003.service.impl;

import com.chen.serverprovider017003.bean.User;
import com.chen.serverprovider017003.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author @Chenxc
 * @date 2023年02月25日 23:03
 */
@Service
public class UserServiceImpl implements UserService {
    private static final List<User> USER_LIST = new ArrayList<>();

    static {
        User u1 = new User("",30,170);
        User u2 = new User("",23,165);
        User u3 = new User("",45,180);
        User u4 = new User("",47,150);
        User u5 = new User("",65,180);
        USER_LIST.addAll(Arrays.asList(u1,u2,u3,u4,u5));
    }


    @Override
    public List<User> findAll() {
        return USER_LIST;
    }
}
