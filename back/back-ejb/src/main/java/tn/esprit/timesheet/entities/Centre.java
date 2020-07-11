//package entities;
//
//import java.util.Set;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.JoinColumn;
//
//@Entity
//public class Centre {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long centretreId ; 
//	
//	@Column(name ="zone")
//	private String zone ; 
//	
//	@Column(name ="nom")
//	private String nom ;
//	
//	@Column(name ="nbAnne")
//	private String nbAnne ;
//	
//	
//	
//	@ManyToMany
//	@JoinTable(
//	  name = "centreApprenant",joinColumns = @JoinColumn(name ="centretreId"),  inverseJoinColumns = @JoinColumn(name ="apprenantId"))
//	Set<User> users;
//	
//
//	
//
//}
