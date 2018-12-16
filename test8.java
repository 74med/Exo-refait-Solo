package exo8;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {

		
		System.out.println("veuillez entrer votre age");
		// je demande a l'utilisateur d'entrer un age 
		
		Scanner reader = new Scanner(System.in);
		
		int i = 0;
		// initialisation de i (donc i est egal à zero
		
		int jeunes = 0;
		// initialisation de jeunes qui je precise aurait pu s'appeler comme bon me semble (donc jeunes est egal a zero
		
		for (jeunes = 0 ;jeunes <20 ; jeunes++) {
			//pour jeunes = 0 jeunes est plus petit que 20 alors jeune +1
			int age = reader.nextInt();
			// initialisation de age = stockage saisi des 20 utilisateurs
			System.out.println("vous avez entrer " + age);		
			// reponse donné a l'utilisateur + age saisie 
		if (age < 20) {
			// si age et plus petit que 20 
			i++ ;
			// alors on rajoute 1 jeune jusqua atteindre 20
			
		}
		}
		System.out.println("il y a " + i + " jeunes de moins de vingt ans");
		/*une fois  20 saisie utilisateur stocker la reponse donner est il y 
		a "tant" de jeunes de moins de 20 ans / fin du programme*/
		
		
		
	}

}
/* je dois calculer le nombre de jeune
 * je dois dénombrer toutes les personnes d'âge inférieur strictement à vingt ans 
 * parmi un échantillon donné de vingt personnes
 *  
 *  
 * 
 */