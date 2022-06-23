package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Question;
import net.javaguides.sms.repository.QuestionRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired 
	private QuestionRepository questionRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
//		Question question1 = new Question("Does this show");
//		questionRepository.save(question1);
//		
//		Question question2 = new Question("please make this work");
//		questionRepository.save(question2);
//		
		
		
	}

	
	
}
