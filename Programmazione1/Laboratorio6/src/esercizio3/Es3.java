package esercizio3;

import java.util.Scanner;

/* Esercizio 3
 * Scrivere un programma Java che, letti da tastiera una stringa 
 * e un carattere, richiama il metodo cercaCarattere() per stabi-
 * lire se la stringa contiene il carattere specificato; 
 * in tal caso il metodo restituisce il valore booleano true, in 
 * caso contrario restituisce false.
 * Nel caso in cui il metodo cercaCarattere() abbia restituito true, 
 * invocare il metodo rimuoviCarattere() che, dati come argomenti la 
 * stringa e il carattere inseriti da tastiera, restituisce una nuova 
 * stringa in cui ogni occorrenza del carattere è stata rimossa. 
 * Stampare a video la stringa restituita dal metodo.*/

public class Es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
	      String stringaInput, stringa;
	      char carattere;
	      
	      // Legge da tastiera una stringa e poi un carattere
	      System.out.print("Inserisci una stringa: ");
	      stringa = tastiera.nextLine();
	      do {
	         System.out.print("Ora inserisci un carattere: ");
	         stringaInput = tastiera.nextLine();
	         if (stringaInput.length() != 1)
	            System.out.println("Devi inserire un solo carattere!");
	      } while (stringaInput.length() != 1);
	      carattere = stringaInput.charAt(0);
	      
	      if (cercaCarattere(stringa,carattere))
	         System.out.println("Stringa ottenuta rimuovendo il carattere: " +
	                            rimuoviCarattere(stringa,carattere));
	   }

	   public static boolean cercaCarattere (String stringa, char carattere) {
	      boolean trovato = false;
	      int i = 0;
	      
	      while (i < stringa.length() && !trovato) {
	         if (stringa.charAt(i) == carattere)
	            trovato = true;
	         else i++;
	      }
	      return trovato;
	   }   
	   
	   public static String rimuoviCarattere(String stringa, char carattere) {
	      String risultato = "";

	      for (int i = 0; i < stringa.length(); i++)
	         if (stringa.charAt(i) != carattere)
	            risultato += stringa.charAt(i);
	      
	      return risultato;
	}

}
