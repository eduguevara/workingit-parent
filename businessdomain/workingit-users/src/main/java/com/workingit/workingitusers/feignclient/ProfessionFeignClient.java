package com.workingit.workingitusers.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.workingit.workingitusers.model.Profession;


@FeignClient(name = "profession-service", url = "http://PROFESSION-SERVICE", path = "/api")
public interface ProfessionFeignClient {
	
	@PostMapping("/profession")
	Profession saveProfession (@RequestBody Profession profession);

}
