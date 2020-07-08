package tn.esprit.timesheet.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

import tn.esprit.timesheet.entities.*;
import tn.esprit.timesheet.services.interfaces.ExamenServiceRemote;

@Stateless
@LocalBean
public class ExamenService implements ExamenServiceRemote {

 @PersistenceContext(unitName = "imputation-ejb")
 EntityManager em;


 public Apprenant getApprenantByEmailAndPassword(String login, String password) {
  TypedQuery <Apprenant> query = em.createQuery("Select e from Apprenant e " + "where e.login=:login and " + "e.password=:password", Apprenant.class);
  query.setParameter("login", login);
  query.setParameter("password", password);
  Apprenant apprenant = null;
  try {
   apprenant = query.getSingleResult();
  } catch (NoResultException e) {
   Logger.getAnonymousLogger().info("Pbleeeeeeeeme"); //	logger.info("Aucun apprenant trouve ayant un email pareil"  + email);
  }
  return apprenant;
 }


 public List <Apprenant> getAllApprenants() {
  List < Apprenant > emp = em.createQuery("Select e from Apprenant e", Apprenant.class).getResultList();
  return emp;
 }

 public void ajouterApprenant(Apprenant apprenant) {
  em.persist(apprenant);
 }
 public void updateApprenant(Apprenant apprenant) {
  Apprenant emp = em.find(Apprenant.class, apprenant.getIdApprenant());
  emp.setPrenom(apprenant.getPrenom());
  emp.setNom(apprenant.getNom());
 }

 @Override
 public void deleteApprenantById(int apprenantId) {
  Apprenant apprenant = em.find(Apprenant.class, apprenantId);

  //Desaffecter l'apprenant de tous les departements
  //c'est le bout master qui permet de mettre a jour
  //la table d'association
  //for(Departement dep : apprenant.getDepartements()){
  //dep.getApprenants().remove(apprenant);
  //}

  em.remove(apprenant);
 }


@Override
public void ajouterCentre(Centre centre) {
	em.persist(centre);
	
}
@Override
public void affecterApprenantCentre(Integer idApprenant,Integer idCentre) {
	Centre depManagedEntity = em.find(Centre.class, idCentre);
	Apprenant employeManagedEntity = em.find(Apprenant.class, idApprenant);

	if(depManagedEntity.getApprenants() == null){
		List<Apprenant> employes = new ArrayList<>();
		employes.add(employeManagedEntity);
		depManagedEntity.setApprenants(employes);
	}else{
		depManagedEntity.getApprenants().add(employeManagedEntity);
	}
	//em.merge(depManagedEntity);
}



}