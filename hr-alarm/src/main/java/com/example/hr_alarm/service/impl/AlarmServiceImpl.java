package com.example.hr_alarm.service.impl;

import com.example.hr_alarm.service.AlarmService;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@EnableAsync
@EnableScheduling
public class AlarmServiceImpl implements AlarmService {

    /**
     * This is how we set that this function will be executed every hour
     */
    @Scheduled(cron = "0 0 * * * *")
    public void ringAlarm () {
        System.out.println(LocalDateTime.now());
    }
}