package net.javaguides.sms.controller;

import net.javaguides.sms.entity.Question;
import net.javaguides.sms.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class QuestionController {

	
	private QuestionService questionService;

	public QuestionController(QuestionService questionService) {
		super();
		this.questionService = questionService;
	}
	
	@GetMapping("/questions")
	public String listQuestions(Model model) {
		
		model.addAttribute("question", questionService.getAllQuestions());
		
		
		
		return "questions";
		
	}
	
	@GetMapping("/questions/new")
	public String createQuestionForm(Model model) {
		Question question = new Question();
		model.addAttribute("question", question);
		return "create_question";
		
		
	}
	
	@PostMapping("/questions")
	public String saveQuestion(@ModelAttribute("question")Question question) {
		questionService.saveQuestion(question);
		return "redirect:/questions";
		
		
		
	}
	
	
	
	
}
