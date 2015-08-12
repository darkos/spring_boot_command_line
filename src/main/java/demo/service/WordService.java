package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.model.Word;
import demo.repository.WordRepository;

@Service
public class WordService {

	@Autowired
	private WordRepository repository;

	public Word createWord(String text) {
		Word word = new Word();
		word.setText(text);
		return repository.save(word);
	}

	public Word byText(String text) {
		return repository.findByText(text);
	}

}
