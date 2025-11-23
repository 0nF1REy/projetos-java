package br.com.alan.screenmatch;

import br.com.alan.screenmatch.models.DadosSerie;
import br.com.alan.screenmatch.principal.Principal;
import br.com.alan.screenmatch.services.ConsumoApi;
import br.com.alan.screenmatch.services.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
