package MonPackage;

public class Distances_interVilles
{

	public static void main(String[] args) 
	{
		
		// Déclaration des variables 
		 
			boolean Fin = false;
			String Retour, VilledeDepart, VilledArrivee, Villes [] = 
					  {"Brest","Grenoble","Lille","Lyon","Marseille","Nantes","Paris","Rennes","Strasbourg","Toulouse"};
			int cpt, nbVilledeDepart=0, nbVilledArrivee=0, Mat[][] = 
					  {{0,996,723,890,1286,305,564,245,1026,884}, 
					  {996,0,750,104,286,711,576,747,505,543},
				      {723,750,0,668,979,593,224,515,524,905},
				      {890,104,668,0,316,607,472,645,434,467},
			          {1286,286,979,316,0,890,769,938,750,400},
				      {305,711,597,607,890,0,386,106,832,559},
				      {564,576,224,472,769,386,0,348,447,681},
				      {245,747,515,645,938,106,348,0,447,681},
				      {1026,505,524,434,750,832,447,799,0,901},
			      	  {884,543,905,467,400,559,681,665,901,0}};
		
		// Boucle répéter jusqu'à utilisant la variable booléenne Fin permettant de retourner au début du programme si l'utilisateur le décide. 
			
		do
		{
			boolean Verification = false, Verification2 = false;
			System.out.println("Ce programme permet de connaître la distance séparant 2 villes parmi la liste de villes ci-dessous :\n\r"
													+"Brest, Grenoble, Lille, Lyon, Marseille, Nantes, Paris, Rennes, Strasbourg, Toulouse.\n\r"
													
					+ "Afin de connaître les distances souhaitées, vous allez d'abord devoir saisir la ville de départ puis ensuite la ville d'arrivée parmi les villes disponibles dans le répertoire.\n"); 
		
		// Saisie par l'utilisateur de la ville de départ
			
			VilledeDepart = Saisie.lire_String("Veuillez saisir votre ville de départ. Le nom de la ville doit commencer par une majuscule et doit être disponible dans le répertoire.");
		// Cette boucle vérifie si le mot saisi par l'utilisateur respecte bien les conditions définies
			
			while (Verification != true)
			{	
				for (cpt=0; cpt<Villes.length; cpt++)
				{	
					if(VilledeDepart.equals(Villes[cpt]))
					{						
						Verification = true;				
					}			
				}
				
				if (Verification == false) VilledeDepart = Saisie.lire_String("Erreur, le nom de la ville que vous avez saisi n'est pas disponible dans notre répertoire ou le nom de ville saisi n'a pas été écrit avec la première lettre en majuscule.\r\n" + 
						                "Veuillez réécrire le nom de votre ville de départ en mettant une majuscule.");
			}
			
			VilledArrivee = Saisie.lire_String("Veuillez saisir votre ville d'arrivée. Le nom de la ville doit commencer par une majuscule et doit être disponible dans le répertoire.");			
			
			// Cette boucle vérifie si le mot saisi par l'utilisateur respecte bien les conditions définies
			while (Verification2 != true)
			{		
				for (cpt=0; cpt<Villes.length;cpt++)
				{	
					if(VilledArrivee.equals(Villes[cpt]))
					{						
						Verification2 = true;
					}
				}				
				if (Verification2 == false) VilledArrivee = Saisie.lire_String("Erreur, le nom de la ville que vous avez saisi n'est pas disponible dans notre répertoire ou le nom de ville saisi n'a pas été écrit avec la première lettre en majuscule.\r\n"+
				 "Veuillez réécrire le nom de votre ville d'arrivée en mettant une majuscule.");	
			} 
			
			// Cette boucle compare la ville saisie par l'utilisateur avec le nom des villes disponibles dans le répertoire jusqu'à trouver une correspondance
			for (cpt=0; cpt<Villes.length;cpt++)
			{	
				if(VilledeDepart.equals(Villes[cpt]))
				{					
					nbVilledeDepart = cpt;
				}
			}
			
			// Cette boucle compare la ville saisie par l'utilisateur avec le nom des villes disponibles dans le répertoire jusqu'à trouver une correspondance
			for (cpt=0; cpt<Villes.length;cpt++)
			{	
				if(VilledArrivee.equals(Villes[cpt]))
				{
					nbVilledArrivee = cpt;		
				}
			}
			
			/* Cette condition permet de trouver le résultat exact dans la matrice. Si la ville de départ est placée plus loin dans la liste que la ville d'arrivée, alors le numéro correspondant à la position
			de la ville d'arrivée sera le numéro de la ligne de la matrice et le numéro de la ville de départ sera le numéro de la colonne de la matrice. 
			Dans le cas contraire, le numéro correspondant à la position
			de la ville de départ sera le numéro de la ligne de la matrice et le numéro de la ville d'arrivée sera le numéro de la colonne de la matrice.*/
			
			if (nbVilledeDepart<nbVilledArrivee)
			{	
				System.out.println("La ville de départ que vous avez saisi est "+VilledeDepart+" tandis que la ville d'arrivée est "+VilledArrivee+"."
						+ " La distance séparant ces 2 villes est de "+Mat[nbVilledeDepart][nbVilledArrivee]+" km.");
			}
			else 
			{				
				System.out.println("La ville de départ que vous avez saisi est "+VilledeDepart+ " tandis que la ville d'arrivée que vous avez saisi est "+VilledArrivee+"."
						+ " La distance séparant ces 2 villes est de "+Mat[nbVilledArrivee][nbVilledeDepart]+" km.");
			}
			
			System.out.println();
			
			Retour = Saisie.lire_String("Voulez-vous connaître la distance séparant d'autres villes? Ecrivez oui si vous souhaitez recommencer et non dans le cas contraire.");
			
			// Boucle qui permet à l'utilisateur de choisir s'il veut retourner au début du programme ou s'il souhaite arrêter.
			while (!Retour.equals("oui") && !Retour.equals("non"))
			{
				Retour = Saisie.lire_String("Vous n'avez pas saisi 'oui' ou 'non', souhaitez-vous retourner au début du programme?");
			}
			
			if (Retour.equals("non"))
			{
				Fin = true;
				System.out.println("Vous ne souhaitez pas continuer. Fin du programme.");
			}  
			
			if (Retour.equals("oui"))
			{
				Fin = false;
				System.out.println();
			}
		}
		while (Fin != true);
	}
}
