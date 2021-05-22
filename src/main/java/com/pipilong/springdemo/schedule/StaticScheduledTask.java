package com.pipilong.springdemo.schedule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * Created by user chenzuoli on 2021/5/22 10:09
 * description: 定时器（注解方式）
 */
@Configuration // 1.用于标记配置类
@EnableScheduling // 2.开启定时任务
public class StaticScheduledTask {

    // 3.添加定时任务
    @Scheduled(cron = "*/5 * * * * ?")
    private void configureTask() {
        System.err.println("执行静态定时任务时间：" + LocalDateTime.now());
    }
}
