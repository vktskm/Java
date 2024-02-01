package esercizio3;

import java.util.Scanner;

/* Esercizio 3
 * Scrivere un programma Java che legga da tastiera due numeri 
 * interi, base e esponente, il secondo dei quali deve essere 
 * maggiore o uguale a 0, e calcoli l’elevamento del primo 
 * numero alla potenza indicata dal secondo (non utilizzando il 
 * metodo Math.pow()). Si noti che base può anche essere
 * negativo o nullo.
 ******/

public class Es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tastiera = new Scanner(System.in);
		  int base, esponente, risultato, indice;

	      System.out.print("Inserisci la base (numero intero): ");
		  base = tastiera.nextInt();
		  
	      System.out.print("Inserisci l'esponente (numero intero maggiore o uguale a 0): ");
		  esponente = tastiera.nextInt();
		  while (esponente < 0) {
	         System.out.println("Il numero inserito deve essere maggiore o uguale a 0!");
	         System.out.print("Inserisci l'esponente (numero intero maggiore o uguale a 0): ");
		     esponente = tastiera.nextInt();
		  }
		  
		  // Calcolo dell'elevamento a potenza
	      risultato = 1;
		  indice = 1;
		  while (indice <= esponente) {
	         risultato *= base;
			 indice++;
		  }
		  
	      System.out.println("Il risultato dell'elevamento a potenza e': " + risultato);

	}

}
