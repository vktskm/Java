package esercizio4;

import java.util.Scanner;

/* Scrivere un programma Java che legga da tastiera una stringa di 4 caratteri. 
 * Se la stringa non è di 4 caratteri, stampa un messaggio d’errore e termina 
 * l’esecuzione. Se ogni carattere è una cifra tra 0 e 9, calcola il numero 
 * intero rappresentato da tale stringa, altrimenti stampa un messaggio di errore.
 * Di seguito vengono presentati tre esempi di I/O risultanti dall'esecuzione del 
 * programma implementato:
 * Inserisci una stringa di 4 caratteri: 123
 * La stringa non e’ di 4 caratteri!
 * Inserisci una stringa di 4 caratteri: 8192
 * Il numero corrispondente e’: 8192
 * Inserisci una stringa di 4 caratteri: 81a2
 * La stringa contiene caratteri non validi!*/


public class Es4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tastiera = new Scanner(System.in);
	
		char carattere;
		  
		  System.out.print("Inserisci una stringa di 4 cifre: ");
		  String stringa = tastiera.next();
		  if (stringa.length() != 4) {
	         System.out.println("La stringa non e' di 4 caratteri!");
			 System.exit(-1);
		  }
		  
		  // Controlla che ogni carattere sia una cifra
		  carattere = stringa.charAt(0);
		  if (carattere < '0' || carattere > '9') {
	         System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }
		  
		  carattere = stringa.charAt(1);
		  if (carattere < '0' || carattere > '9') {
	          System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }
		  
		  carattere = stringa.charAt(2);
		  if (carattere < '0' || carattere > '9') {
	         System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }
		  
		  carattere = stringa.charAt(3);
		  if (carattere < '0' || carattere > '9') {
	         System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }

		  // Converte la stringa in intero
		  int valore = 0;
		  valore += stringa.charAt(3) - '0';
		  valore += 10*(stringa.charAt(2) - '0');
		  valore += 100*(stringa.charAt(1) - '0');
		  valore += 1000*(stringa.charAt(0) - '0');
		  
		  System.out.println("Il numero corrispondente e': " + valore);
	}

}
