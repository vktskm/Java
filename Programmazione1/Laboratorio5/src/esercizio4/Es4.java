package esercizio4;

import java.util.Scanner;

/* Esercizio 4
 * Scrivere un programma Java che calcoli la somma di due numeri 
 * interi positivi letti da tastiera,utilizzando solo operazioni 
 * di post-incremento e post-decremento.
 *****/

public class Es4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner tastiera = new Scanner(System.in);
    int a,b;
    
    // Legge il numero a in input
    do {
       System.out.print("Inserisci un numero intero positivo: ");
       a = tastiera.nextInt();
       if (a <= 0)
          System.out.println("Il numero deve essere positivo!");
    } while (a <= 0);
    
    // Legge il numero b in input
    do {
       System.out.print("Inserisci un numero intero positivo: ");
       b = tastiera.nextInt();
       if (b <= 0)
          System.out.println("Il numero deve essere positivo!");
    } while (b <= 0);
    
    // Calcola a + b usando solo post-incrementi e post-decrementi
    // Sfruttiamo il fatto che
    //      a + 0 = a
    //      a + b = (a + 1) + (b - 1)    per b positivo
    while (b > 0) {
        a++;
        b--;
        System.out.println("La somma e': " + a);
    }
    System.out.println("La somma e': " + a);

  }

}
