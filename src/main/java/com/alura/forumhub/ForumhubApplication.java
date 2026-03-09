package com.alura.forumhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ForumhubApplication {

	public static void main(String[] args) {
		// isso serve para que você como adm tester pegue o token mas caso produção retire isso!!
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("123456"));
		SpringApplication.run(ForumhubApplication.class, args);
	}

}
