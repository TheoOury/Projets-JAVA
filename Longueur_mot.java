package MonPackage;
import java.util.ArrayList;

public class LongueurMot
{

	public static void main(String[] args)
	{
		//Déclaration des variables 
		
		int i,nbCommun, essai,longmot,j;
		String solution, mot;		
		boolean Sortie = false;
		
		solution = Saisie.lire_String("Veuillez saisir votre mot (Joueur 1)");
		
		
		while (solution.length()<2)
		{
		
		solution = Saisie.lire_String("Vous n'avez pas saisi le bon nombre de caractère veuillez recommencer !");
		
		}
		
		essai = solution.length()-2;
		ArrayList lettresCommuns = new ArrayList();
		
		
		for(i=0;i<solution.length();i++)
		{
			
			lettresCommuns.add('-');
		
		}
		
		mot = null;
		
		j = essai;
		while ((Sortie != true) && (j>0))
		{
			
			System.out.println("Nombres d'essais restants : "+(j));
			System.out.println("Longueur du mot à trouver : "+solution.length());
			System.out.println();
			
			mot = Saisie.lire_String("Veuillez saisir votre mot (Joueur 2) (PS : 'SOL' pour afficher la solution): ");
			
			while ((mot.length() != solution.length()) && (!mot.equals("SOL")))
					{
					mot = Saisie.lire_String("Vous n'avez pas saisi le bon nombre de caractère veuillez recommencer !");
					
					}
			nbCommun = 0;
			
			for(i=0;i<mot.length();i++)
			{
				if (mot.charAt(i) == solution.charAt(i)) 
						{
					 		nbCommun = nbCommun + 1;
					 		lettresCommuns.set(i, mot.charAt(i));
						}
			    
			}
			System.out.println("Nombre de lettres en commun trouvées: "+nbCommun);
			System.out.println(lettresCommuns);
			
			if (nbCommun == solution.length()) 
			{
				System.out.println();
				System.out.println("Bravo, vous avez trouvé le mot !");
				Sortie = true;
				
			}
			
			if (mot.equals("SOL"))
			{
				System.out.println();
				System.out.println("Perdu, vous n'avez pas réussi à trouver le mot");
				Sortie = true;
				
			}
			j--;
		}
		System.out.println("Voici la solution : "+solution);
	}
}
