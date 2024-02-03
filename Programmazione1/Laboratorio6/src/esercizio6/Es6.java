package esercizio6;

import java.util.Scanner;

/* Esercizio 6
 * Scrivere un programma Java che, lette da tastiera due stringhe 
 * genoma e proteina, entrambe formate dalle lettere A, C, G, T 
 * (che indicano rispettivamente Adenina, Citosina, Guanina e Timina,
 * le quattro basi azotate che compongono il DNA) stampi a video tutte 
 * le occorrenze della stringa proteina all’interno della stringa 
 * genoma, usando i metodi substring() e indexOf() della classe String 
 * (a differenza della scorsa esercitazione, in cui si chiedeva di non 
 * usarli). 
 * Tuttavia, anziché invocare i metodi della classe String, fare finta 
 * che non si possano usare e reimplementarli (nella stessa classe del 
 * metodo main()).
 * Ad esempio, se genoma = ACCAGTCAGTGCAATC e proteina = AGT, il 
 * programma stamperà a video:
 * La sequenza AGT compare in ACCAGTCAGTGCAATC nelle seguenti posizioni: 
 * 4, 8
 * Si noti che la prima posizione ha indice 1.
 * Altro esempio: se genoma = AAAAAAA e proteina = AAA, il programma 
 * stamperà a video:
 * La sequenza AAA compare in AAAAAAA nelle seguenti
 * posizioni: 1, 2, 3, 4, 5*/

public class Es6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
	      String genoma, proteina;
	      boolean stringaValida;
	      int posizione, posizioniTrovate;
	      String sottostringa;
	      boolean stringheCombaciano;
	      
	      // Legge le due stringe genoma e proteina da tastiera.
	      // Le stringhe devono essere formate dai caratteri A, C, G, T
	      do {
	         System.out.print("Inserisci il genoma: ");
	         genoma = tastiera.nextLine();
	         stringaValida = true;
	         if (genoma.length() == 0) stringaValida = false;
	         for (int i = 0; i < genoma.length() && stringaValida; i++)
	            switch (genoma.charAt(i)) {
	               case 'A':
	               case 'C':
	               case 'G':
	               case 'T': break;
	               default: stringaValida = false;
	            }
	         if (!stringaValida)
	            System.out.println("La stringa deve essere non vuota, e formata dai caratteri A,C,G,T!");
	      } while (!stringaValida);

	      do {
	         System.out.print("Inserisci la proteina: ");
	         proteina = tastiera.nextLine();
	         stringaValida = true;
	         if (proteina.length() == 0) stringaValida = false;
	         for (int i = 0; i < proteina.length() && stringaValida; i++)
	            switch (proteina.charAt(i)) {
	               case 'A':
	               case 'C':
	               case 'G':
	               case 'T': break;
	               default: stringaValida = false;
	            }
	         if (!stringaValida)
	            System.out.println("La stringa deve essere non vuota, e formata dai caratteri A,C,G,T!");
	      } while (!stringaValida);

	      // Cerca le occorrenza della stringa proteina all'interno della stringa genoma
	      System.out.println("La sequenza " + proteina + " compare in " + genoma + " nelle seguenti posizioni:");
	      if (proteina.length() > genoma.length())
	         System.out.print("nessuna");
	      else {
	         // Prova ogni possibile posizione in cui la stringa proteina può comparire all'interno
	         // della stringa genoma. La variabile posizioniTrovate registra il numero di posizioni
	         // in cui si è trovata la stringa proteina all'interno della stringa genoma
	         posizioniTrovate = 0;
	         posizione = indexOf(genoma, proteina.charAt(0), 0);
	         while (posizione <= genoma.length() - proteina.length() && posizione != -1) {
	            sottostringa = substring(genoma, posizione, posizione + proteina.length());
	            if (proteina.equals(sottostringa)) {
	               if (posizioniTrovate == 0)
	                  // E' la prima posizione trovata, non stampiamo la virgola
	                  System.out.print(posizione + 1);
	               else 
	                  System.out.print(", " + (posizione + 1));
	               posizioniTrovate++;   
	            }
	            posizione = indexOf(genoma, proteina.charAt(0), posizione + 1);
	         }
	         if (posizioniTrovate == 0)
	            System.out.print("nessuna");
	      }
	   }
	   
	   public static String substring (String stringa, int indiceIniziale, int indiceFinale) {
	      String risultato = "";
	      
	      // Controlla che i valori passati per indiceIniziale e indiceFinale abbiano senso
	      // Si noti che è accettato che sia indiceFinale < indiceIniziale: in tal caso,
	      // verrà restituita la stringa vuota
	      if (indiceIniziale < 0 || indiceIniziale >= stringa.length() ||
	          indiceFinale < 0 || indiceFinale > stringa.length()) {
	         System.out.println("Metodo substring: errore nell'uso degli indici!");
	         System.exit(-1);
	      }
	      
	      // Estrazione dei caratteri da stringa, e costruzione del risultato
	      // Si noti che indiceFinale è escluso, come nel metodo della classe String
	      for (int i = indiceIniziale; i < indiceFinale; i++)
	         risultato = risultato + stringa.charAt(i);
	     
	      return risultato;
	   }
	   
	   public static int indexOf(String stringa, char carattere, int indiceIniziale) {
	      int risultato = -1;
	      
	      int i = indiceIniziale;
	      while (i < stringa.length() && risultato == -1) {
	         if (stringa.charAt(i) == carattere)
	            risultato = i;
	         else
	            i++;
	      }
	      
	      return risultato;

	}

}
