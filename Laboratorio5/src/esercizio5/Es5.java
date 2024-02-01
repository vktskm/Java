package esercizio5;

import java.util.Scanner;

/* Esercizio 5
 * La congettura di Collatz è un famoso problema matematico 
 * tuttora irrisolto. Tale congettura afferma che, partendo 
 * da un qualsiasi numero intero positivo n, applicando ri-
 * petutamente le seguenti operazioni si ottiene una sequen-
 * za di interi che termina sempre con 1:
 * ➢ se n = 1, termina
 * ➢ se n è pari, poni n = n / 2
 * ➢ se n è dispari (maggiore di 1), poni n = 3n+1
 * Scrivere un programma Java che, letto da tastiera un intero 
 * positivo n, stampi a video la sequenza di numeri ottenuti 
 * applicando ripetutamente le operazioni indicate sopra. 
 * Si noti che il programma termina solo se la congettura di 
 * Collatz vale per il numero n inserito.
 * Ad esempio, se n = 10, il programma stamperà a video la 
 * sequenza: 10, 5, 16, 8, 4, 2, 1.
 **/
public class Es5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
	      int n;
	      
	      // Legge il numero n in input
	      do {
	         System.out.print("Inserisci un numero intero positivo: ");
	         n = tastiera.nextInt();
	         if (n <= 0)
	            System.out.println("Il numero deve essere positivo!");
	      } while (n <= 0);

	      // Stampa la sequenza di Collatz
	      System.out.println("Sequenza di Collatz generata da " + n + ":");
	      while (n != 1) {
	         System.out.print(" " + n);
	         if (n % 2 == 0)
	            n = n / 2;
	         else
	            n = 3*n + 1;
	      }      
	      System.out.println(" " + n);
	}

}
