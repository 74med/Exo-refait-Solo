package exo14;

import java.util.Scanner;

public class Exo14 {

	public static void main(String[] args) {
		
		System.out.println("Veuillez saisir une chaine de caractere ");
		Scanner reader = new Scanner(System.in);
		String chaine = reader.nextLine();
		System.out.println("Vous avez saisie " + chaine);
		
		chaine = chaine.toUpperCase();
		System.out.println("En mode majuscule " + chaine);

		chaine = chaine.substring(0,1).toUpperCase() + chaine.substring(1).toLowerCase();
		System.out.println("Voici votre reponse avec une majuscule " + chaine);
		
		reader.close();

		
	}

}
