import java.util.Scanner ;

public class Exercice7 {

	public static void main(String[] args) {
	
// je demande a l'utilisateur de choisir N 
		
		
		System.out.println("Choisisez un nombre entier");

// je recupere la saisie dans une variable
		
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		
// je demande a l'utilisateur de choisir un nombre X 
		
		System.out.println("choisisez un nombre multiplicateur");
		
// puis je stock ca saisie 
		
		int x = reader.nextInt();
		
// je calule la table de multiplication jusqua X puis j'affiche cette table

	
		
		for(int i = 0 ; i <= x ; i++ ) {  
		  
// on initialize i à 0 / pour i est plus petit que x / incrementation ++ pour run jusqua la valeur de x
	  
			int produit =	(n * i); 
			
// initialisation de produit = n fois i 
			
			
			System.out.println(produit);
		}
		
		
		
		
/*		
  		int result;
		int i = 0;
		while (i<=x) {
		result = n * i;
			System.out.println(result);
			i++;
		}		
*/
		
	
		
		
		
	}

}


/*Exercice 07
Ecrire un programme qui calcule les N premiers multiples d'un nombre entier X, N et X
étant entrés au clavier.


Il est demandé de choisir la structure répétitive (for, while, do...while) la mieux
appropriée au problème.


On ne demande pas pour le moment de gérer les débordements (overflows) dus à des
demandes de calcul dépassant la capacité de la machine.
*
* **************************************************** Cherchez l'erreur ...
*/