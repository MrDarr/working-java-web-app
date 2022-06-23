package net.javaguides.sms.service;

import java.util.List;


import net.javaguides.sms.entity.Question;

public interface QuestionService {

	List<Question> getAllQuestions();
	
	
	Question saveQuestion(Question question);
	
	
}
