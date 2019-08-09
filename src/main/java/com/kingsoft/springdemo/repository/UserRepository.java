package com.kingsoft.springdemo.repository;

import com.kingsoft.springdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * company: 金山办公软件股份有限公司
 * user: chenzuoli
 * date: 2018/11/13 21:20
 * description:
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findUserById(String id);
    User findUserByUid(String uid);

}
