package com.kingsoft.springdemo.service;

import com.kingsoft.springdemo.entity.User;

/**
 * company: 金山办公软件股份有限公司
 * user: CHENZUOLI
 * date: 2018/11/14 20:51
 * description:
 */
public abstract class BaseService<T> {

    public abstract User getUserById(String id);

    public abstract User getUserByUid(String uid);

}
