package com.example.springpractice;

import com.example.springpractice.part3.ch04.object_mapper.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringPracticeApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {

		// Object Mapper

		// text json -> object
		// object -> text json

		// controller
		// req json(text) -> object
		// res object -> json(text)

		var objectMapper = new ObjectMapper();

		// object -> text
		// Object Mapper, get method 활용
		var user = new User("A", 10, "010-1111-2222");
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		// text -> object
		// Object Mapper, default 생성자 필요
		var objectUser = objectMapper.readValue(text, User.class);
		System.out.println(objectUser);

	}

}
