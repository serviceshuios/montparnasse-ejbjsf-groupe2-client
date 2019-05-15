package com.infotel.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.infotel.metier.Lotissement;



@ManagedBean
@SessionScoped
public class LotissementBean implements Serializable{
	
	
@EJB
private ILotRemote service;
private Lotissement lotissement = new Lotissement();
private List<Lotissement> lotissements ;
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

