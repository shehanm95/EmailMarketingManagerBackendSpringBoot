package com.eastern.emaildatakeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmailDataKeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailDataKeeperApplication.class, args);
	}

}
