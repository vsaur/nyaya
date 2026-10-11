package com.nyaya;

import org.springframework.boot.SpringApplication;

public class TestNyayaApplication {

	public static void main(String[] args) {
		SpringApplication.from(NyayaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
