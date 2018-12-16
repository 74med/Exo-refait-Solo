package exo18;

import java.util.Scanner;

public class Exo18 {

	public static void main(String[] args) {
		
		/*Exercice 18
		Demandez une saisie d'un entier entre 0 et 256 puis afficher cet entier et sa conversion en char
		*/
		
			
		System.out.println("Veuillez entre un nombre entier compris entre 0 et 256");
		Scanner reader = new Scanner(System.in);
		
		int nombre = reader.nextInt();
		System.out.println("Vous avez choisi le nombre " + nombre);
		
	
		//	int a = 1;
	//	char b = Integer.toString(a).charAt(0);
	//	System.out.println(b);
	
	
		reader.close();
		
		
	}

}