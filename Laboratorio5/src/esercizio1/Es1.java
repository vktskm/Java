package esercizio1;

import java.util.Scanner;

/* Esercizio 1
 * Scrivere un programma Java che legga da tastiera un intero positivo 
 * n e stampi a video la più piccola potenza di 2 maggiore di n.
 * */
public class Es1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
	      int n;
	      
	      do {
	         System.out.print("Inserisci un numero intero positivo: ");
	         n = tastiera.nextInt();
	         if (n <= 0)
	            System.out.println("Il numero deve essere positivo!");
	      } while (n <= 0);
	      
	      int potenza = 1;
	      while (potenza <= n)
	         potenza *= 2;
	     
	      System.out.println("Numero inserito: " + n);
	      System.out.println("Piu' piccola potenza di 2 maggiore di " + n + ": " + potenza);
	}

}
