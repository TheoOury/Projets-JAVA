package MonPackage
import java.util.Random; //inclusion d'une fonction pour définir un nombre au hasard

public class NombreMystérieux
{
	
	public static void main(String[] args)
		{
		
		// Déclaration des variables
			
		int nbsaisi, essais, nbsecret; /*nbsaisi désigne le nombre à saisir par le joueur 2
										 essais désigne le nombre d'essais du joueur 2
										 nbsecret désigne le numéro secret défini par la fonction Random */
										

		// Affichage des règles du jeu
		
			System.out.println("Voici les règles du jeu :\n"
				+ "- Il s'agit d'un jeu à 2 joueurs.\n"
				+ "- Le premier joueur introduit un nombre secret. Ce nombre secret doit être compris entre 1 et 100.\n"
				+ "- Le deuxième joueur essaie de le découvrir en proposant des nombres.\n"
				+ "- Le premier joueur ne peut répondre que par 'Trop haut !' ou 'Trop bas !' ou 'Gagné'.\n"
				+ "- Le deuxième joueur dispose de 10 essais pour tenter de trouver le nombre secret.");
		
		// Début du jeu et choix du nombre aléatoire

        System.out.println();
		System.out.println("Nous allons choisir un nombre compris entre 1 et 100.");
		System.out.println();
		nbsecret = new Random().nextInt(100); // L'ordinateur définit un nombre au hasard
		essais = 0; // mettre la variable essais à zéro
		nbsaisi = 0; // mettre la variable nbsaisi à zéro
		
		// Joueur 2
		
		while (essais<10 && nbsaisi != nbsecret) /* Le programme continuera à tourner tant que le nombre d'essai est inférieur à 10
		                                            et le nombre saisi est différent du nombre secret */
		{
			
		   // Saisie d'un nombre d'essai pour trouver le nombre secret défini par l'ordinateur
		   nbsaisi = Saisie.lire_int("Veuillez saisir un nombre compris entre 1 et 100, il vous reste "+ (10 - essais) +" essais.");
		   
		   
		   while (nbsaisi < 1 || nbsaisi > 100) /* Une boucle qui permet ainsi à l'utilisateur de ne pas saisir un nombre qui n'est 
		                                           pas inclus dans l'intervalle 1 à 100 sous peine de ne pas en sortir. */
			{
			   
			// Saisie d'un nombre d'essai pour trouver le nombre secret défini par l'ordinateur  
		   nbsaisi = Saisie.lire_int("Erreur, le nombre saisi n'est pas compris entre 1 et 100, veuillez recommencer");
			
			}
			
			if (nbsaisi >= 1 && nbsaisi <= 100) /* Si le nombre saisi par l'utilisateur est inclus dans l'intervalle 1 à 100
			                                       alors l'utilisateur aura utilisé une tentative sur 10, et ainsi de suite. */
			{
				essais = essais+1;
				
			}
			// Si le nombre saisi est identique au nombre secret, alors le joueur gagne et sort de la boucle Tant que 
			if (nbsaisi == nbsecret) System.out.println ("Gagné ! Il vous a fallu "+ essais +" coups pour gagner. Le nombre était bien : " +nbsecret);
			
			/* Si le nombre saisi est inférieur au nombre secret, 
			cela indique au joueur que le nombre saisi est trop bas par rapport au nombre secret*/
			if (nbsaisi < nbsecret) System.out.println("Trop bas !");
			
			/* Si le nombre saisi est supérieur au nombre secret, 
			cela indique au joueur que le nombre saisi est trop haut par rapport au nombre secret*/
			if (nbsaisi > nbsecret)	System.out.println("Trop haut !");
			
			// Si le joueur n'a pas réussi à deviner le mot malgré les 10 essais, alors le joueur perd et sort de la boucle Tant que 
			if (essais==10 && nbsaisi != nbsecret) System.out.println("Perdu ! Le nombre à trouver était : " +nbsecret);			 
			
		}
		
	   System.out.println();
       System.out.println("Merci d'avoir joué !");

	    }
		

}
package Lenbmystérieux;
import java.util.Random; //inclusion d'une fonction pour définir un nombre au hasard

public class Exo1DM
{
	
	public static void main(String[] args)
		{
		
		// Déclaration des variables
			
		int nbsaisi, essais, nbsecret; /*nbsaisi désigne le nombre à saisir par le joueur 2
										 essais désigne le nombre d'essais du joueur 2
										 nbsecret désigne le numéro secret défini par la fonction Random */
										

		// Affichage des règles du jeu
		
			System.out.println("Voici les règles du jeu :\n"
				+ "- Il s'agit d'un jeu à 2 joueurs.\n"
				+ "- Le premier joueur introduit un nombre secret. Ce nombre secret doit être compris entre 1 et 100.\n"
				+ "- Le deuxième joueur essaie de le découvrir en proposant des nombres.\n"
				+ "- Le premier joueur ne peut répondre que par 'Trop haut !' ou 'Trop bas !' ou 'Gagné'.\n"
				+ "- Le deuxième joueur dispose de 10 essais pour tenter de trouver le nombre secret.");
		
		// Début du jeu et choix du nombre aléatoire

        System.out.println();
		System.out.println("Nous allons choisir un nombre compris entre 1 et 100.");
		System.out.println();
		nbsecret = new Random().nextInt(100); // L'ordinateur définit un nombre au hasard
		essais = 0; // mettre la variable essais à zéro
		nbsaisi = 0; // mettre la variable nbsaisi à zéro
		
		// Joueur 2
		
		while (essais<10 && nbsaisi != nbsecret) /* Le programme continuera à tourner tant que le nombre d'essai est inférieur à 10
		                                            et le nombre saisi est différent du nombre secret */
		{
			
		   // Saisie d'un nombre d'essai pour trouver le nombre secret défini par l'ordinateur
		   nbsaisi = Saisie.lire_int("Veuillez saisir un nombre compris entre 1 et 100, il vous reste "+ (10 - essais) +" essais.");
		   
		   
		   while (nbsaisi < 1 || nbsaisi > 100) /* Une boucle qui permet ainsi à l'utilisateur de ne pas saisir un nombre qui n'est 
		                                           pas inclus dans l'intervalle 1 à 100 sous peine de ne pas en sortir. */
			{
			   
			// Saisie d'un nombre d'essai pour trouver le nombre secret défini par l'ordinateur  
		   nbsaisi = Saisie.lire_int("Erreur, le nombre saisi n'est pas compris entre 1 et 100, veuillez recommencer");
			
			}
			
			if (nbsaisi >= 1 && nbsaisi <= 100) /* Si le nombre saisi par l'utilisateur est inclus dans l'intervalle 1 à 100
			                                       alors l'utilisateur aura utilisé une tentative sur 10, et ainsi de suite. */
			{
				essais = essais+1;
				
			}
			// Si le nombre saisi est identique au nombre secret, alors le joueur gagne et sort de la boucle Tant que 
			if (nbsaisi == nbsecret) System.out.println ("Gagné ! Il vous a fallu "+ essais +" coups pour gagner. Le nombre était bien : " +nbsecret);
			
			/* Si le nombre saisi est inférieur au nombre secret, 
			cela indique au joueur que le nombre saisi est trop bas par rapport au nombre secret*/
			if (nbsaisi < nbsecret) System.out.println("Trop bas !");
			
			/* Si le nombre saisi est supérieur au nombre secret, 
			cela indique au joueur que le nombre saisi est trop haut par rapport au nombre secret*/
			if (nbsaisi > nbsecret)	System.out.println("Trop haut !");
			
			// Si le joueur n'a pas réussi à deviner le mot malgré les 10 essais, alors le joueur perd et sort de la boucle Tant que 
			if (essais==10 && nbsaisi != nbsecret) System.out.println("Perdu ! Le nombre à trouver était : " +nbsecret);			 
			
		}
		
	   System.out.println();
       System.out.println("Merci d'avoir joué !");

	    }
		

}
