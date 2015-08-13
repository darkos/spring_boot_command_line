package demo.controller;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import demo.model.Question;
import demo.service.QuestAndAnswService;
import demo.service.WordService;

@Controller
public class HelloController implements CommandLineRunner {

	@Autowired
	private WordService wordService;
	
	@Autowired
	private QuestAndAnswService qandaService;
	

	private Logger log = Logger.getLogger(HelloController.class);

	/*@Override
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
	}*/
	
	@Override
	public void run(String... args) throws Exception {
		try (Scanner scanner = new Scanner(System.in)) {
			log.info("Enter new command or type exit to exit");
			String text = scanner.nextLine();
			while (!text.equalsIgnoreCase("exit")) {
				if (text.equalsIgnoreCase("cquest")) {
					Question q = qandaService.createSampleQuestion();
					log.info("Question created:" + q.toString());
				} else if (text.equalsIgnoreCase("dquest")) {
					String deleted = qandaService.deleteSampleQuestion();
					log.info("Question deleted:" + deleted);
				} else if (text.equalsIgnoreCase("cquestanda")) {
					Question q = qandaService.createSampleQuestionAndSampleAnswer();
					log.info("Question and Answer created:" + q.toString());
				} else if (text.equalsIgnoreCase("loadtestdata")) {
					qandaService.loadTestData();
				} else {
					log.info("Enter new command or type exit to exit");
				}
				text = scanner.nextLine();
			}
		}
	}
	
	
}
