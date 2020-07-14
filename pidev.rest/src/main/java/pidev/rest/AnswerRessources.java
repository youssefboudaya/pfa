package pidev.rest;

import javax.annotation.PostConstruct;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import entities.Answer;
import evaluation.services.AnswerServicesRemote;
import evaluation.services.QuestionServicesRemote;

@Path("answers")
public class AnswerRessources {

	private static String jndiName ="pidev.rest-0.0.1-SNAPSHOT/AnswerImpl!evaluation.services.AnswerServicesRemote";
	static Context context ;
	static AnswerServicesRemote proxy;
	
	@PostConstruct
	public static void OnInit() throws NamingException {
		AnswerRessources.props(AnswerRessources.jndiName);
	}
	
	public static void props(String jndiName) throws NamingException{
		AnswerRessources.context = new InitialContext();
		AnswerRessources.proxy = (AnswerServicesRemote) context.lookup(jndiName);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Answer respondeToQuestion(Answer answer) {
		proxy.respondeToQuestionFromRest(answer.getEmployeId(), answer.getQuestionId(), answer.getResponse());
		
		return answer;
	}
	
	@POST
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String noteAnAnswer(@PathParam("id") Integer id, String note) {
		
		proxy.noteAnAnswerFromRest(id, Integer.parseInt(note));
		
		return "Answer has been noted!";
	}
}
