package paul;

import java.util.Scanner;

public class Paulexo {
	
public static void main(String[] args) {
	
	
		            System.out.println("========================bienvenue =========================");
		            System.out.println("etes vous pret pour le fight ou bien preferez-vous partir fumer ?");
		            Scanner sc = new Scanner(System.in);
		            String question = sc.nextLine();
		            if (question=="oui") 
		            {
		            System.out.println("###################lets fight begin##########################");
		            }
		            if (question=="non") 
		            {
		            System.out.println("profite bien on appelle l'asvp");
		            }
		            System.out.println("choisir votre champion   1)carapuce         2)salameche      3)germignon");
		            Var champion = sc.nextInt();
		            String choix[] = {"carapuce","salameche","germignon","darkrai"};
		            for(int i = 0; i < choix.length; i++);
		            System.out.println("un roucool shiny apparrait");
		            System.out.println("=====================================================================================================");
		            System.out.println("=====================================================================================================");
		            System.out.println("=====================================================================================================");
		            System.out.println("=====================================================================================================");
		            System.out.println("=====================================================================================================");
		            System.out.println("=====================================================================================================");
		            System.out.println("=====================================================================================================");
		            System.out.println("=====================================================================================================");
		            System.out.println("=====================================================================================================");
		            System.out.println("=====================================================================================================");
		            System.out.println("=====================================================================================================");
		            System.out.println("=====================================================================================================");
		            System.out.println("=====================================================================================================");
		            System.out.println("=====================================================================================================");
		             int roucool=50 ;



		            int h= (int)(Math.random() * 10 + 5); ;
		            for (int i=0  ;i<=50 ; i=i+h) {
		            System.out.println("que voulez-vous faire 1/attaquer ou bien essayer de le 2/capturer" );
		            var combat = sc.nextInt();
		            System.out.println("choisir votre capa : 1/ lance flame    2/vive-attaque        3/lance soleil");
		                var competance = sc.nextInt();
		                    if(competance==1)
		                    {    
		                    	System.out.println("salameche utilise lanceflame");
		                    }
		                    roucool=roucool - 10 ;
		                    System.out.println("roocool ennemy prend 10 dmg");
		                    System.out.println("roucool vie restante"+roucool);
		                     h=h+10; 
		                     }
		                        if(competance==2)
		                        {    System.out.println("salameche utilise vive-attaque");
		                        roucool=roucool - 7 ;
		                        System.out.println("roocool ennemy prend 7 dmg");
		                        System.out.println("roucool vie restante"+roucool);
		                        h=h+10;}
		                        if(competance==3)
		                        {    System.out.println("salameche utilise charge");
		                        roucool=roucool - 5 ;
		                        System.out.println("roocool ennemy prend 5 dmg");
		                        System.out.println("roucool vie restante"+roucool);
		                        h=h+10;}
		            
		            if (combat==2) {
		                int inco = (int)(Math.random() * 10 + 1);
		                System.out.println("1/poke ball     2/superball");
		                var ball = sc.nextInt();
		                if(ball==1)
		                {System.out.println("vous utilisez une poké ball");
		                if (inco==4) {
		                System.out.println("putin de merde bien joué vous abez capture roucool");
		                }
		                if (inco>4) {
		                System.out.println("dommage try again");
		                }
		                if (4>inco) {
		                System.out.println("c con hein");
		                }
		                }
		                }
		        }
	}
	

