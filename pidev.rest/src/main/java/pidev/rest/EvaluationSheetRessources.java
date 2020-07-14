package pidev.rest;

import javax.naming.InitialContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import entities.EvaluationSheet;
import entities.User;
import evaluation.services.EvaluationSheetServicesRemote;
import pidev.UserServiceRemote;

import javax.annotation.PostConstruct;
import javax.naming.Context;

import javax.naming.NamingException;

@Path("evaluations")
public class EvaluationSheetRessources {

	private static String jndiName ="pidev.rest-0.0.1-SNAPSHOT/EvaluationSheetImpl!evaluation.services.EvaluationSheetServicesRemote";
	static Context context ;
	static EvaluationSheetServicesRemote proxy;
	
	@PostConstruct
	public static void OnInit() throws NamingException {
		EvaluationSheetRessources.props(EvaluationSheetRessources.jndiName);

	}
	
	public static void props(String jndiName) throws NamingException{
		EvaluationSheetRessources.context = new InitialContext();
		EvaluationSheetRessources.proxy = (EvaluationSheetServicesRemote) context.lookup(jndiName);
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Response getAll(@QueryParam(value="reference") Long user_id)
	{
		if(user_id == null)		
			return Response.status(Status.OK).entity(proxy.get()).build();
		
		return null;

	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public EvaluationSheet createEvaluationSheet(EvaluationSheet evaluationSheet) {
		proxy.createFromRest(evaluationSheet.getSubjectId(), evaluationSheet.getCreatorId(), evaluationSheet.getType(), evaluationSheet.getCreatedAt(), evaluationSheet.getAvailableUntil());
		return evaluationSheet;
	}
	
	@POST
	@Path("{id}/comment")
	@Produces(MediaType.APPLICATION_JSON)
	public String commentOnEvaluationSheet(@PathParam("id") Integer id, String comment) {
		proxy.commentOnEvaluationSheetFromRest(id, comment);
		return "comment has been placed!";
	}
	
	@POST
	@Path("{id}/decision")
	@Produces(MediaType.APPLICATION_JSON)
	public String decideOnEvaluationSheet(@PathParam("id") Integer id, String decision) {
		proxy.takeDecisionFromRest(id, decision);
		return decision;
	}
}
