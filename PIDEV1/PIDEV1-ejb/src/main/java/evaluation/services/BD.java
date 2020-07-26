package evaluation.services;

import java.sql.Date;
import java.text.Format;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import entities.User;
import evaluation.entities.Answer;
import evaluation.entities.EvaluationDecision;
import evaluation.entities.EvaluationSheet;
import evaluation.entities.EvaluationType;
import evaluation.entities.Indicator;
import evaluation.entities.Question;
import evaluation.entities.Utilisateur;
import manage.entities.Contrat;
import manage.services.ContratServices;
import services.UserService;

@Startup
@Singleton
public class BD {
	@EJB
	UtilisateurServices userService;
	
	@EJB
	EvaluationSheetServices evaluationService;
	
	@EJB
	IndicatorServices indicatorServices;

	@EJB
	QuestionServices questionServices;
	
	@EJB
	AnswerServices answerServices;
	
	@EJB
	ContratServices contratServices;
	
	public BD() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() {
		
		Utilisateur admin = new Utilisateur("admin", "admin@email.com", "admin");
		Utilisateur employe = new Utilisateur("employe", "test@email.com");
		Utilisateur coWorker = new Utilisateur("coworker", "coworker@email.com");
		
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
		
		//evaluationService.createFromRest(1, 2, EvaluationType.FIN_PROJET, "2020-07-13", "2020-12-13");
		//indicatorServices.createFromRest(1, "label test artan");
		//evaluationService.takeDecisionFromRest(1, "PRIME");
		//answerServices.respondeToQuestionFromRest(3, 1, "response from DB");
	}
}