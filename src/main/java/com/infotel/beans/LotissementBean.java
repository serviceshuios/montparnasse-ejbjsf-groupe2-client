package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.ILotRemote;
import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

@Named
@SessionScoped
public class LotissementBean implements Serializable {

	private static final long serialVersionUID = 192071581349977345L;
	@EJB
	private ILotRemote service;
	private Lotissement lotissement = new Lotissement();
	private List<Lotissement> lotissements;
	private List<Personne> personnes;
	private Personne personne = new Personne();
	

	public List<Personne> getPersonnes() {
		return service.listerPersonnes();
	}

	// ne sert qu'a l'affichage dans la liste deroulante de acheterlot?
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ILotRemote getService() {
		return service;
	}

	public void setService(ILotRemote service) {
		this.service = service;
	}

	public Lotissement getLotissement() {
		return lotissement;
	}

	public void setLotissement(Lotissement lotissement) {
		this.lotissement = lotissement;
	}

	public List<Lotissement> getLotissements() {
		return lotissements;
	}

	public void setLotissements(List<Lotissement> lotissements) {
		this.lotissements = lotissements;
	}

	// methodes
	public void ajouterLotissement() {
		service.ajouterLotissement(lotissement);
		lotissement = new Lotissement();
	}

	public void supprimerLotissement(long idLot) {
		service.supprimerLotissement(idLot);
	}

	public Lotissement getLotissement(long idLot) {
		return service.getLotissement(idLot);
	}
	
	public void editerLotissement() {
		service.editerLotissement(lotissement);
		lotissement = new Lotissement();
	}
	
	public List<Lotissement> listerLotissements() {
		return service.listerLotissements();				
	}

	public void acheterLotissement() {
		long idPersonne = personne.getIdPersonne();
		long idLot = lotissement.getIdLot();
		service.acheterLotissement(idPersonne, idLot);
	}
	
	public List<Lotissement> listerVendus() {
		return service.listerVendus();
	}

	public List<Lotissement> listerAVendre() {
		return service.listerAVendre();
	}
}
