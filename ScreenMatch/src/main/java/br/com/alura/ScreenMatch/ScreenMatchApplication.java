package br.com.alura.ScreenMatch;

import br.com.alura.ScreenMatch.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {


	public static void main(String[] args) {

		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();

//		List<DadosTemporadas> temporadas = new ArrayList<>();
//
//		for (int i = 1; i <= dados.totalTemporadas() ; i++) {
//			json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i +"&apikey=b6ae4f45");
//			DadosTemporadas dadosTemp = conversor.obterDados(json, DadosTemporadas.class);
//			temporadas.add(dadosTemp);
//		}
//		temporadas.forEach(System.out::println);
	}





}