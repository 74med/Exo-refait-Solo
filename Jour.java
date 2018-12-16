import java.util.Scanner;

public class Jour {

	public static void main(String[] args) {
	
		String pseudo = "quelle votre nom ?";
		System.out.println(pseudo);
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("vous avez saisie " + name);
		
		sc.close();
		
	}

}

