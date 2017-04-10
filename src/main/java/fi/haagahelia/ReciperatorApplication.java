package fi.haagahelia;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.domain.Fridge;
import fi.haagahelia.domain.FridgeRepository;

import fi.haagahelia.domain.FaveRecipe;
import fi.haagahelia.domain.FaveRecipeRepository;

@SpringBootApplication
public class ReciperatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReciperatorApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(FridgeRepository repository, FaveRecipeRepository rerepo) {
		return (args) -> {
			
			
			ArrayList<String> weekdays = new ArrayList<>();
			weekdays.add("cheese");
			weekdays.add("tomato");
			ArrayList<String> weekend = new ArrayList<>();
			weekend.add("chicken");
			ArrayList<String> diet = new ArrayList<>();
			diet.add("tomato");
			diet.add("cucumber");
			repository.save(new Fridge("weekdays", "ham", weekdays));
			repository.save(new Fridge("weekend", "chicken", weekend));
			repository.save(new Fridge("diet", "halloumi", diet));
			
			rerepo.save(new FaveRecipe("turkey delight", "https://www.edamam.com/web-img/134/1344cc9d796cb5225f42df9a230e6104.jpg", "http://www.google.com/"));
			
		};	
	}
}
