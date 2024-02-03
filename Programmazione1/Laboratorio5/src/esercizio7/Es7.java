package esercizio7;

import java.util.Scanner;

/* Esercizio 7
 * Scrivere un programma Java che, lette da tastiera due 
 * stringhe genoma e proteina, entrambe formate dalle let-
 * tere A, C, G, T (che indicano rispettivamente Adenina, 
 * Citosina, Guanina e Timina,le quattro basi azotate che 
 * compongono il DNA) stampi a video tutte le occorrenze 
 * della stringa proteina all’interno della stringa genoma, 
 * senza usare i metodi substring() e indexOf() della clas-
 * se String.
 * Ad esempio, se genoma = ACCAGTCAGTGCAATC e proteina = AGT, 
 * il programma stamperà a video:
 * La sequenza AGT compare in ACCAGTCAGTGCAATC nelle seguenti 
 * posizioni: 4, 8
 * Si noti che la prima posizione ha indice 1.
 * Altro esempio: se genoma = AAAAAAA e proteina = AAA, il 
 * programma stamperà a video:
 * La sequenza AAA compare in AAAAAAA nelle seguenti posizioni: 
 * 1, 2, 3, 4, 5*/
public class Es7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
	      String genoma,proteina;
	      boolean stringaValida;
	      int posizione, posizioniTrovate;
	      boolean stringheCombaciano;
	      
	      // Legge le due stringe genoma e proteina da tastiera.
	      // Le stringhe devono essere formate dai caratteri A, C, G, T
	      do {
	         System.out.print("Inserisci il genoma: ");
	         genoma = tastiera.nextLine();
	         stringaValida = true;
	         if (genoma.length() == 0) 
	        	 stringaValida = false;
	         
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
	         if (proteina.length() == 0) 
	        	 stringaValida = false;
	         
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
	         for (posizione = 0; posizione <= genoma.length() - proteina.length(); posizione++) {
	            // La variabile combaciano diventa false se si scopre che proteina non può comparire
	            // nella posizione attuale di genoma
	            stringheCombaciano = true;
	            for (int i = 0; i < proteina.length() && stringheCombaciano; i++)
	               if (proteina.charAt(i) != genoma.charAt(posizione + i))
	                  stringheCombaciano = false;
	            if (stringheCombaciano) {
	               if (posizioniTrovate == 0)
	                  // E' la prima posizione trovata, non stampiamo la virgola
	                  System.out.print(posizione + 1);
	               else 
	                  System.out.print(", " + (posizione + 1));
	               posizioniTrovate++;   
	            }               
	         }
	         if (posizioniTrovate == 0)
	            System.out.print("nessuna");
	      }
	}

}
