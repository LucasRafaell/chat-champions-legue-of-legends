package com.LucasRafaell.lolchat;

import com.LucasRafaell.lolchat.application.ListChampionsUseCase;
import com.LucasRafaell.lolchat.domain.ports.ChampionsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository repository){
		return new ListChampionsUseCase(repository);
	}
}
