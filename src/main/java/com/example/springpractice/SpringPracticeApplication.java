package com.example.springpractice;

import com.example.springpractice.part3.ch05.ioc.ApplicationContextProvider;
import com.example.springpractice.part3.ch05.ioc.Base64Encoder;
import com.example.springpractice.part3.ch05.ioc.Encoder;
import com.example.springpractice.part3.ch05.ioc.UrlEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.Base64;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
public class SpringPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPracticeApplication.class, args);
		ApplicationContext context = ApplicationContextProvider.getContext();

		Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
		UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);

		String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

//		Encoder encoder = new Encoder(base64Encoder);
//		String result = encoder.encode(url);
//		System.out.println(result);
//
//		encoder.setIEncoder(urlEncoder);
//		result = encoder.encode(url);
//		System.out.println(result);

		Encoder encoder = context.getBean("base64Encode", Encoder.class);
		String result = encoder.encode(url);
		System.out.println(result);
	}

}
