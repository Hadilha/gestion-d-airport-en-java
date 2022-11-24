package projet;
import java.util.List;
import java.util.UUID;
public class VolsServices
{ 
public VolsModel volinit(List <PlaneModel> listOfPlane )
{
VolsModel volToCreat = new VolsModel() ;

String d1=null   ; 
String d11=""   ;
String comp=""   ;
Integer dur =0 ;
Integer longev =0 ; 
AvionDispo planename  = null ; 
PlaneModel p1 ; 
String uniqueID = UUID.randomUUID().toString();
System.out.println( "Entrer la Date de Votre Depart : ");
d1= Outils.Readerch(d1);
System.out.println( "Entrer la duree optimale de votre Vols  en heurs  : ");
dur= Outils.Reader(dur);
System.out.println( "Entrer la compagnie de votre Vols  : ");
comp= Outils.Readerch(comp);
System.out.println( "Entrer la longeur de totale a ne pas depasser au cas d'escale  en heurs   : ");
longev= Outils.Reader(longev);
do {
System.out.println( "Entrer le nom de l'avion pour assurer   Votre Depart : ");
d11= Outils.Readerch(d11);

try {

planename= AvionDispo.valueOf(d11) ; 


switch (planename)
{
case  HawkerHurricane: 
System.out.println("HawkerHurricane");
p1=listOfPlane.stream().filter(p->AvionDispo.HawkerHurricane.equals(p.getName())).findAny().orElse(null); //choix dans une liste 
volToCreat= new VolsModel(uniqueID, d1, dur, longev, comp, p1);
break ; 
case Carthage: 
System.out.println("Cartage");
p1=listOfPlane.stream().filter(p->AvionDispo.Carthage.equals(p.getName())).findAny().orElse(null); //choix dans une liste 
volToCreat= new VolsModel(uniqueID, d1, dur, longev, comp, p1);
break ;
case FightingFalcon : 
System.out.println("FightingFalcon");
p1=listOfPlane.stream().filter(p->AvionDispo.FightingFalcon.equals(p.getName())).findAny().orElse(null); //choix dans une liste 
volToCreat= new VolsModel(uniqueID, d1, dur, longev, comp, p1);

break ;
case Tupolev : 
System.out.println("Tupolev");
p1=listOfPlane.stream().filter(p->AvionDispo.Tupolev.equals(p.getName())).findAny().orElse(null); //choix dans une liste 
volToCreat= new VolsModel(uniqueID, d1, dur, longev, comp, p1);
break ;



}
} catch (Exception e)
{
System.out.println("cet avion n'est pas disponible ");

}  
} while (planename ==null) ; 
return volToCreat ;     
}





}
