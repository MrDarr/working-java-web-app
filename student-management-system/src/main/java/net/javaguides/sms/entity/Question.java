package net.javaguides.sms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Column;



@Entity
@Table(name ="first")
public class Question {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;

	@Id
	@Column(name = "questions", nullable = false )
	private String question;
	
	public Question() {
		
	}
	public Question(String question) {
		super();
		this.question = question;
	}



//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
}
