package br.com.alanryan.spring_maven_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SaudacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaudacaoApplication.class, args);
	}

	@Bean
	ApplicationRunner runner() {
		return args -> {
			var saudacaoAlan = new Saudacao("Olá, ", "Alan");
			impressao(saudacaoAlan);
		};
	}

	private void impressao(Saudacao saudacaoAlan) {
		System.out.println(saudacaoAlan);
		System.out.println(saudacaoAlan);
		System.out.println(saudacaoAlan);
		System.out.println(saudacaoAlan);
		System.out.println(saudacaoAlan);
	}
}