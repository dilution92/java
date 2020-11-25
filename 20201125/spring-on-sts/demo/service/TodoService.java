package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("/")
public class TodoService {
	
	public void test() {
		System.out.println("테스트 호출됨");
	}
	
}
