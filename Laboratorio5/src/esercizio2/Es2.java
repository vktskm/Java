package esercizio2;

import java.util.Scanner;

/* Esercizio 2
 * Scrivere un programma Java che, lette da tastiera due stringhe 
 * a e b, calcoli la lunghezza del massimo prefisso comune. 
 * Ad esempio, se a = cavallo e b = cavallerizza, il programma
 * stamperà a video:
 * Il massimo prefisso comune tra le stringhe “cavallo” e “caval-
 * lerizza” ha lunghezza 6 in quanto cavall è la parte iniziale in 
 * comune ad entrambe le stringhe.
 *******/

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
	      int lunghezzaMinima;

	      // Chiede in input le due stringhe
	      System.out.print("Inserisci la prima stringa: ");
	      String stringa1 = tastiera.nextLine();
	      System.out.print("Inserisci la seconda stringa: ");
	      String stringa2 = tastiera.nextLine();
	      
	      // Calcola la lunghezza minima tra le due stringhe
	      if (stringa1.length() <= stringa2.length())
	         lunghezzaMinima = stringa1.length();
	      else
	         lunghezzaMinima = stringa2.length();
	      
	      // Calcola la lunghezza della più lunga prefissa
	      int lunghezzaPrefissa = 0;
	      while (lunghezzaPrefissa < lunghezzaMinima && 
	             stringa1.charAt(lunghezzaPrefissa) == stringa2.charAt(lunghezzaPrefissa))
	         lunghezzaPrefissa++;
	     
	      // Stampa il risultato
	      System.out.println("Il massimo prefisso comune tra le stringhe \"" + stringa1 +
	                         "\" e \"" + stringa2 + "\" ha lunghezza " + lunghezzaPrefissa);
	}

}
