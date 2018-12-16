package exo9;

import java.util.Scanner;

public class test9 {
	
		public static void main(String[] args) {

			
			System.out.println("veuillez entrer votre age");
			
			Scanner reader = new Scanner(System.in);
			
			int i = 0; 
			// on creer la valeur i = a zero 
			
			int jeunes = 0; 
			// on creer la veleur jeunes = a zero qui represente les jeunes de moins de 20 ans 
			
			int vieux = 0; 
			// on creer la valeur vieux = a zero qui represente les vieux de plus de 40 ans 	
			
			int entre = 0; 
			// on creer la valeur entre = a zero qui correspond au personnes qui on entre 20 et 40 ans 
			
			
			for (jeunes = 0 ;jeunes <5 ; jeunes++) {
				//pour jeune = 0 jeunes et plus petit que 20 alors on ajoute 1
				
				int age = reader.nextInt();
				// on creer la valeur age qui correspond a la reponse saisie faite par l'utilisateur 
				
				System.out.println("vous avez entrer " + age);	
				// reponse donné a l'utilisateur vous avez entrer + l'age saisie par l'utilisateur
				
			if (age < 20) {
				//si age est compris entre 0 et 20 ans
				
				i++ ;
				// alors on rajoute 1 jeune
			}
			if (age > 40 && age > 100) {
				//si age est compris entre 40 et 100 ans alors un vieux en plus 
				
				vieux++ ;
				// alors on rajoute 1 vieux

			}
 			
			if (age > 20 && age < 40) {
				//si age est compris entre 20 et 40 ans 
				
				entre++;
				// alors on rajoute 1 entre 

			}
			if (age > 100) {
				// si age est plus grand que 100 alors fin du programme
				
				System.out.println(" un centenaire a etait trouver, fin du programme");
				break ;
				// pour mettre fin au contage une fois le centenaire trouver 
			}
			
			
			}
			System.out.println("il y a " + i + " jeunes de moins de vingt ans");
			System.out.println("il y a " + vieux + " personnes de plus de 40 ans");
			System.out.println("il y a " + entre + " personnes entre 20 et 40 ans");
			
			reader.close();
		}

	}

/*Exercice 09
Reprenez l'échantillon de personnes de l'exercice 08
Il s’agit maintenant de dénombrer les personnes d'âge inférieur strictement à 20 ans, les
personnes d'âge supérieur strictement à 40 ans et celles dont l'âge est compris entre
20 ans et 40 ans (20 ans et 40 ans y compris).
Enfin il s'agit de faire l'opération précédente en ajoutant la contrainte ci-dessous.
Le comptage est arrêté dès la saisie d’un centenaire. Le centenaire est compté.
Pour chacune des demandes ci dessus, donnez le programme java correspondant qui affiche les résultats*/

