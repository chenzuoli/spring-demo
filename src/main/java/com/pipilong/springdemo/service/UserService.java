package com.pipilong.springdemo.service;

import com.pipilong.springdemo.entity.User;
import com.pipilong.springdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * company: wetech
 * user: chenzuolil
 * date: 2018/11/14 20:53
 * description:
 */
@Service
public class UserService extends BaseService<User> {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserById(String id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User getUserByUid(String uid) {
        return userRepository.findUserByUid(uid);
    }
}
