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

import entities.EvaluationSheet;
import entities.Indicator;
import evaluation.services.EvaluationSheetServicesRemote;
import evaluation.services.IndicatorServicesRemote;

@Path("indicators")
public class IndicatorRessources {

	private static String jndiName ="pidev.rest-0.0.1-SNAPSHOT/IndicatorImpl!evaluation.services.IndicatorServicesRemote";
	static Context context ;
	static IndicatorServicesRemote proxy;
	
	@PostConstruct
	public static void OnInit() throws NamingException {
		IndicatorRessources.props(IndicatorRessources.jndiName);
	}
	
	public static void props(String jndiName) throws NamingException{
		IndicatorRessources.context = new InitialContext();
		IndicatorRessources.proxy = (IndicatorServicesRemote) context.lookup(jndiName);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Indicator createIndicator(Indicator indicator) {
		proxy.createFromRest(indicator.getEvaluationSheetId(), indicator.getLabel());
		return indicator;
	}
}
