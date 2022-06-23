package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;


import net.javaguides.sms.entity.Question;
import net.javaguides.sms.repository.QuestionRepository;
import net.javaguides.sms.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	
	private QuestionRepository questionRepository;
	
	
	public QuestionServiceImpl(QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}


	@Override
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}


	@Override
	public Question saveQuestion(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

}
