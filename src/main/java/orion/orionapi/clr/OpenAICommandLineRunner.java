package orion.orionapi.clr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import orion.orionapi.donation.service.OpenAIService;

import java.util.Scanner;

@Component
public class OpenAICommandLineRunner implements CommandLineRunner {

    @Autowired
    OpenAIService openAIService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Enter question.");
        Scanner scanner = new Scanner(System.in);
        openAIService.complete(scanner.nextLine());
    }
}
