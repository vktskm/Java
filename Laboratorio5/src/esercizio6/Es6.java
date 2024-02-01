package esercizio6;

import java.util.Scanner;

/* Esercizio 6
 * Variante Collatz: Scrivere un programma Java che, letto da 
 * tastiera un numero intero positivo numeroMassimo, determini 
 * se la congettura di Collatz vale per ogni numero compreso 
 * tra 1 e numeroMassimo.
 * Ad esempio, se numeroMassimo = 5, il programma stamperà a 
 * video:
 * Provo la congettura per n = 1 … Ok, vale.
 * Provo la congettura per n = 2 … Ok, vale.
 * Provo la congettura per n = 3 … Ok, vale.
 * Provo la congettura per n = 4 … Ok, vale.
 * Provo la congettura per n = 5 … Ok, vale.
 * */
public class Es6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
	      int numeroMassimo, numero, n;
	      
	      // Legge il numero numeroMassimo in input
	      do {
	         System.out.print("Inserisci un numero intero positivo: ");
	         numeroMassimo = tastiera.nextInt();
	         if (numeroMassimo <= 0)
	            System.out.println("Il numero deve essere positivo!");
	      } while (numeroMassimo <= 0);

	      for (numero = 1; numero <= numeroMassimo; numero++) {
	         // Prova a vedere se la congettura di Collatz vale per numero
	         System.out.print("Provo la congettura per n = " + numero + " ... ");
	         n = numero;
	         while (n != 1) {
	            if (n % 2 == 0)
	               n = n / 2;
	            else
	               n = 3*n + 1;
	         }
	         System.out.println("Ok, vale.");
	      }
	}
}
