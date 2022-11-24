package projet;
import java.util.UUID;


public class EscaleProgramming {
	 public Escale escinit()
	    {

String air=""   ;
Integer dur =0 ;

String uniqueID = UUID.randomUUID().toString();
System.out.println( "Entrer la duree optimale de l'escale   : ");
dur= Outils.Reader(dur);
System.out.println( "Entrer l'Aeroport de l'escale  : ");
air= Outils.Readerch(air);
Escale escToCreat = new Escale(uniqueID, dur, air);  

return escToCreat  ;     
	    }


}
