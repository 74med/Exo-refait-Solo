package exo3;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		
		String nom = "Veullez saisir votre nom s'il vous plait";
		System.out.println(nom);
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("bonjour et bienvenue " + name);

		sc.close();
	}

}

/* 1.1 écrivez un programme qui demande son nom à un utlisateur et qui ensuite dit bonjour à cet utlisateur en
l’appelant par son nom.*/
