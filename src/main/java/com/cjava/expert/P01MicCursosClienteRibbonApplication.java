package com.cjava.expert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name="cjava-cursos")
@EnableFeignClients
@SpringBootApplication
public class P01MicCursosClienteRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(P01MicCursosClienteRibbonApplication.class, args);
	}

}
