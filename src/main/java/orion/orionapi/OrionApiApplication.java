package orion.orionapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "orion.orionapi")
public class OrionApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrionApiApplication.class, args);
	}

}
