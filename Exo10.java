package exo10;

public class Exo10 {

	public static void main(String[] args) {

		
		
		
		
		int tableauEntier[] = {4,67,25,87};
		double tableauDouble[] = {4.5,67,25.50,87.00};
		char tableauCaractere[] = {'r','2','?','+'};
		String tableauChaine[] = {"Robert", "Noemie", "David" , "Bertrand"};
		
		System.out.println("le premier element du tableau numero un = " + tableauEntier[0]);
		// je dois afficher le premier elelement du tableau 1 

		
		 tableauEntier [2] = 42;

		//tableauEntier = new int[] {4,67,42,87};
		System.out.println("la valeur 25 du tableau un a etait modofier par la valeur " + tableauEntier[2]);
		
		for(int i = 0; i < tableauCaractere.length; i++) // on affiche via une boucle for toutes les valeurs de tableau3
		// pour i=0 i est plus petit que la longeur du tableau alors on continue
		{
		  System.out.println("À l'emplacement " + i +" du tableau3 nous avons = " + tableauCaractere[i]);
		  // resultat donner a l'utilisateur 
		}
		
		// je dois afficher la taille du tableau 1
		System.out.println(tableauEntier.length);
		
		
}
}