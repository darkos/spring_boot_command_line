package demo.controller;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import demo.model.Word;
import demo.service.WordService;

@Controller
public class HelloController implements CommandLineRunner {

	@Autowired
	private WordService wordService;

	private Logger log = Logger.getLogger(HelloController.class);

	@Override
	public void run(String... args) throws Exception {
		try (Scanner scanner = new Scanner(System.in)) {
			log.info("Enter text for a new word");
			String text = scanner.nextLine();
			while (!text.equalsIgnoreCase("exit")) {
				if (wordService.byText(text) == null) {
					Word word = wordService.createWord(text);
					log.info(String.format("Word with text %s and id %d created!", word.getText(), word.getId()));

				} else {
					log.error(String.format("Word with text %s does already exist!", text));
				}
				log.info("Restart the application to creat additional words");
				text = scanner.nextLine();
			}
		}
	}
}
