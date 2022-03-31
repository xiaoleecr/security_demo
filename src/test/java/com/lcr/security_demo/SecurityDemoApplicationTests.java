package com.lcr.security_demo;

import com.lcr.security_demo.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.StandardCharsets;

@SpringBootTest
class SecurityDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	public static void main(String[] args) {
		byte[] bytes = new byte[]{'a','b','c'};
		System.out.println(new String(bytes, StandardCharsets.UTF_8));
	}

	public void m1(User user1,User user2){
		user2 = new User();
		user2.setUsername("李四");
	}
}
