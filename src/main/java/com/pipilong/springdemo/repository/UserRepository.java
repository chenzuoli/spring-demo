package com.pipilong.springdemo.repository;

import com.pipilong.springdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * company: wetech
 * user: chenzuoli
 * date: 2018/11/13 21:20
 * description:
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findUserById(String id);
    User findUserByUid(String uid);

}
