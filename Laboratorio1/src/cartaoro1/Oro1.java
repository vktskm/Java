package cartaoro1;

import java.util.Scanner;

/*
 * Scrivere un programma in Java che legge da tastiera un numero naturale 
 * n maggiore di zero e stampa a video il valore di a(n) dove a(n) è la
 * successione definita ricorsivamente come segue:
 * a(0) = 2
 * a(n+1) = 3*a(n) – 2
 * Esempio. Se n=5 il programma dovrà calcolare, a partire dal valore a0 = 2, 
 * i seguenti valori:
 * a1= 3*a0 -2 = 3*2 -2= 4
 * a2= 3*a1 -2 = 3*4 -2= 10
 * a3= 3*a2 -2 = 3*10 -2= 28
 * a4= 3*a3 -2 = 3*28 -2= 82
 * a5= 3*a4 -2 = 3*82 -2= 244
 * */

public class Oro1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	Scanner tastiera = new Scanner(System.in);

    int numeroInserito;
	
     // Utilizzo di un ciclo while per garantire che l'input sia compreso tra 0 e 20
    while (true) {
        System.out.print("Inserisci un numero intero tra 0 e 20: ");

        if (tastiera.hasNextInt()) {
            numeroInserito = tastiera.nextInt();

            if (numeroInserito >= 0 && numeroInserito <= 20) {
                break; // Esci dal ciclo se l'input è valido
            } else {
                System.out.println("Input non valido. Riprova.");
            }
        } else {
            System.out.println("Input non valido. Devi inserire un numero intero.");
            tastiera.next(); // Consuma l'input non valido (la stringa) per evitare un loop infinito
        }
    }
	
    //Stampa i valori in ordine della successione
    for (int i = 0; i <= numeroInserito; i++) {
	      int a_n = calcolaSuccessione(i);
		  System.out.println("a" + i + " = " + a_n);
	}
			        
        tastiera.close();
	}

    // Funzione per calcolare a(n) con un ciclo for
	private static int calcolaSuccessione(int n){
	  if (n == 0) {
			return 2; // Caso base
	  }else{
			 int a_n_minus_1 = calcolaSuccessione(n - 1);
			 return 3 * a_n_minus_1 - 2;
			}
    }//end calcolaSuccessione
	  
}//end classe oro1