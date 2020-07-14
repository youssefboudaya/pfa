package pidev.rest;

import javax.annotation.PostConstruct;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import entities.*;
import pidev.TimesheetServiceRemote;

@Path("youssef")
public class TimesheetRessources {

	private static String jndiName ="pidev.rest-0.0.1-SNAPSHOT/TimesheetImpl!pidev.TimesheetServiceRemote";
	static Context context ;
	static TimesheetServiceRemote proxy;
	@PostConstruct
	public static void OnInit() throws NamingException {
		TimesheetRessources.props(TimesheetRessources.jndiName);

	}
	public static void props(String jndiName) throws NamingException{
		TimesheetRessources.context = new InitialContext();
		TimesheetRessources.proxy = (TimesheetServiceRemote) context.lookup(jndiName);
	}
	
	@POST
	@Path(value = "projects/create")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response ajouterProject(Project p) throws NamingException
	{ 
		try {
		proxy.ajouterProject(p);
		
		//return "Created";	
			return Response.status(Status.CREATED).entity("Projet ajouté avec succés").build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity("erreur création projet").build();

		}
	    //return "not ceated";
	}
	
	@POST
	@Path(value = "projects/affect/{user_id}/{projet_id}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response affecterUserAProject(@PathParam( value = "user_id") int user_id,@PathParam( value = "projet_id") int projet_id) throws NamingException
	{ 
		try {
		proxy.affecterUserAProject(user_id,projet_id);
		
		//return "Created";	
			return Response.status(Status.CREATED).entity(proxy.getAllProjects()).build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity("erreur affectation projet").build();

		}
	    //return "not ceated";
	}
	
	@GET
	@Path(value = "projects")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllProjects() throws NamingException
	{ 
		try {
		
		
		//return "Created";	
			return Response.status(Status.FOUND).entity(proxy.getAllProjects()).build();
		}catch(Exception e){
			return Response.status(Status.NOT_FOUND).entity("aucune résultat").build();

		}
	    //return "not ceated";
	}
	
	@PUT
	@Path(value = "projects/update")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateProject(Project p) throws NamingException
	{ 
		try {
		proxy.updateProject(p);
		
		//return "Created";	
			return Response.status(Status.CREATED).entity("Projet modifié avec succés").build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity("erreur modification projet").build();

		}
	    //return "not ceated";
	}
	
	@DELETE
	@Path(value = "projects/delete/{id}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteProjectById(@PathParam( value = "id") int id) throws NamingException
	{ 
		try {
		proxy.deleteProjectById(id);
		
		//return "Created";	
			return Response.status(Status.CREATED).entity("Projet supprimé avec succés").build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity("erreur suppression projet").build();

		}
	    //return "not ceated";
	}
	
	@POST
	@Path(value = "timesheets/create")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response ajouterTimesheet(Timesheet p) throws NamingException
	{ 
		try {
		proxy.ajouterTimesheet(p);
		
		//return "Created";	
			return Response.status(Status.CREATED).entity(proxy.getAllTimesheets()).build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity("erreur création timesheet").build();

		}
	    //return "not ceated";
	}
	
	
	@GET
	@Path(value = "timesheets")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllTimesheets() throws NamingException
	{ 
		try {
		
		
		//return "Created";	
			return Response.status(Status.FOUND).entity(proxy.getAllTimesheets()).build();
		}catch(Exception e){
			return Response.status(Status.NOT_FOUND).entity("aucune résultat").build();

		}
	    //return "not ceated";
	}
	
	@PUT
	@Path(value = "timesheets/update")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateTimesheet(Timesheet p) throws NamingException
	{ 
		try {
		proxy.updateTimesheet(p);
		
		//return "Created";	
			return Response.status(Status.CREATED).entity("Timesheet modifié avec succés").build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity("erreur modification timesheet").build();

		}
	    //return "not ceated";
	}
	
	@DELETE
	@Path(value = "timesheets/delete/{id}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteTimesheetById(@PathParam( value = "id") int id) throws NamingException
	{ 
		try {
		proxy.deleteTimesheetById(id);
		
		//return "Created";	
			return Response.status(Status.CREATED).entity("Timesheet supprimé avec succés").build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity("erreur suppression timesheet").build();

		}
	    //return "not ceated";
	}
	
	@POST
	@Path(value = "leave_requests/create")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response ajouterLeave_request(Leave_request p) throws NamingException
	{ 
		try {
		proxy.ajouterLeave_request(p);
		
		//return "Created";	
			return Response.status(Status.CREATED).entity(proxy.getAllLeave_requests()).build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity("erreur création demande congé").build();

		}
	    //return "not ceated";
	}
	
	
	@GET
	@Path(value = "leave_requests")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllLeave_requests() throws NamingException
	{ 
		try {
		
		
		//return "Created";	
			return Response.status(Status.FOUND).entity(proxy.getAllLeave_requests()).build();
		}catch(Exception e){
			return Response.status(Status.NOT_FOUND).entity("aucune résultat").build();

		}
	    //return "not ceated";
	}
	
	@PUT
	@Path(value = "leave_requests/update")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateLeave_request(Leave_request p) throws NamingException
	{ 
		try {
		proxy.updateLeave_request(p);
		
		//return "Created";	
			return Response.status(Status.CREATED).entity("demande congé modifié avec succés").build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity("erreur modification demande congé").build();

		}
	    //return "not ceated";
	}

	@PUT
	@Path(value = "leave_requests/validate/{id}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response validateLeave_request(@PathParam( value = "id") int id) throws NamingException
	{ 
		try {
		proxy.validateLeave_request(id);
		
		//return "Created";	
			return Response.status(Status.CREATED).entity("demande congé validé avec succés").build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity("erreur validation demande congé").build();

		}
	    //return "not ceated";
	}
	
	@DELETE
	@Path(value = "leave_requests/delete/{id}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteLeave_requestById(@PathParam( value = "id") int id) throws NamingException
	{ 
		try {
		proxy.deleteLeave_requestById(id);
		
		//return "Created";	
			return Response.status(Status.CREATED).entity("demande congé supprimé avec succés").build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity("erreur suppression demande congé").build();

		}
	    //return "not ceated";
	}
	
}
