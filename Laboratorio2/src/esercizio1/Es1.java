package esercizio1;

import java.util.Scanner;

/*Scrivere un programma Java che calcola il valore 
 * assoluto di un numero intero, letto da tastiera.
 * */

public class Es1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner tastiera = new Scanner(System.in);
		  
		System.out.print("Inserisci un numero intero: ");
		int n = tastiera.nextInt();
		  
		if (n < 0) 
			n = -n;
		
		System.out.println("Il valore assoluto del numero inserito e': " + n);
	
	}
	
}
