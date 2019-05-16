package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.ILotRemote;
import com.infotel.metier.Personne;

@Named
@SessionScoped
public class PersonneBean implements Serializable {

	private static final long serialVersionUID = -8967405013187651592L;
	@EJB
	private ILotRemote service;
	private Personne personne = new Personne();
	private List<Personne> personnes;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

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

	// methodes
	public void ajouterPersonne() {
		service.ajouterPersonne(personne);
	}
	public void supprimerPersonne(Long id) {
		service.supprimerPersonne(id);
	}
	public Personne getPersonne(long id) {
		return service.getPersonne(id);
	}
	public void editerPersonne() {
		service.editerPersonne(personne);
	}
	public List<Personne> listerPersonnes() {
		return service.listerPersonnes();
	}
	
}
