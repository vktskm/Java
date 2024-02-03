package esercizio2;

import java.util.Scanner;

/* Esercizio 2
 * Scrivere un programma Java che chieda all’utente di inserire 
 * da tastiera un numero intero n non negativo (cioè positivo o 
 * nullo), e calcoli (usando un opportuno ciclo while) il fatto-
 * riale di n, cioè il prodotto di tutti i numeri compresi tra 1 
 * e n. Si ricorda che, per definizione, il fattoriale di 0 è 1.
 *******/

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner tastiera = new Scanner(System.in);
		  int n, fattoriale, indice;

		  n = -1;
	      while (n < 0) {
	         System.out.print("Inserisci un numero intero non negativo: ");
		     n = tastiera.nextInt();
			 if (n < 0)
	            System.out.println("Il numero inserito deve essere non negativo!");
	      }
		  
		  fattoriale = 1;
		  indice = 1;
		  while (indice <= n) {
	         fattoriale *= indice;
			 indice++;
		  }

	      System.out.println("Il fattoriale di " + n + " e': " + fattoriale);
	}

}
