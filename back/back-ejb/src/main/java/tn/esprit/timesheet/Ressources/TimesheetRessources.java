package tn.esprit.timesheet.Ressources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import tn.esprit.timesheet.services.impl.TimesheetService;

@Path("projects")
public class TimesheetRessources {

	static TimesheetService metier = new TimesheetService();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Response getAllProjects()
	{
		return Response.status(Status.FOUND).entity(metier.getAllProjects()).build();
	}
}
