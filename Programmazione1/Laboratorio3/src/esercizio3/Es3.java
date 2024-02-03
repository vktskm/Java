package esercizio3;

import java.util.Scanner;

/*Esercizio 3 (Voto all’esame)
 * Scrivere un programma Java che calcoli il risultato di uno 
 * studente all’esame di Programmazione 1.
 * Il programma leggerà da tastiera:
 * - il voto ottenuto nella parte di teoria (da -8 a +8 punti);
 * - il voto ottenuto nella prova pratica (da 0 a 24 punti).
 * Memorizzati questi dati, procederà al calcolo del risultato 
 * in trentesimi, procedendo come segue. Il risultato finale è la somma 
 * dei risultati. 
 * L’algoritmo di calcolo, però, prevede una protezione “antismanettone”, 
 * per cui se il voto finale è maggiore o uguale a 18 ma il voto della 
 * prova teorica è inferiore a 1 lo studente sarà comunque bocciato. 
 * Infatti:
 * - se il voto di teoria è minore o uguale a zero, e la somma dei voti 
 * di teoria e pratica è maggiore o uguale a 18, il programma stampa: 
 * “Bocciato, devi studiare di più la teoria”;
 * - se il voto di teoria è minore o uguale a zero, e il voto di pratica 
 * è minore di 18, il programma stampa: 
 * “Bocciato, devi studiare ed esercitarti di più”; 
 * - se il voto di teoria è maggiore di zero, e la somma dei voti di teoria 
 * e pratica è minore di 18,il programma stampa: 
 * “Bocciato: devi esercitarti di più”;
 * - se la somma dei voti di teoria e pratica vale 31 o 32, il programma stampa:
 * “Congratulazioni: 30 e lode!”.
 * In tutti gli altri casi il programma stampa: 
 * “Il tuo voto è ”, seguito dal totale derivante dalla somma dei punti di
 *  teoria e pratica.
 */

public class Es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner tastiera = new Scanner(System.in);

	      System.out.print("Inserisci il voto della teoria (da -8 a 8): ");
	      int votoTeoria = tastiera.nextInt();
	      System.out.print("Inserisci il voto della pratica (da 0 a 24): ");
	      int votoPratica = tastiera.nextInt();
		  int risultato = votoTeoria + votoPratica;
		  
		  if (votoTeoria <= 0 && risultato >= 18)
	         System.out.println("Bocciato: devi studiare di piu' la teoria!");
	      else if (votoTeoria <= 0 && risultato < 18)
	         System.out.println("Bocciato: devi studiare ed esercitarti di piu'!");
	      else if (votoTeoria > 0 && risultato < 18)
	         System.out.println("Bocciato: devi esercitarti di piu'!");
	      else if (risultato == 31 || risultato == 32)
	         System.out.println("Congratulazioni: 30 e lode!");
	      else
	         System.out.println("Il tuo voto e': " + risultato);

	}

}
