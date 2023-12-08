package esercizio2;

import java.util.Scanner;

/* Scrivere un programma Java che, letti in input due numeri interi, 
 * calcola la divisione tra interi.
 * Utilizzando il metodo exit(), il programma deve evitare la divisione 
 * per zero.
*/
public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tastiera = new Scanner(System.in);
		  
		System.out.print("Inserisci il primo numero intero: ");
		int x = tastiera.nextInt();
		System.out.print("Inserisci il secondo numero intero: ");
	    int y = tastiera.nextInt();
		  
		if(y == 0){
	         System.out.println("Il secondo numero e' zero, quindi non posso fare la divisione");
			 System.exit(-1);
			 /* System.exit(-1); è un'istruzione che termina la Java Virtual Machine (JVM) 
			  * con un codice di stato di -1. Il metodo System.exit() è utilizzato per 
			  * interrompere forzatamente l'esecuzione di un programma Java.*/
		}
		  
		System.out.println("La divisione intera tra i due numeri da' il seguente risultato: " + (x/y));

	}
}