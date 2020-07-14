package pidev.rest;


import javax.naming.InitialContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import entities.User;
import pidev.UserServiceRemote;

import javax.annotation.PostConstruct;
import javax.naming.Context;

import javax.naming.NamingException;
@Path("users")
public class UsersResources {

private static String jndiName ="pidev.rest-0.0.1-SNAPSHOT/UserService!pidev.UserServiceRemote";
static Context context ;
static UserServiceRemote proxy;
@PostConstruct
public static void OnInit() throws NamingException {
	UsersResources.props(UsersResources.jndiName);

}
public static void props(String jndiName) throws NamingException{
	UsersResources.context = new InitialContext();
	 UsersResources.proxy = (UserServiceRemote) context.lookup(jndiName);
}
/*public static void main(String[] args) throws NamingException {
	

	
	
	  String jndiName ="CalculatriceServeur/CalculatriceStatless!tn.esprit.Interfaces.CalculatriceRemote";
	  Context context = new InitialContext();
	  UserServiceRemote proxy = (UserServiceRemote) context.lookup(jndiName);
	  System.out.println(proxy.add(5, 3));
	  
		
		}*/

@GET
@Produces({MediaType.APPLICATION_JSON})
public Response getAll(@QueryParam(value="reference") Long user_id)
{
	if(user_id == null)
	
		return Response.status(Status.OK).entity(proxy.getAll()).build();
	  
/*		else {
		return Response.status(Status.OK).entity(proxy.getAllByUser(user_id)).build();
			 
		
	}*/
	return null;

}











	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response createUser(User u) throws NamingException
	{ 
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
