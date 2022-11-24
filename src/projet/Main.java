package projet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {

public static void main(String[] args) {
		
		PlaneModel Cartage= new  PlaneModel ("0505Car",AvionDispo.Carthage , "Aircraft ", 10000 ,30000, 10000,12000,10000,1200) ; 
		PlaneModel HawkerHurricane= new  PlaneModel ("2010HAW", AvionDispo.HawkerHurricane , "Aircraft ", 10000,100000, 20000,25000,30000,2000) ; 
		PlaneModel Tupolev= new  PlaneModel ("2001TUP", AvionDispo.Tupolev , "Aircraft ", 12520,50000, 10000,152000,23000,14000) ; 
		PlaneModel FightingFalcon= new  PlaneModel ("3000FIG",AvionDispo.FightingFalcon ,  "Aircraft ", 1255,90000, 10000,12000,8000,15000) ;
		VolsModel vol1 = new VolsModel("01AG02", "14/12/2021", 3, 2, "TUNISAIR", Cartage);
		VolsModel vol11 = new VolsModel() ; 
		VolsModel vol2 = new VolsModel("01AG03","14/12/2021", 3 , 2 ,"TURKISHAIR", HawkerHurricane) ;
		VolsServices  volserv = new  VolsServices() ;
		AirportModel TunisCarthage= new AirportModel("TUN216", "TunisCarthage"); 
		AirportModel AtaturcTurkie= new AirportModel("TUR869", "AtaturcTurkie"); 
		EscaleProgramming  escserv = new  EscaleProgramming() ;
		Escale esc11=new Escale() ; 
		Escale es1 = new Escale("01ES01",1,  TunisCarthage.getNom()) ;
		Escale es2 = new Escale("01ES02",2 , AtaturcTurkie.getNom()) ;
	
 List<PlaneModel> ListOfPlane = new ArrayList<>();
 ListOfPlane.add(Cartage); 
 ListOfPlane.add(HawkerHurricane); 
 ListOfPlane.add(Tupolev); 
 ListOfPlane.add(FightingFalcon); 

System.out.println("\n \n ") ; 
System.out.println("\n \n ") ; 
System.out.println(" **Welcome To Our Airport !** ");
	Integer x = null ; 


	do 
	{
		System.out.println("\n \n ") ; 
		System.out.println("\n \n ") ; 
			
		System.out.println(" 1- Voulez Consulter Nos Vols  programmé  pour Aujourdhui  le   " +LocalDate.now()  +  " :  ? " );
		System.out.println("2- Voulez Vous Programmé votre propre Vols ? ");
		System.out.println("3- Voulez vous supprimer un avion  ? ");
		System.out.println("4- Quitter ");
		System.out.println( " Veuiller entrer votre choix ! " );
	  x= Outils.Reader(x); 
	
	
	switch (x)
	{
case 1 :
		                                          /*vol1*/ 
		System.out.println( vol1 );
		System.out.println("Vous Trouverer ci-dessous plus de renseignement pour ce vol !  ");
		System.out.println(Cartage);
		System.out.println(TunisCarthage);
		System.out.println(es1);

		
		                                   /* vol2*/ 
		
		System.out.println("\n \n ") ; 
		System.out.println( vol2 );
		System.out.println("\n \n ") ; 

		System.out.println("Vous Trouverer ci-dessous plus de renseignement pour ce vol !  ");
		System.out.println(HawkerHurricane);
		System.out.println("\n \n ") ; 

		System.out.println(AtaturcTurkie);
		System.out.println("\n \n ") ; 

		System.out.println(es2);
		System.out.println("\n \n ") ; 

		break ; 
case 4 : 
		System.out.println("\n \n ") ; 

		System.out.println("   GoodBye ! ");
		System.out.println("\n \n ") ; 

		break ; 
case 2 : 
		System.out.println("\n \n ") ; 
		System.out.println("  Notre Airligne  Manager est sur votre disposition :)  ");
		System.out.println("\n \n ") ; 

		System.out.println("veuillez programmez votre vols ! ");
		vol11= volserv.volinit(ListOfPlane);
		esc11=escserv.escinit();
		System.out.println( vol11 );
		System.out.println( esc11 );

		
		break ; 
case 3 : 
	
		System.out.println("\n \n ") ; 
		System.out.println("la liste des avions disponible : ");
		ListOfPlane.stream().forEach(x1->System.out.println(x1));
		System.out.println("\n \n ") ; 	
		System.out.println(" suppression d'un avion  : "  );
		String chainetest = OperationsAiroport.suppressionAvion();	
		boolean isPlaneRemoved = false ;
		for (int i =0 ; i<ListOfPlane.size(); i++)
			
		{
			if (chainetest.equals(ListOfPlane.get(i).getName().toString()
					) )
			 {
				System.out.println("cet avion est en panne " +  chainetest); 
				ListOfPlane.remove(i); 
				isPlaneRemoved = true ;
				ListOfPlane.stream().forEach(x1->System.out.println(x1));

			 }
			
		}

			if (isPlaneRemoved ==false )
			System.out.println("cet avion n'exite pas ! ");
		      break ; 
			}
		 
		


		
	}while (!((x<1)&&(x>3)));  ;
 
}

}
