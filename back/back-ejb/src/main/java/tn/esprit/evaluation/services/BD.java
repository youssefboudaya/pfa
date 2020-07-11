package tn.esprit.evaluation.services;

import java.sql.Date;
import java.text.Format;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.esprit.evaluation.entities.Answer;
import tn.esprit.evaluation.entities.EvaluationDecision;
import tn.esprit.evaluation.entities.EvaluationSheet;
import tn.esprit.evaluation.entities.EvaluationType;
import tn.esprit.evaluation.entities.Indicator;
import tn.esprit.evaluation.entities.Question;
import tn.esprit.timesheet.entities.User;
import tn.esprit.timesheet.services.interfaces.UserServices;

@Startup
@Singleton
public class BD {

	@EJB
	UserServices userService;
	
	@EJB
	EvaluationSheetServices evaluationService;
	
	@EJB
	IndicatorServices indicatorServices;

	@EJB
	QuestionServices questionServices;
	
	@EJB
	AnswerServices answerServices;
	
	public BD() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() {
		
		User admin = new User();
		User employe = new User();
		User coWorker = new User();
		
		userService.create(admin);
		userService.create(employe);
		userService.create(coWorker);
		
		EvaluationSheet evaluationSheet = new EvaluationSheet(employe, admin, EvaluationType.FIN_PROJET, Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.now()));
		evaluationService.create(evaluationSheet);
		
		Indicator indicator1 = new Indicator("indicateur 1", evaluationSheet);
		Indicator indicator2 = new Indicator("indicateur 2", evaluationSheet);
		
		indicatorServices.create(indicator1);
		indicatorServices.create(indicator2);
		
		Question question1 = new Question("question 1-1", indicator1);
		Question question2 = new Question("question 1-2", indicator1);
		Question question3 = new Question("question 2-1", indicator2);
		
		questionServices.create(question1);
		questionServices.create(question2);
		questionServices.create(question3);
		
		Answer answer1 = new Answer(employe, question1, "reponse a la question 1-1");
		Answer answer2 = new Answer(employe, question2, "reponse a la question 1-2");
		Answer answer3 = new Answer(employe, question3, "reponse a la question 2-1");
		
		
		Answer coWorkerAnswer1 = new Answer(coWorker, question1, "reponse coWorker a la question 1-1");
		Answer coWorkerAnswer2 = new Answer(coWorker, question2, "reponse coWorker a la question 1-2");
		Answer coWorkerAnswer3 = new Answer(coWorker, question3, "reponse coWorker a la question 2-1");
		
		answerServices.respondeToQuestion(answer1);
		answerServices.respondeToQuestion(answer2);
		answerServices.respondeToQuestion(answer3);
		
		answerServices.noteAnAnswer(answer1, 5);
		answerServices.noteAnAnswer(answer2, 8);
		answerServices.noteAnAnswer(answer3, 3);
		
		evaluationService.commentOnEvaluationSheet(evaluationSheet, "passable");
		evaluationService.takeDecision(evaluationSheet, EvaluationDecision.AUGMENTATION);
	}
}
