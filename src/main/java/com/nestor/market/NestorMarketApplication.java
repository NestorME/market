package com.nestor.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.nestor.market.persistence.mapper.ProductMapper"})
public class NestorMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(NestorMarketApplication.class, args);
	}

}
