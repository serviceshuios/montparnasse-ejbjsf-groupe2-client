package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.ILotRemote;
import com.infotel.metier.Lotissement;

@Named
@SessionScoped
public class LotissementBean implements Serializable {

	private static final long serialVersionUID = 192071581349977345L;
	@EJB
	private ILotRemote service;
	private Lotissement lotissement = new Lotissement();
	private List<Lotissement> lotissements;

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

}
