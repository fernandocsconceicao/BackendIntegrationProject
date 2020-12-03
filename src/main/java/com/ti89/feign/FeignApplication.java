package com.ti89.feign;

import com.ti89.feign.services.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignApplication implements CommandLineRunner {
	@Autowired
	private CovidService covidService;

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(covidService.covidPorEstado("sp").cases);
	}
}
