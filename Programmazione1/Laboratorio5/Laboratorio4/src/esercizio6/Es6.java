package esercizio6;

import java.util.Scanner;

/* Esercizio 6
 * Scrivere un programma Java che, lette da tastiera due stringhe 
 * formate da 0 e 1 di uguale lunghezza,consideri tali stringhe 
 * come rappresentanti gli elementi di due insiemi. 
 * Ad esempio, se le stringhe inserite dall’utente sono 01101 e 
 * 10110, abbiamo che:
 * - il primo insieme, rappresentato dalla stringa 01101, contiene 
 * il secondo, terzo e quinto elemento;
 * - il secondo insieme, rappresentato dalla stringa 10110, contiene 
 * il primo, terzo e quarto elemento.
 * Dopo aver verificato la validità delle stringhe inserite (devono 
 * essere composte solamente da 0 e 1, e devono avere la stessa lun-
 * ghezza), stampare a video le due stringhe corrispondenti all’unio-
 * ne e all’intersezione dei due insiemi. 
 * Quindi, se l’utente inserisce le due stringhe 01101 e 10110 indi-
 * catesopra, il programma stamperà la stringa 11111 come rappresen-
 * tante dell’unione, e 00100 come rappresentante dell’intersezione
 * */

public class Es6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tastiera = new Scanner(System.in);
		  String stringa1, stringa2, unione, intersezione;
	      int i;
	      
	      System.out.print("Inserisci la  prima  stringa di bit: ");
		  stringa1 = tastiera.next();
	      
	      // Controlla la validità della prima stringa
	      i = 0;
		  while (i < stringa1.length()) {
	         if (stringa1.charAt(i) != '0' && stringa1.charAt(i) != '1') {
	            System.out.println("La stringa inserita non e' valida!");
	            System.exit(-1);
	         }
	         i++;
		  }

	      System.out.print("Inserisci la seconda stringa di bit: ");
		  stringa2 = tastiera.next();
	      
	      // Controlla la validità della seconda stringa
	      i = 0;
		  while (i < stringa2.length()) {
	         if (stringa2.charAt(i) != '0' && stringa2.charAt(i) != '1') {
	            System.out.println("La stringa inserita non e' valida!");
	            System.exit(-1);
	         }
	         i++;
		  }
	      
	      // Controlla che le due stringhe abbiano la stessa lunghezza
	      if (stringa1.length() != stringa2.length()) {
	         System.out.println("Le due stringhe hanno lunghezze diverse, non e' possibile procedere!");
	         System.exit(-1);
	      }
	      
	      // Calcola le stringhe corrispondenti a unione e intersezione
	      unione = "";
	      intersezione = "";
	      i = 0;
	      while (i < stringa1.length()) {
	         // Unione
	         if (stringa1.charAt(i) == '1' || stringa2.charAt(i) == '1')
	            unione += '1';
	         else
	            unione += '0';
	         // Intersezione
	         if (stringa1.charAt(i) == '1' && stringa2.charAt(i) == '1')
	            intersezione += '1';
	         else
	            intersezione += '0';
	         i++;
	      }
	      
	      System.out.println("Unione: " + unione);
	      System.out.println("Intersezione: " + intersezione);
	}

}
