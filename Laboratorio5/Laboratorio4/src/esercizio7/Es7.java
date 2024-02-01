package esercizio7;

import java.util.Scanner;

/* Esercizio 7
 * Scrivere un programma Java che, letto da tastiera un numero 
 * n maggiore o uguale a 0, calcoli(usando un opportuno ciclo 
 * while) l’n-esimo numero della sequenza 0, 1, 1, 2, 3, 5, 8, 
 * 13, 21, … di Fibonacci. 
 * Si ricorda che l’n-esimo numero di Fibonacci può essere defi-
 * nito come segue:
 * fib(0) = 0
 * fib(1) = 1
 * fib(n) = fib(n-1) + fib(n-2) per n > 1
 * Tuttavia, questa è una definizione ricorsiva, mentre noi vo-
 * gliamo un metodo iterativo per calcolareil valore di fib(n)
 * */

public class Es7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
	      int n, fib, fibMenoUno, fibMenoDue;
	      int temp;
	      
	      System.out.print("Inserisci un intero n maggiore o uguale a 0: ");
		  n = tastiera.nextInt();
	      while (n < 0) {
	         System.out.println("Il numero inserito deve essere maggiore o uguale a 0!");
	         System.out.print("Inserisci un intero n maggiore o uguale a 0: ");
	         n = tastiera.nextInt();
	      }
	      
	      if (n <= 1)
	         fib = n;
	      else {
	         fibMenoDue = 0;
	         fibMenoUno = 1;
	         fib = fibMenoUno + fibMenoDue;
	         while (n > 2) {
	            fibMenoDue = fibMenoUno;
	            fibMenoUno = fib;
	            fib = fibMenoUno + fibMenoDue;            
	            n--;
	         }
	      }
	      
	      System.out.println("L'n-esimo numero di Fibonacci e': " + fib);
	}

}
