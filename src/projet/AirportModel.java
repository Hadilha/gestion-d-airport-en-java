package projet;

public class AirportModel {

private String codestandard ; 
private String nom ; 

public AirportModel(String cd ,String nm )
{
	this.codestandard=cd ; 
	this.nom= nm ; }



//--- GETTERS & SETTERS FOR FIELDS

public void setCodestandard(String codestandard ) {
    this.codestandard = codestandard ;
}
public String getCodestandard() {
    return this.codestandard;
}

public void setNom( String nom ) {
    this.nom = nom ;
}
public String getNom() {
    return this.nom;
}

//--- toString specific method

  public String toString() { 
      StringBuilder sb = new StringBuilder(); 
      
      sb.append("Le nom de l'airoport est : " + nom +"\n");
      return sb.toString(); 
  } 

}
