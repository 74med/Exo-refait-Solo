package exo15;

import java.util.Scanner;

public class Exo15 {

	public static void main(String[] args) {

		
/*		Exercice 15
		Demandez la saisie d'un mot à l'utilisateur
		Afficher les trois derniers caractères de ce mot
		Afficher ce mot sans les deux premier caractère et sans les trois dernier caractères
		(NB : Gérez le cas où le mot n'est assez long )
		*/
		
		
		System.out.println("Veuillez entrer un mot s'il vous plait ");
		Scanner reader = new Scanner(System.in);
		String mot = reader.nextLine();
		System.out.println("Vous venez d'entrer le mot " + mot); // j'ai choisi le mot bonjour
		
		String recup = mot.substring(0, 4);
		System.out.println("resultat = " + recup + " moins les trois dernieres lettres");
		
		// "hamburger".substring(4, 8) returns "urge"
		// "smiles".substring(1, 5) returns "mile"
		
		recup = mot.substring(2, mot.length()-3) ;
		
		System.out.println("Resultat sans les deux premier caractère et sans les trois dernier caractères " + recup);
	
		for (int i = 0; i < mot.length(); i++);


		int i = 0;
		if( i < 5) { //condition)
				
				System.out.println("ok tout fonctionne ");
				   //Exécution des instructions si la condition est remplie 	
				}
				else
				{
				System.out.println("erreur car mot trop petit");

				  //Exécution des instructions si la condition n'est pas remplie
				}
				
				
		
		reader.close();
	}

}
