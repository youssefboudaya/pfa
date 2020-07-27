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
		Utilisateur admin = new Utilisateur("Manager Account", "admin@email.com", "admin");
		Utilisateur employe = new Utilisateur("Employe Account", "test@email.com");
		Utilisateur coWorker = new Utilisateur("Coworker Account", "coworker@email.com");
		
		userService.create(admin);
		userService.create(employe);
		userService.create(coWorker);
	}
}