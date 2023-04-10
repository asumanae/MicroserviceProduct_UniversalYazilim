package com.universal_yazilim.bid.ysm.product_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class MicroserviceProductApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceProductApplication.class, args);
	}

}
