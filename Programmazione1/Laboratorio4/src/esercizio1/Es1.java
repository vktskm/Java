package esercizio1;

import java.util.Scanner;

/* Esercizio 1
 * Scrivere un programma Java che faccia inserire all’utente 
 * un numero intero positivo n, e successivamente una sequenza 
 * di numeri interi positivi. La sequenza non termina finché 
 * non viene reinserito il numero n.
*/

public class Es1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tastiera = new Scanner(System.in);
		  boolean inputValido;
		  int n, numeroLetto;

		  n = 0;
		  while (n <= 0) {
	         System.out.print("Inserisci un numero intero positivo n: ");
	         n = tastiera.nextInt();
	         if (n <= 0)
	            System.out.println("Il numero inserito non e' positivo!");		
		  
		  System.out.println("Il numero inserito e': " + n);
		  System.out.println("Inserisci ora una sequenza di interi positivi, terminata da " + n + ":");
		  
		  System.out.print("Inserisci un numero: ");
		  numeroLetto = tastiera.nextInt();
		  while (numeroLetto != n) {
	         System.out.print("Inserisci un numero: ");
	         numeroLetto = tastiera.nextInt();
			 if (numeroLetto <= 0)
	            System.out.println("Il numero inserito non e' positivo!");
		  }
		  System.out.println("Programma terminato.");
	}

  }
}
