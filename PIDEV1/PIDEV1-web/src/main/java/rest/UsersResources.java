package rest;


import javax.naming.InitialContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.Produces;
import entities.User;
import pidev.UserServiceRemote;
import services.UserService;
import javax.naming.Context;

import javax.naming.NamingException;
@Path("users")
public class UsersResources {
UserService userService = new UserService();
private  String jndiName ="PIDEV1-ear/PIDEV1-ejb/UserService!pidev.UserServiceRemote";

/*public static void main(String[] args) throws NamingException {
	

	
	
	  String jndiName ="CalculatriceServeur/CalculatriceStatless!tn.esprit.Interfaces.CalculatriceRemote";
	  Context context = new InitialContext();
	  UserServiceRemote proxy = (UserServiceRemote) context.lookup(jndiName);
	  System.out.println(proxy.add(5, 3));
	  
		
		}*/
	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response createUser(User u) throws NamingException
	{  Context context = new InitialContext();
	   UserServiceRemote proxy = (UserServiceRemote) context.lookup(jndiName);
		try {
		proxy.create(u);
		//return "Created";	
			return Response.status(Status.CREATED).entity("Article AJouter avec succés").build();
		}catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity("not Created").build();

		}
	    //return "not ceated";
	}
}
