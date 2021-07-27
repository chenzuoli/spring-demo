package com.pipilong.springdemo.service;

import com.pipilong.springdemo.entity.User;

/**
 * company: wetech
 * user: chenzuoli
 * date: 2018/11/14 20:51
 * description:
 */
public abstract class BaseService<T> {

    public abstract User getUserById(String id);

    public abstract User getUserByUid(String uid);

}
