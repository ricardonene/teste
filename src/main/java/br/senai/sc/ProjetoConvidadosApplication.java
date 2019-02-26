package br.senai.sc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.senai.sc.domain.Convidado;
import br.senai.sc.repositories.ConvidadoRepository;

@SpringBootApplication
public class ProjetoConvidadosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoConvidadosApplication.class, args);
	}

	@Autowired
	private ConvidadoRepository convidadoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Convidado c = new Convidado(null, "José", true);
		
		convidadoRepository.save(c);
		
	}

}
