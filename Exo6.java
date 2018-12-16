package exo6;

import java.util.Scanner;

public class Exo6 {

	public static void main(String[] args) {
	
		Scanner calcul = new Scanner(System.in);
		System.out.println("entrer un nombre entier");
		// je demande a l'utilisateur de rentrer un nombre 
		
		int n1 = calcul.nextInt();
		// enregistrement de la reponse 
		
		System.out.println("entrer un second nombre entier");
		// Je demande a l'utilisateur de rentrer un second nombre entier 
		
		int n2 = calcul.nextInt();
		// enregistrement de la reponse 
		
		System.out.println("Saisie de l'operateur : 1=+, 2=-,3=/,4=* "); // saisie uniquement numerique 
		
		int result = calcul.nextInt();
		
		if(-1000<n1 && n2 >1000) {
				
		
		
		// a == 10
		if (result == 1)
		{
			System.out.println("result " + n1 + n2);
		}
		
		if (result == 2) 
		{ 
			int n3=0;
			n3=n1 -n2 ;
			System.out.println("result " + n3);	
		}
		if (result == 3)
		{
			System.out.println("result " + n1 / n2);
		}
			
			if  (n2!= 0 && n1!=0)
		 
			System.out.println("vous avez divisez par zero");} 
			
		
		
			}
			}
		if (result == 4)
		{
			System.out.println("result " + n1 * n2);
		}
		
			
		
		
			
			
			
			/*
		else 
		{
			System.out.println("result" + n1 - n2);
		}
		if (result = "2")
		{
			System.out.println("result ");
		}
			*/
			calcul.close();
	}
	}
	
		

/*		Scanner reader = new Scanner(System.in); // ouverture du scanner attente dune entrer 
		
System.out.println("entrer deux nombres entiers");   // utilisateur doit entrer un nombre

		int reader1 = reader.nextInt();				// nombre entier un / on passe au suivant 
		
		int boo = reader.nextInt();					// nombre entier deux / on passe a la suite
		
System.out.println("Premiere renter" + reader1  + "Deuxieme entrer" +  boo); // reponse donné a l'utilisateur nombre un + nombre 2

		
System.out.println("selectionner un operateur");			// utilisateur doit selectionner un operateur 

String wow = reader.nextLine();
	

		
	

if (wow == +)  // si wow et egal a + 
	
		

	}

}
}

 Exercice 06
Récupérer la saisie de 2 nombres entiers
, puis la saisie d'un opérateur '+', '-', '*' ou '/'.
Si l'utilisateur entre un opérateur erroné, le programme affichera un message d'erreur.
Dans le cas contraire, le programme effectuera l'opération demandée (en prévoyant le
cas d'erreur "division par 0"), puis affichera le résultat.
hypothèses :
- les bornes -1000 et 1000 sont acceptées
- si l'opérateur n'est pas correct, on effectue une addition
V0 : pas de prise en compte de la conception du programme (séparation entre trt et affichage)*/