package projet;

public class Escale {
	
	
private String id ; 
private Integer duration ; 
private String codeduvol ; 
private String airportnom; 

private VolsModel Vols ; 

private AirportModel air1 ;


 public Escale() {
	super();
}
public Escale (String id , Integer durations ,String h  )
 { 
	 this.id = id ; 
	 this .duration= durations ; 
	 
	 this.airportnom=h ; 
	 
	 
 }
//--- GETTERS & SETTERS FOR FIELDS
public void setId( String id ) {
    this.id = id ;
}
public String getId() {
    return this.id;
}
public void setnm( String nm ) {
    this.codeduvol= nm ;
}
public String getnm() {
    return this.codeduvol;
}  public void setcd( String cd ) {
    this.airportnom = cd ;
}
public String getcd() {
    return this.airportnom;
}
public void setDuration( Integer duration ) {
    this.duration = duration ;
}
public Integer getDuration() {
    return this.duration;
}

//--- GETTERS FOR LINKS
public VolsModel getVols() {
    return this.Vols;
} 
public AirportModel getair1() {
    return this.air1;
} 

//--- toString specific method

public String toString() { 
    StringBuilder sb = new StringBuilder(); 
    sb.append( " l'escale est : "+ id);
    sb.append("|");
    sb.append("la duree de l'escale en heurs est : "+ duration);
    sb.append("|");
    
    sb.append("le nom de l'airoport est : " +airportnom );
    
    return sb.toString(); 
} 



}
