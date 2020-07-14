package pidev.rest;

import javax.annotation.PostConstruct;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entities.Indicator;
import entities.Question;
import evaluation.services.IndicatorServicesRemote;
import evaluation.services.QuestionServicesRemote;

@Path("questions")
public class QuestionRessources {
	private static String jndiName ="pidev.rest-0.0.1-SNAPSHOT/QuestionImpl!evaluation.services.QuestionServicesRemote";
	static Context context ;
	static QuestionServicesRemote proxy;
	
	@PostConstruct
	public static void OnInit() throws NamingException {
		QuestionRessources.props(QuestionRessources.jndiName);
	}
	
	public static void props(String jndiName) throws NamingException{
		QuestionRessources.context = new InitialContext();
		QuestionRessources.proxy = (QuestionServicesRemote) context.lookup(jndiName);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Question createQuestion(Question question) {
		proxy.createFromRest(question.getIndicatorId(), question.getQuestion());
		
		return question;
	}
}
