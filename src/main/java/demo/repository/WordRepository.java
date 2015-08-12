package demo.repository;

import org.springframework.data.repository.CrudRepository;

import demo.model.Word;

public interface WordRepository extends CrudRepository<Word, Long> {

	public Word findByText(String text);
}
