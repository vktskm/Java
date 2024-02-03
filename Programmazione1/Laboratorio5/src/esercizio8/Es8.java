package esercizio8;

import java.util.Scanner;

/* Esercizio 8
 * Scrivere un programma Java che, lette da tastiera due stringhe 
 * composte dalle cifre da 0 a 9, che rappresentano due numeri 
 * interi n e m, calcoli il prodotto n*m usando l’algoritmo imparato 
 * alle scuole elementari (e stampandone a video i passaggi). 
 * Ad esempio, se n = 2431 e m = 523, abbiamo:
 *    2431
 *     523
 *    ----
 *    7293
 *   4862
 * 12155
 * -------
 * 1271413
 * Quindi il programma stamperà a video (non necessariamente allineate 
 * come mostrato sopra) le stringhe: 7293, 4862, 12155, 1271413.
 ******/

public class Es8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
	      String n, m;
	      boolean stringaValida;
	      String somma, parziale, zeriFinali, nuovaSomma;
	      int cifraM, cifraN, prodottoCifre, cifraSomma, cifraParziale, sommaCifre, riporto;
	      
	      // Legge le due stringe che rappresentano i numeri n ed m
	      do {
	         System.out.print("Inserisci il numero n: ");
	         n = tastiera.nextLine();
	         stringaValida = true;
	         if (n.length() == 0) stringaValida = false;
	         for (int i = 0; i < n.length() && stringaValida; i++)
	            if (n.charAt(i) < '0' || n.charAt(i) > '9')
	               stringaValida = false;
	         if (!stringaValida)
	            System.out.println("La stringa deve essere non vuota, e formata dalle cifre da 0 a 9!");
	      } while (!stringaValida);

	      do {
	         System.out.print("Inserisci il numero m: ");
	         m = tastiera.nextLine();
	         stringaValida = true;
	         if (m.length() == 0) stringaValida = false;
	         for (int i = 0; i < m.length() && stringaValida; i++)
	            if (m.charAt(i) < '0' || m.charAt(i) > '9')
	               stringaValida = false;
	         if (!stringaValida)
	            System.out.println("La stringa deve essere non vuota, e formata dalle cifre da 0 a 9!");
	      } while (!stringaValida);

	      // La stringa somma conterrà alla fine il prodotto dei due numeri, calcolato
	      // facendo le somme dei valori parziali indicati nel testo dell'esercizio
	      System.out.println("\nParziali:");
	      somma = "";
	      zeriFinali = "";
	      for (int i = m.length()-1; i >= 0; i--) {
	         // Calcola il parziale da aggiungere alla somma, e lo stampa a video
	         parziale = "";
	         riporto = 0;
	         cifraM = m.charAt(i) - '0';
	         for (int j = n.length()-1; j >= 0; j--) {
	            cifraN = n.charAt(j) - '0';
	            prodottoCifre = cifraM * cifraN + riporto;
	            riporto = 0;
	            if (prodottoCifre > 9) {
	               riporto = prodottoCifre / 10;
	               prodottoCifre = prodottoCifre % 10;               
	            }
	            parziale = (char) (prodottoCifre + '0') + parziale;
	         }
	         if (riporto > 0)
	            parziale = (char) (riporto + '0') + parziale;
	         System.out.println(parziale);
	         // Somma il parziale al totale
	         if (somma.length() == 0)
	            somma = parziale;
	         else {
	            zeriFinali += "0";
	            parziale += zeriFinali;
	            
	            // Aggiunge il parziale alla somma
	            // Per semplificare la procedura, rendiamo le due stringhe della stessa
	            // lunghezza, aggiungendo degli 0 in testa alla stringa più corta
	            int lunghezzaMassima = somma.length() > parziale.length() ? somma.length() : parziale.length();
	            int k;
	            for (k = somma.length() + 1; k <= lunghezzaMassima; k++)
	               somma = "0" + somma;
	            for (k = parziale.length() + 1; k <= lunghezzaMassima; k++)
	               parziale = "0" + parziale;
	           
	            // La variabile nuovaSomma conterrà il valore di somma + parziale
	            nuovaSomma = "";
	            riporto = 0;
	            for (k = lunghezzaMassima - 1; k >= 0; k--) {
	               cifraSomma = somma.charAt(k) - '0';
	               cifraParziale = parziale.charAt(k) - '0';
	               sommaCifre = cifraSomma + cifraParziale + riporto;
	               riporto = 0;
	               if (sommaCifre > 9) {
	                  riporto = sommaCifre / 10;
	                  sommaCifre = sommaCifre % 10;
	               }
	               nuovaSomma = (char) (sommaCifre + '0') + nuovaSomma;
	            }
	            if (riporto > 0)
	               nuovaSomma = (char) (riporto + '0') + nuovaSomma;
	            somma = nuovaSomma;            
	         }
	      }
	      System.out.println("\nTotale: " + somma);
	}

}
