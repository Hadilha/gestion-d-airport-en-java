package projet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class PlaneModel {
	
private  String IdentifiantPlane ; 
private  AvionDispo name ; 
private String model  ; 
private Integer consoavide ; 
private Integer consosup ; 
private Integer charge  ; 
private Integer capaciteequipage  ; 
private Integer capacitereservoir  ;
private Integer niveaucarburant  ; 

private List<VolsModel>  listeofvols ; 



public PlaneModel(String identifiantPlane, AvionDispo name, String model, Integer consoavide, Integer consosup,
		Integer charge, Integer capaciteequipage, Integer capacitereservoir, Integer niveaucarburant) {
	super();
	IdentifiantPlane = identifiantPlane;
	this.name = name;
	this.model = model;
	this.consoavide = consoavide;
	this.consosup = consosup;
	this.charge = charge;
	this.capaciteequipage = capaciteequipage;
	this.capacitereservoir = capacitereservoir;
	this.niveaucarburant = niveaucarburant;
}
public AvionDispo getName() {
return name;
}
public void setName(AvionDispo name) {
this.name = name;
}
public Integer getCapaciteequipage() {
return capaciteequipage;
}
public void setCapaciteequipage(Integer capaciteequipage) {
this.capaciteequipage = capaciteequipage;
}
public Integer getCapacitereservoir() {
return capacitereservoir;
}
public void setCapacitereservoir(Integer capacitereservoir) {
this.capacitereservoir = capacitereservoir;
}
public List<VolsModel> getListeofvols() {
return listeofvols;
}
public void setListeofvols(List<VolsModel> listeofvols) {
this.listeofvols = listeofvols;
}
//--- GETTERS & SETTERS FOR FIELDS
public void setIdentifiantPlane( String id ) {
    this.IdentifiantPlane = id ;
}
public String getIdentifiantPlane() {
    return this.IdentifiantPlane;
}


public void setModel( String model ) {
    this.model = model ;
}
public String getModel() {
    return this.model;
}

public void setConsoavide( Integer consoavide ) {
    this.consoavide = consoavide ;
}
public Integer getConsoavide() {
    return this.consoavide;
}

public void setConsosup( Integer consosup ) {
    this.consosup = consosup ;
}
public Integer getConsosup() {
    return this.consosup;
}

public void setCharge( Integer charge ) {
    this.charge = charge ;
}
public Integer getCharge() {
    return this.charge;
}

public void setcapaciteequipage( Integer capaequipage ) {
    this.capaciteequipage = capaequipage ;
}
public Integer getcapaciteequipage() {
    return this.capaciteequipage;
}

public void setcapacitereservoir( Integer capareservoir ) {
    this.capacitereservoir = capareservoir ;
}
public Integer getcapacitereservoir() {
    return this.capacitereservoir;
}

public void setNiveaucarburant( Integer niveaucarburant ) {
    this.niveaucarburant = niveaucarburant ;
}
public Integer getNiveaucarburant() {
    return this.niveaucarburant;
}

//--- GETTERS FOR LINKS
public List<VolsModel> getListOfVols() {
    return this.listeofvols;
} 

//--- toString specific method
@Override
public String toString() { 
    StringBuilder sb = new StringBuilder(); 
    sb.append(" \n l'identificateur de cet avion est:  " + IdentifiantPlane );
    sb.append(" |");
    sb.append("son model: "+model);
    sb.append(" |");
    sb.append("sa consommation a vide: " +consoavide);
    sb.append(" | ");
    sb.append( "sa consommation superieur: "+consosup);
    sb.append(" |");
    sb.append("sa charge: "+charge);
    sb.append(" |");
    sb.append("sa capacite d'equipage: "+capaciteequipage);
    sb.append(" |");
    sb.append("sa capacite de reservoire: "+capacitereservoir);
    sb.append(" |");
    sb.append("son niveau de carburant: "+niveaucarburant + "\n");
    return sb.toString(); 
}  




}
