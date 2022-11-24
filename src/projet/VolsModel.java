package projet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class VolsModel {
	private  String Identifiantvols ; 
	private String Date ; 
	private Integer duration ; 
	private Integer longeurvol ; 
	private String compagny ; 
	private PlaneModel  p; 
	private List<Escale>  L1 ; 
	private AirportModel a1 , a2 ; 
	   //, List<Escale>  L , AirportModel  a11, AirportModel a22 this.L1=L ; this.a1 =a11 ; 
	// this.a2=a22 ; 
	
	public VolsModel(String id , String d1 , Integer dur , Integer longev ,String com , PlaneModel p1  ) {
		this.Identifiantvols=id ; 
		this.Date=d1; 
		this.duration=dur ; 
		this.longeurvol= longev ; 
		this.p=p1 ; 
		this.compagny= com ; 
    } 
	
	
    
    public VolsModel() {
		super();
	}



	//--- GETTERS & SETTERS FOR FIELDS
	
    


	public void setIdentifiantvols( String  id ) {
        this.Identifiantvols = id ;
    }
    public String getIdentifiantvols() {
        return this.Identifiantvols;
    }

    public void setDate( String date ) {
        this.Date = date ;
    }
    public String getDate() {
        return this.Date;
    }

    public void setDuration( Integer duration ) {
        this.duration = duration ;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public void setLongeur( Integer longeur ) {
        this.longeurvol = longeur ;
    }
    public Integer getLongeur() {
        return this.longeurvol;
    }

    public void setCompany( String company ) {
        this.compagny = company ;
    }
    public String getCompany() {
        return this.compagny;
    }

    //--- GETTERS FOR LINKS
    public PlaneModel getPlane() {
        return this.p;
    } 

    public List<Escale> getListOfEscale() {
        return this.L1;
    } 

    public AirportModel geta1() {
        return this.a1;
    } 

    public AirportModel geta2() {
        return this.a2;
    } 
    //--- toString specific method
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append( " \n l'identificateur du vols est : " + Identifiantvols);
        sb.append(" |");
        sb.append("sa date est : " +Date);
        sb.append(" | ");
        sb.append("sa duree est " +duration);
        sb.append("| ");
        sb.append( "sa longeur est : "+longeurvol);
        sb.append(" |");
        sb.append("la compagnie de ce vol est : " +compagny + "\n");
        return sb.toString(); 
    } 
     
   
    
}
