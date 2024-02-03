package esercizio6;

import java.util.Scanner;

/* Esercizio 6
 * Scrivere un programma Java che implementi una semplice calcolatrice. 
 * Il programma deve visualizzare un menù per la scelta del tipo di 
 * operazione da effettuare:
 * + per sommare
 * - per sottrarre
 * * per moltiplicare
 * / per dividere
 * u per uscire dal programma
 * Deve poi chiedere in input il tipo di operazione che si vuole effettuare. 
 * Se l’utente inserisce il carattere ‘u’ allora il programma termina (senza 
 * usare il metodo exit()); se inserisce un carattere diverso da +, -, *, /, 
 * u, stampa un messaggio d’errore e mostra nuovamente il menù. 
 * Se il carattere inserito è +, - , *, oppure /, chiede all’utente due 
 * numeri interi tra cui eseguire l’operazione specificata; in caso di 
 * divisione, verificare che l’utente non intenda dividere per 0. 
 * Eseguita l’operazione indicata, il programma stampa a video il risultato 
 * e ripropone all’utente il menù*/
public class Es6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner tastiera = new Scanner(System.in);
		  boolean altraOperazione, rispostaValida;
		  String operazione, risposta;
		  int operando1, operando2, risultato;

		  altraOperazione = true;
		  while (altraOperazione) {
	         System.out.println("Ecco le operazioni disponibili:");
	         System.out.println("  + per la somma");
	         System.out.println("  - per la differenza");
	         System.out.println("  * per il prodotto");
	         System.out.println("  / per la divisione");
	         System.out.println("  u per uscire dal programma");
		     rispostaValida = false;
		     operazione = "";
		     while (!rispostaValida) {
	            System.out.print("Inserisci l'operazione che vuoi eseguire: ");
		        operazione = tastiera.next();
			    if (operazione.equals("+") || operazione.equals("-") || operazione.equals("*") ||
			        operazione.equals("/") || operazione.equals("u"))
	               rispostaValida = true;
	            else
	               System.out.println("Operazione specificata non valida!");
	         }
		     
			 if (operazione.equals("u"))
	            altraOperazione = false;
	         else {
	            switch (operazione) {
	               case "+": System.out.println("Hai scelto di fare una somma.");
	                         break;
	               case "-": System.out.println("Hai scelto di fare una differenza.");
	                         break;
	               case "*": System.out.println("Hai scelto di fare un prodotto.");
	                         break;
	               case "/": System.out.println("Hai scelto di fare una divisione.");
	            }
	            System.out.print("Inserisci il primo numero: ");
	            operando1 = tastiera.nextInt();
	            System.out.print("Inserisci il secondo numero: ");
	            operando2 = tastiera.nextInt();
				risultato = 0;
	            if (operazione.equals("/") && operando2 == 0)
	               System.out.println("Spiacente, la divisione per 0 non la posso fare!");
	            else {
				   if (operazione.equals("+"))
	                  risultato = operando1 + operando2;
	               else if (operazione.equals("-"))
	                  risultato = operando1 - operando2;
	               else if (operazione.equals("*"))
	                  risultato = operando1 * operando2;
	               else if (operazione.equals("/"))
	                  risultato = operando1 / operando2;
	               System.out.println("Il risultato dell'operazione e': " + risultato);
	            }
	            // Chiede se si vuole fare un'altra iterazione
	            rispostaValida = false;
			    risposta = "";
			    while (!rispostaValida) {
	               System.out.print("Vuoi fare un'altra giocata? (si/no): ");
	               risposta = tastiera.next();
			       if (risposta.equals("si") || risposta.equals("no"))
	                  rispostaValida = true;
	            }
	            if (risposta.equals("no"))
	               altraOperazione = false;
	         }//if con riga 52
	      }
	}

}
