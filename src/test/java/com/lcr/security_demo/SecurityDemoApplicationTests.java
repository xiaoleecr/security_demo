package com.lcr.security_demo;

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
}
