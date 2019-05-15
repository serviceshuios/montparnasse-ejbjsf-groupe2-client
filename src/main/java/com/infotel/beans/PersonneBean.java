package com.infotel.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.infotel.ejb.ILotRemote;
import com.infotel.metier.Personne;

@ManagedBean
@SessionScoped
public class PersonneBean implements Serializable{
 
	@EJB
	private ILotRemote service;
	private Personne personne = new Personne();
	private List<Personne> personnes;
	public ILotRemote getService() {
		return service;
	}
	public void setService(ILotRemote service) {
		this.service = service;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public List<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	
	
	

}
