package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;


@SpringBootApplication
public class SpringMybatisExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisExampleApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
//	@Bean
//	public void test() {
//		User user = new User();
//		user.setId(1L);
//		user.setEmail("test@asd.com");
//		user.setPassword("1234abcd");
//		user.setJoinedDate(LocalDateTime.now());
//		userRepository.createUser(user);
//	}
//	
//	@Bean
//	public void test1() {
//		User user = userRepository.findById(1);
//		System.out.println(user); // 하나만 출력
//		System.out.println(userRepository.findAll()); //모두 출력
//		user.setEmail("abc@der.com"); // user 이메일 변경
//		userRepository.updateUser(user);
//		userRepository.deleteUser(3); // user 삭제
//	}
}
