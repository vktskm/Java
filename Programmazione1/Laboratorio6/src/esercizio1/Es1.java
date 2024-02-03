package esercizio1;

import java.util.Scanner;

/* Esercizio 1
 * Scrivere un programma Java che stampi a video gli elementi di 
 * posizione pari di una sequenza di numeri interi positivi inse-
 * rita dall’utente. 
 * Il primo numero positivo avrà posizione 1, il secondo posizione 
 * 2, ecc.; i numeri negativi vengono ignorati, e non incrementano 
 * la posizione; la sequenza termina quando l’utente inserisce 0.
 * Il programma non deve usare array; costruirà invece la stringa 
 * di output man mano che l’utente inserisce i numeri. 
 * Inoltre, il programma deve essere composto da due metodi:
 * ➢ il main(), in cui si leggono i numeri interi, rifiutando quelli 
 * negativi con un messaggio d’errore, e si mantiene la stringa che 
 * andrà stampata alla fine dell’esecuzione;
 * ➢ il metodo aggiornaStringa(), che prende come argomento un numero 
 * intero positivo e la stringa attuale di output, e restituisce al 
 * chiamante la nuova stringa di output, con il numero aggiunto in 
 * fondo.
 ***/

public class Es1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
	      int numeroLetto;
	      
	      System.out.println("Inserisci una sequenza di numeri interi positivi, terminata da 0");
	      int posizione = 0;
	      String stringaOutput = "";
	      do {
	         System.out.print("- Inserisci un numero: ");
	         numeroLetto = tastiera.nextInt();
	         if (numeroLetto < 0)
	            System.out.println("Il numero inserito non e' valido, e' negativo!");
	         else if (numeroLetto > 0) {
	            posizione++;
	            if (posizione % 2 == 0)
	               stringaOutput = aggiornaStringa(stringaOutput,numeroLetto);
	         }
	      } while (numeroLetto != 0);
	      
	      System.out.println("Numeri di posizione pari letti: " + stringaOutput);
	   }
	   
	   public static String aggiornaStringa (String stringa, int numero) {
	      return stringa + " " + numero;
	   }

}
