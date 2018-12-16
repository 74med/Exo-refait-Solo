package exo12;

public class Exo12 {

	public static void main(String[] args) {
		

		int tableauEntier[] = new int[5];
		
		
		for (int i = 0; i<tableauEntier.length; i++){
			
			tableauEntier[i] = (int)(Math.random() * 11);
			System.out.println(tableauEntier[i]);
		}
		
		for (int result = 0; result < tableauEntier.length; result++)
		{
			
		if (tableauEntier[result]== 4) 
		{
			System.out.println("le chiffre 4 est en position " + (result+1));
		}
		}
		
		
		
	}
}
		
		

		
		
		
		
		
		/*
		int tableauEntier[] = new int[5];
		tableauEntier[4]= 10;
		
		System.out.println(tableauEntier);
		int max = 10;
		int min = 0;
		int range = max - min + 1;
		
		for (int i = 0; i < 5; i++) { 
			 int rand = (int)(Math.random() * range) + min; 
	     System.out.println(rand); 
		
	    // Si la valeur 4 ce trouve dans le tableau alors afficher ca position
	       
	
	     
			if (i == 4){
			     System.out.println(i + " est sortie");
			}    
		

			
	
	}
	}
}
*/
		
/*Exercice 12
Déclarez une variable de type tableau de 5 entiers.
Remplissez ce tableau avec des valeurs aléatoires comprises entre 0 et 10.
Indiquez si la valeur 4 est dans le tableau, si oui indiquez sa position.

*int nombreAleatoire = 5 + (int)(Math.random() * ((10 - 5) + 1));
		System.out.println(nombreAleatoire);
*
*	    System.out.println(rand + " la valeur 4 est bien presente dans le tableau = ");

*
*
*
*
*
*/