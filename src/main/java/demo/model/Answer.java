package demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String answer;
	public long getId() {
		return id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
