package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import net.javaguides.sms.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, String > {

	
	
	
}
