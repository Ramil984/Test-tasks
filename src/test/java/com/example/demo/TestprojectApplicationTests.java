package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RestController;
@SpringBootTest
@RestController
class TestprojectApplicationTests {

	@Get /users/v1
	void contextLoads() {
	}

}
