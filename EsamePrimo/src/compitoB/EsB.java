package compitoB;

import java.util.Scanner;

/* Scrivere un programma Java denominato EsameB.java che:
 * - legga da tastiera un numero intero positivo n (rifiutando quindi eventuali numeri 
 * negativi o nulli, e chiedendo nuovamente di inserire un intero positivo);
 * - legga da tastiera una sequenza di numeri interi positivi (rifiutando quindi numeri 
 * minori o uguali a 0) fino a che non viene inserito nuovamente il numero n; 
 * - per ogni numero letto, escluso n, aggiorni il prodotto prod, il massimo max e il 
 * minimo min dei numeri letti;
 * - una volta fatto ciò, stampi a video i valori delle variabili prod, min e max;
 * - poi, calcoli la media (in virgola mobile) di tutte le somme i+j, con i intero che 
 * varia fra max e prod e j intero che varia fra min e max;
 * - visualizzi infine il risultato dell’elaborazione, stampando a video il valore della 
 * media.
 * Norme di implementazione
 * Il programma deve essere realizzato utilizzando esclusivamente i concetti di 
 * programmazione presentati nella prima parte del corso. L’unico tipo di ciclo 
 * consentito è il while. Il programma deve essere realizzato in modo da non 
 * generare errori in compilazione.
 ***************/

public class EsB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		  int n, numeroLetto;

		  n = -1;
		  while (n <= 0) {
	         System.out.print("Inserisci un numero intero positivo: ");
	         n = tastiera.nextInt();
	         if (n <= 0)
	            System.out.println("Errore: il numero inserito non e' positivo!");
		  }
		  
		  int prod = 1;
		  int max = 0;
		  int min = 0;
		  
		  numeroLetto = -1;
		  while (numeroLetto != n) {
			 while (numeroLetto <= 0) {
	            System.out.print("Inserisci un numero intero positivo, " + n + " per uscire: ");
	            numeroLetto = tastiera.nextInt();
	            if (numeroLetto <= 0)
	               System.out.println("Errore: il numero inserito non e' positivo!");
			 }
			 if (numeroLetto != n) {
	            prod *= numeroLetto;
	            if (numeroLetto > max)
	               max = numeroLetto;
	            if (min == 0)
	               min = numeroLetto;
	            else if (numeroLetto < min)
	                    min = numeroLetto;
				numeroLetto = -1;
			 }
		  }
		  System.out.println("prod = " + prod + ", min = " + min + ", max = " + max);
		  
		  int somma = 0;
		  int contatore = 0;

	      int i = max;
		  while (i <= prod) {
	         int j = min;
	         while (j <= max) {
	            somma += i+j;
	            contatore++;
	            j++;
	         }
	         i++;
	      }

	      double media = (double) somma / contatore;
	      System.out.println("Il valore della media e': " + media);
	}

}
