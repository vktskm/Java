package compitoA;

import java.util.Scanner;

/* Scrivere un programma Java denominato EsameA.java che:
 * - legga da tastiera una sequenza di numeri interi maggiori o uguali a 0 (rifiutando 
 * quindi i numeri negativi), fino a che non viene inserito lo 0;
 * - per ogni numero positivo ricevuto, escluso quindi lo 0 finale, aggiorni la somma 
 * sum, il massimo max e il minimo min dei numeri letti;
 * - una volta fatto ciò, stampi a video il valore delle variabili sum, min e max;
 * - poi, calcoli la media (in virgola mobile) di tutti i prodotti i*j, con i intero che 
 * varia fra max e sum e j intero che varia fra min e max;
 * - visualizzi infine il risultato dell’elaborazione, stampando a video il valore della 
 * media.
 * Norme di implementazione
 * Il programma deve essere realizzato utilizzando esclusivamente i concetti di 
 * programmazione presentati nella prima parte del corso. L’unico tipo di ciclo 
 * consentito è il while. Il programma deve essere realizzato in modo da non ge-
 * nerare errori in compilazione.
 **/

public class EsA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);

	      System.out.println("Inserisci una sequenza di interi positivi, terminata da 0.");
	   
	      int sum = 0;
	      int max = 0;
	      int min = -1;
	   
	      int numeroLetto = -1;
	      while (numeroLetto != 0) {
	         System.out.print("Inserisci un intero positivo, oppure 0 per terminare: ");
		     numeroLetto = tastiera.nextInt();
	         if (numeroLetto < 0)
	            System.out.println("Devi inserire un numero maggiore o uguale a 0!");
		     else if (numeroLetto > 0) {
	            sum += numeroLetto;
	            if (numeroLetto > max)
	               max = numeroLetto;
	            if (min == -1)
	               min = numeroLetto;
	            else if (numeroLetto < min)
	                    min = numeroLetto;
		     }
	      }
		  System.out.println("sum = " + sum + ", min = " + min + ", max = " + max);
		  
		  int somma = 0;
		  int contatore = 0;
		  
		  int i = max;
		  while (i <= sum) {
	         int j = min;
	         while (j <= max) {
	            somma += i*j;
	            contatore++;
	            j++;
			 }
	         i++;
	      }

	      double media = (double) somma / contatore;
	      System.out.println("Il valore della media e': " + media);
	}

}
