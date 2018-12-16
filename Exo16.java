package exo16;

import java.util.Scanner;

public class Exo16 {

	public static void main(String[] args) {

		
		/*demandez la saisie d'un mot
		Déterminez si ce mot est un palindrome*/
		
		
		/*System.out.println("Veuillez entrer un mot s'il vous plait ");		
		Scanner reader = new Scanner(System.in);
		String mot = reader.nextLine();		
		System.out.println(" Vous avez choisi le mot " + mot);*/
		
		
	      String droit, retour = ""; // objet de ma class string
	      Scanner reader = new Scanner(System.in);
	     
	      System.out.println("Enter un mot afin de verifier si celui si est un palindrome");
	      droit = reader.nextLine();
	     
	      int length = droit.length();
	     
	      for (int i = length - 1; i >= 0; i--)
	         retour = retour + droit.charAt(i);
	         
	      if (droit.equals(retour))
	         System.out.println("ce mot est un palindrome.");
	      else
	         System.out.println("ce mot n'est pas un palindrome.");
	         
	   
	  
	  
	  
		
		
		reader.close();
	}

}
