package pidev.rest;

import javax.annotation.PostConstruct;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import entities.Contrat;
import entities.EvaluationSheet;
import evaluation.services.EvaluationSheetServicesRemote;
import manage.services.ContartServicesRemote;

@Path("contrats")
public class ContratRessources {
	private static String jndiName ="pidev.rest-0.0.1-SNAPSHOT/ContratImpl!manage.services.ContartServicesRemote";
	static Context context ;
	static ContartServicesRemote proxy;
	
	@PostConstruct
	public static void OnInit() throws NamingException {
		ContratRessources.props(ContratRessources.jndiName);
	}
	
	public static void props(String jndiName) throws NamingException{
		ContratRessources.context = new InitialContext();
		ContratRessources.proxy = (ContartServicesRemote) context.lookup(jndiName);
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Response getAll()
	{
		return Response.status(Status.OK).entity(proxy.getAll()).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Contrat createContrat(Contrat contrat) {
		proxy.createFromRest(contrat.getUserId(), contrat.getSalaire());
		
		return contrat;
	}
}
