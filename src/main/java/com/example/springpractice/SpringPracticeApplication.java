package com.example.springpractice;

import com.example.springpractice.part3.ch05.ioc.ApplicationContextProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@ServletComponentScan
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
public class SpringPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPracticeApplication.class, args);
	}

}
