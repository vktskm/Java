package esercizio8;

import java.util.Scanner;

/* Esercizio 8
 * Scrivere un programma Java che, letti da tastiera due numeri 
 * interi positivi n ed m, calcoli il massimo comun divisore MCD(n,m) 
 * usando l’algoritmo di Euclide, che si basa sulle seguenti proprietà:
 * - MCD(x,x) = x
 * - MCD(x,y) = MCD(y,x)
 * - MCD(x,y) = MCD(x-y,y) se x > y
 * */

public class Es8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		      Scanner tastiera = new Scanner(System.in);
		      int m, n, x, y, t;
		      
		      System.out.print("Inserisci un intero positivo n: ");
			  n = tastiera.nextInt();
		      while (n <= 0) {
		         System.out.println("Il numero inserito deve essere positivo!");
		         System.out.print("Inserisci un intero n maggiore o uguale a 0: ");
		         n = tastiera.nextInt();
		      }

		      System.out.print("Inserisci un intero positivo m: ");
			  m = tastiera.nextInt();
		      while (m <= 0) {
		         System.out.println("Il numero inserito deve essere positivo!");
		         System.out.print("Inserisci un intero m maggiore o uguale a 0: ");
		         m = tastiera.nextInt();
		      }      
		      
		      x = n;
		      y = m;
		      while (x != y) {
		         if (x > y) {
		            x = x - y;
		            }
		         else {// assegna il valore di y a x perchè è maggiore
		            t = x;
		            x = y;
		            y = t;
		         }
		      }
		      
		      System.out.println("MCD(" + n + "," + m + ") = " + x);

	}

}
