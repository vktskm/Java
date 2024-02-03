package esercizio1;

import java.util.Scanner;

/* Esercizio 1
 * Scrivere un programma Java che legga da tastiera due numeri interi, 
 * corrispondenti a mese e anno, e stampi a video di quanti giorni è 
 * formato quel mese di quell’anno. Il numero corrispondente al mese
 * deve essere compreso tra 1 e 12, e il numero corrispondente all’anno 
 * deve essere compreso tra 1900 e 2099; in caso contrario, stampare un 
 * messaggio d’errore e terminare l’esecuzione del programma (usando il 
 * metodo exit()).
 * Si tenga anche conto del fatto che l’anno può essere bisestile. 
 * Si ricorda che un anno è bisestile se è divisibile per 4 e non è 
 * divisibile per 100; tuttavia, gli anni divisibili per 400 sono 
 * invece bisestili.
 * Quindi, ad esempio, il 1996 è stato bisestile (è divisibile per 4 ma 
 * non per 100, e non è divisibile per 400), il 1900 no (è divisibile 
 * per 4 ma anche per 100, mentre invece non è divisibile per 400), il
 * 2000 si (è divisibile per 400).
*/

public class Es1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tastiera = new Scanner(System.in);
	      int mese, anno;
		  boolean bisestile;

	      System.out.print("Inserisci il numero del mese (tra 1 e 12): ");
	      mese = tastiera.nextInt();
	      if (mese < 1 || mese > 12) {
	         System.out.println("Errore: numero del mese non valido!");
		     System.exit(-1);
	      }
	   
	      System.out.print("Inserisci il numero dell'anno (tra 1900 e 2099): ");
	      anno = tastiera.nextInt();
	      if (anno < 1900 || anno > 2099) {
	         System.out.println("Errore: numero dell'anno non valido!");
		     System.exit(-1);
	      }
		  
		  switch (mese) {
			 case 2: bisestile = (anno % 400 == 0) || ((anno % 4 == 0) && (anno % 100 != 0));
	                 if (bisestile)
	                    System.out.println("Il numero di giorni e' 29.");
	                 else
	                    System.out.println("Il numero di giorni e' 28.");
	                 break;
	         case 4:
			 case 6:
			 case 9:
			 case 11: System.out.println("Il numero di giorni e' 30.");
	                  break;
			 default: System.out.println("Il numero di giorni e' 31.");
		  }
		
	}
}
