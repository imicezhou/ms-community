package com.neo.mcframe;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableDubbo
public class MCFrameApplication {

	public static void main(String[] args) {
		SpringApplication.run(MCFrameApplication.class, args);
	}

}
