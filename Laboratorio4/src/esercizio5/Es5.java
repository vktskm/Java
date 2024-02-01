package esercizio5;

import java.util.Scanner;

/* Esercizio 5
 * Scrivere un programma Java che, letti da tastiera due numeri 
 * interi positivi n ed m, calcoli il quoziente e il resto della 
 * divisione intera tra n ed m usando solo sottrazioni successive 
 * (senza usare, quindi, gli operatori / e %).
 * */

public class Es5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		  int n, m, quoziente, resto;

	      System.out.print("Inserisci il primo numero intero positivo (n): ");
		  n = tastiera.nextInt();
		  while (n <= 0) {
	         System.out.println("Devi inserire un nuovo positivo!");
	         System.out.print("Inserisci il primo numero intero positivo (n): ");
		     n = tastiera.nextInt(); 
		  }
	      System.out.print("Inserisci il secondo numero intero positivo (m): ");
		  m = tastiera.nextInt();
		  while (m <= 0) {
	         System.out.println("Devi inserire un nuero positivo!");
	         System.out.print("Inserisci il secondo numero intero positivo (m): ");
		     m = tastiera.nextInt(); 
		  }

	      // Calcolo del quoziente e del resto della divisione intera n / m
	      quoziente = 0;
	      while (n >= m) {
	         n -= m;
	         quoziente++;
	      }
	      resto = n;
	      
	      System.out.println("Quoziente: " + quoziente);
	      System.out.println("Resto: " + resto);
	}

}
