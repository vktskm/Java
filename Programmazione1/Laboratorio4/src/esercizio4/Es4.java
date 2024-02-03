package esercizio4;

import java.util.Scanner;
/* Esercizio 4
 * Scrivere un programma Java che legga da tastiera un intero 
 * positivo, rappresentante la capacità in kg di uno zaino, e 
 * riceva una sequenza di interi positivi rappresentanti i pesi 
 * degli oggetti da inserirvi, fino a che la somma dei pesi non 
 * eccede la capacità oppure viene letto da tastiera uno 0.
 * Al termine il programma deve stampare a video la capacità dello 
 * zaino, il numero e il peso totale degli oggetti in esso contenu-
 * ti, il peso dell’oggetto più pesante, il peso dell’oggetto più 
 * leggero, e il peso medio degli oggetti presenti nello zaino.*/

public class Es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner tastiera = new Scanner(System.in);
		  int capacitaZaino, numeroOggetti, pesoOggetto, pesoMassimo, pesoMinimo, pesoTotale;
		  double pesoMedio;

	      System.out.print("Inserisci la capacita' dello zaino (numero intero positivo): ");
		  capacitaZaino = tastiera.nextInt();
		  while (capacitaZaino <= 0) {
	         System.out.println("Devi inserire un nuero positivo!");
	         System.out.print("Inserisci la capacita' dello zaino (numero intero positivo): ");
		     capacitaZaino = tastiera.nextInt(); 
		  }

	      System.out.println("Inserisci ora i pesi degli oggetti da inserire nello zaino:");
	      numeroOggetti = 0;
	      pesoMassimo = 0;
	      pesoMinimo = 0;
	      pesoTotale = 0;
	      pesoOggetto = -1;
	      while (pesoOggetto != 0 && pesoTotale < capacitaZaino) {
	         
	    	  while (pesoOggetto < 0) {
	            System.out.print("- peso dell'oggetto (intero positivo, oppure 0 per terminare): ");
	            pesoOggetto = tastiera.nextInt();
	            if (pesoOggetto < 0)
	               System.out.println("Numero inserito non valido!");
	         }
	    	  
	    	 if (pesoOggetto != 0) {
	            if (pesoTotale + pesoOggetto <= capacitaZaino) {
	               pesoTotale += pesoOggetto;
	               numeroOggetti++;
	               if (pesoOggetto > pesoMassimo)
	                  pesoMassimo = pesoOggetto;
	               if (pesoMinimo == 0)
	                  pesoMinimo = pesoOggetto;
	               else if (pesoOggetto < pesoMinimo)
	                       pesoMinimo = pesoOggetto;
	               pesoOggetto = -1;   // Così chiede di inserire un nuovo peso
	            }
	            else {
	               System.out.println("Questo oggetto non ci sta nello zaino!");
	               pesoOggetto = 0;   // Così esce dal ciclo while
	            }
	         }
	      }
	      
	      System.out.println("Capacita' dello zaino: " + capacitaZaino);
	      System.out.println("Numero di oggetti inseriti: " + numeroOggetti);
	      System.out.println("Peso totale oggetti inseriti: " + pesoTotale);
	      System.out.println("L'oggetto piu' pesante pesa " + pesoMassimo + " kg");
	      System.out.println("L'oggetto piu' leggero pesa " + pesoMinimo + " kg");
	      pesoMedio = (double) pesoTotale / numeroOggetti;
	      System.out.println("Il peso medio degli oggetti nello zaino e' di " + pesoMedio + " kg");
	}

}
