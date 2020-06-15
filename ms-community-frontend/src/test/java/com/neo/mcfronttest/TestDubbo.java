package com.neo.mcfronttest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.neo.mcfront.controller.UserController;

@SpringBootTest
public class TestDubbo {

	@Autowired
	UserController userCtrl;
	
	@Test
	void test() {
		
		String ex = userCtrl.checkUserExists(1);
		System.out.println("======" + ex + "======");
	}
	
}
