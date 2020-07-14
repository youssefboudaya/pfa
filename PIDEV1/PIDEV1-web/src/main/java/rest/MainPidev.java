package rest;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.User;
import pidev.UserServiceRemote;

public class MainPidev {

	public static void main(String[] args) throws NamingException {
		  String jndiName ="PIDEV1-ear/PIDEV1-ejb/UserService!pidev.UserServiceRemote";
		 
		 Context context = new InitialContext();
		   UserServiceRemote proxy = (UserServiceRemote) context.lookup(jndiName);
		User u = new User();
		u.setNom("test");
		int m =1;
		if(m==1)
			MainPidev.m1(proxy,u);
		if(m==2)
			MainPidev.m2();
		if(m==1)
			MainPidev.m3();

	}
	
	public static void m1( UserServiceRemote proxy ,User user) {
		try {
			proxy.create(user);
			//return "Created";	
				System.out.println(" AJouter avec succés");
			}catch(Exception e){
				System.out.println("echc");
			}
		}
	public static void m2() {
			
		}
	public static void m3() {
		
	}

}
