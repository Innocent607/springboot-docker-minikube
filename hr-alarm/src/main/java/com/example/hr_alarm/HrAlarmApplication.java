package com.example.hr_alarm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class HrAlarmApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrAlarmApplication.class, args);
	}

}
