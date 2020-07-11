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
import tn.esprit.timesheet.services.interfaces.TimesheetServiceRemote;

@Stateless
@LocalBean
public class TimesheetService implements TimesheetServiceRemote {

 @PersistenceContext(unitName = "imputation-ejb")
 EntityManager em;






}