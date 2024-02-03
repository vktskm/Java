package esercizio3;

import java.util.Scanner;

/* Esercizio 3
 * Scrivere un programma Java che legga da tastiera un intero 
 * positivo e stampi a video la scomposizione in fattori (pri-
 * mi) del numero. Ad esempio, se il numero letto è 12, il pro-
 * gramma stamperà:
 * Numero letto: 12
 * Fattori: 2 (2 volte), 3 (1 volta)
 *****/

public class Es3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	Scanner tastiera = new Scanner(System.in);
     int n;
     int fattore, numeroVolte;
     boolean primaStampa;
     
     // Legge il numero n in input
     do {
        System.out.print("Inserisci un numero intero positivo: ");
        n = tastiera.nextInt();
        if (n <= 0)
           System.out.println("Il numero deve essere positivo!");
     } while (n <= 0);
     
     System.out.println("Numero letto: " + n);
     System.out.print("Fattori: ");
     
     // Gestisce il caso particolare in cui il numero letto è 1
     if (n == 1) {
        System.out.print("Il fattore e'1");
        return;
     }
     
     fattore = 2;
     numeroVolte = 0;
     primaStampa = true;
     while (n > 1) {
        // Continua a dividere per fattore, fino a che è possibile
        while (n % fattore == 0) {
           n /= fattore;
           numeroVolte++;
        }
        // Se il numero non era divisibile per fattore, tenta con il successivo
        if (numeroVolte > 0) {
           // Se è il primo fattore che stiamo stampando, evita di stampare la virgola
           if (!primaStampa) System.out.print(", ");
           primaStampa = false;
           // Stampa il fattore
           System.out.print(fattore + " (" + numeroVolte);
           // Stampa il numero di volte (singolare o plurale)
           if (numeroVolte == 1)
              System.out.print(" volta)");
           else
              System.out.print(" volte)");
        }
        // Passa a tentare con il prossimo fattore
        fattore++;
        numeroVolte = 0;
     }
     
  }
}
