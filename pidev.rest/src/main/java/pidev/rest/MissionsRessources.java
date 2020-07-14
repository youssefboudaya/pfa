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

import entities.Mission;
import entities.User;
import pidev.MissionServiceRemote;

@Path("missions")
public class MissionsRessources {
	
	private static String jndiName ="pidev.rest-0.0.1-SNAPSHOT/MissionService!pidev.MissionServiceRemote";
	static Context context ;
	static MissionServiceRemote proxy;
	@PostConstruct
	public static void OnInit() throws NamingException {
		MissionsRessources.props(MissionsRessources.jndiName);
	}
	
	public static void props(String jndiName) throws NamingException{
		MissionsRessources.context = new InitialContext();
		MissionsRessources.proxy = (MissionServiceRemote) context.lookup(jndiName);
	}
	
	
	
	//-----------------------------------------------------------------
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response createMission(Mission m) throws NamingException
	{ 
		try {
		proxy.create(m);
		
		//return "Created";	
			return Response.status(Status.CREATED).entity("Mission AJouter avec succés").build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity("not Created").build();

		}
	    //return "not ceated";
	}
	
	
	
	
	//------------------------------------------------------------

/*		@POST
		@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Produces(MediaType.APPLICATION_JSON)
		@Path("{user}/{collaborator}")
		public Response createUser(Mission m,@PathParam( value = "user") int user,@PathParam( value = "collaborator") int collaborator) throws NamingException
		{ 
			try {
				User u = new User();
				u.setid(user);
				User c = new User();
				c.setid(collaborator);
				m.setUser(u);
				m.setCollaborator(c);
			proxy.create(m);
			//return "Created";	
				return Response.status(Status.CREATED).entity("Article AJouter avec succés").build();
			}catch(Exception e){
				return Response.status(Status.BAD_REQUEST).entity("not Created").build();
		
			}
		    //return "not ceated";
		}
	*/	
		@GET
		@Produces({MediaType.APPLICATION_JSON})
		public Response getAll(@QueryParam(value="reference") Long user_id)
		{	
			if(user_id == null)
				return Response.status(Status.OK).entity(proxy.getAll()).build();
			else {
				return Response.status(Status.OK).entity(proxy.getAllByUser(user_id)).build();
					 
				
			}

		}
		@PUT
		@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Produces(MediaType.APPLICATION_JSON)
		public Response updateUser(Mission m) throws NamingException
		{ 
			try {
			m = proxy.update(m);
			//return "Created";	
				return Response.status(Status.CREATED).entity(m).build();
			}catch(Exception e){
				return Response.status(Status.BAD_REQUEST).entity("ERROR, Connot be updated").build();
		
			}
		    //return "not ceated";
		}
		@DELETE
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Path("{reference}")
		@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		public Response delete(@PathParam( value = "reference") Long reference) {
			if(proxy.delete(proxy.read(reference)))
			return Response.status(410).entity("mission Supprimer avec succes").build();
			else
				return Response.status(Status.BAD_REQUEST).entity("aucune mission supprimé").build();
		}
		

}
