package com.pipilong.springdemo.controller;

import com.pipilong.springdemo.entity.User;
import com.pipilong.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * company: wetech
 * user: chenzuoli
 * date: 2018/11/13 20:12
 * description: user controller
 */
@RestController
@RequestMapping("/user_home")
public class UserController {

    @Autowired
    JdbcTemplate jdbc;

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "{\"name\": \"Hello Spring boot.\"}";
    }

    /**
     * description: 传递参数
     * param: [userId]
     * return: java.lang.String
     * time: 2018/11/13 20:48
     */
    @RequestMapping("/getuserid")
    public String getUserId(@RequestParam String userId) {
        return userId;
    }

    @RequestMapping("/getuserbyid")
    public User getUserById(@RequestParam String id) {
        System.out.println("get user " + id + "'s information!");
        return userService.getUserById(id);
    }

//    @RequestMapping("/getuserbyuid")
    @GetMapping("/getUserByUid/{uid}")
    public User getUserByUid(@PathVariable("uid") String uid) {
        System.out.println("get user " + uid + "'s information!");
        return userService.getUserByUid(uid);
    }

    @RequestMapping("/getusers")
    public List<User> getUser() {
        String sql = "select * from users";
        System.out.println("查询的sql: ");
        System.out.println(sql);
        List<Map<String, Object>> users = jdbc.queryForList(sql);
        ArrayList<User> userList = new ArrayList<>();
        for (Map<String, Object> userMap : users) {
            User user = new User();
            user.setId(userMap.get("id") == null ? "" : userMap.get("id").toString());
            user.setUid(userMap.get("uid") == null ? "" : userMap.get("uid").toString());
            user.setUname(userMap.get("uname") == null ? "" : userMap.get("uname").toString());
            user.setMobile(userMap.get("mobile") == null ? "" : userMap.get("mobile").toString());
            user.setEmail(userMap.get("email") == null ? "" : userMap.get("email").toString());
            user.setQq(userMap.get("qq") == null ? "" : userMap.get("qq").toString());
            user.setWechat(userMap.get("wechat") == null ? "" : userMap.get("wechat").toString());
            user.setPassword(userMap.get("password") == null ? "" : userMap.get("password").toString());
            user.setCreatetime(userMap.get("createtime") == null ? "" : userMap.get("createtime").toString());
            user.setUpdatetime(userMap.get("updatetime") == null ? "" : userMap.get("updatetime").toString());
            userList.add(user);
        }
        return userList;
    }

}
