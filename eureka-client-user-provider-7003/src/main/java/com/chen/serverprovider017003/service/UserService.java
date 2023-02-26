package com.chen.serverprovider017003.service;

import com.chen.serverprovider017003.bean.User;

import java.util.List;

/**
 * @author @Chenxc
 * @date 2023年02月25日 23:03
 */
public interface UserService {

    List<User> findAll();
}
