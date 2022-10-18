package com.workingit.workingitprofession;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class WorkingitProfessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkingitProfessionApplication.class, args);
	}
	

	@Bean
	public GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder()
				.group("springshop-public")
				.packagesToScan("com.workingit")
		        .build();
	}

}
