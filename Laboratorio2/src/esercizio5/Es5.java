package esercizio5;

import java.util.Scanner;

/*
 * Scrivere un programma Java che legga da tastiera un numero intero n 
 * compreso tra 0 e 127, e stampi a video la sua rappresentazione in 
 * binario, usando sempre 7 bit. Se il numero inserito non è compreso 
 * tra 0 e 127, il programma deve stampare un messaggio d’errore e 
 * terminare subito l’esecuzione. Di seguito vengono presentati quattro 
 * esempi di I/O risultanti dall'esecuzione del programma Java
 * implementato:
 * Inserisci un numero: 123
 * La rappresentazione binaria di 123 e’: 1111011
 * Inserisci un numero: -123
 * Errore: il numero inserito deve essere compreso tra 0 e 127!
 * Inserisci un numero: 432
 * Errore: il numero inserito deve essere compreso tra 0 e 127!
 * Inserisci un numero: 3
 * La rappresentazione binaria di 3 e’: 0000011*/

public class Es5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tastiera = new Scanner(System.in);
		  
		  System.out.print("Inserisci un numero intero tra 0 e 127: ");
		  int numero = tastiera.nextInt();
		  if (numero < 0 || numero > 127) {
	         System.out.println("Errore: il numero deve essere compreso tra 0 e 127!");
			 System.exit(-1);
		  }
		  
		  // Salva il numero in un'altra variabile, per poter stampare il
		  // messaggio finale
		  int numeroSalvato = numero;
		  
		  // Fa la conversione in binario
		  String stringaDiBit = "";
		  if (numero % 2 == 0)
	         stringaDiBit = "0";
		  else
	         stringaDiBit = "1";
	      numero /= 2;
		  if (numero % 2 == 0)
	         stringaDiBit = "0" + stringaDiBit;
		  else
	         stringaDiBit = "1" + stringaDiBit;
	      numero /= 2;
		  if (numero % 2 == 0)
	         stringaDiBit = "0" + stringaDiBit;
		  else
	         stringaDiBit = "1" + stringaDiBit;
	      numero /= 2;
		  if (numero % 2 == 0)
	         stringaDiBit = "0" + stringaDiBit;
		  else
	         stringaDiBit = "1" + stringaDiBit;
	      numero /= 2;
		  if (numero % 2 == 0)
	         stringaDiBit = "0" + stringaDiBit;
		  else
	         stringaDiBit = "1" + stringaDiBit;
	      numero /= 2;
		  if (numero % 2 == 0)
	         stringaDiBit = "0" + stringaDiBit;
		  else
	         stringaDiBit = "1" + stringaDiBit;
	      numero /= 2;
		  if (numero % 2 == 0)
	         stringaDiBit = "0" + stringaDiBit;
		  else
	         stringaDiBit = "1" + stringaDiBit;	  
		  
		  System.out.println("La rappresentazione binaria di " + numeroSalvato + " e': " + stringaDiBit);

	}

}