package exo5;

import java.util.Scanner;

public class Exo5 {

	public static void main(String[] args) {
 
		int i; //on initialyze i 
		
		Scanner reader = new Scanner(System.in); // on attent un retour ( reponse )
		
		System.out.println("veuillez entrer un nombre entier"); // on pose la question a l'utilisateur
		
		
		int reader1 = reader.nextInt(); // enregistrement données
		//
		System.out.println("le nombre choisi et " +reader1);
		 
		for ( i = 0 ; i <= 10; i++) {
		System.out.println(i*reader1);
		
		
		reader.close();
	}

}
}
 /*Exercice 05
Même chose mais l'utlisateur doit cioisir le nombre. */