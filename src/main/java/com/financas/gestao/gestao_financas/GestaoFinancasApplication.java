package com.financas.gestao.gestao_financas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
public class GestaoFinancasApplication {
	public static void main(String[] args) {
		SpringApplication.run(GestaoFinancasApplication.class, args);
	}
}
