package exo13;

import java.util.Scanner;

public class Exo13 
{

	public static void main(String[] args) 
	{

		System.out.println("veuillez entrer une chaine de caractere");

		Scanner reader = new Scanner(System.in);
		String chaine = reader.nextLine();

		System.out.println("Veuillez saisir une lettre");
		String lettre = reader.nextLine();		
		System.out.println("vous avez choisis la lettre " + lettre);


		char conver = lettre.charAt(0);
		int i = 0;
		int test = 0;	
		for(i = 0; i < chaine.length(); i++) 
		{

			if (chaine.charAt(i) == conver)
			{
				test++;
				

			}		
		}
		System.out.println( " il a " + test + " lettre " + lettre);
		reader.close();
	}

}
