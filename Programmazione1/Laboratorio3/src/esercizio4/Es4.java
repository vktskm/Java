package esercizio4;

import java.util.Scanner;

/* Esercizio 4 (Gioco della morra cinese a due giocatori)
 * Scrivere un programma Java che simuli il gioco della morra cinese. 
 * Il programma dovrà prendere in ingresso due nomi con cui identificherà 
 * i due giocatori. I nomi verranno memorizzati in variabili di tipo String. 
 * Per ogni giocata, viene chiesto ad entrambi i giocatori di inserire una 
 * parola tra "forbice", "carta" o "pietra"; il programma dovrà stampare a 
 * video il nome del vincitore. Se la parola in ingresso non è una delle tre 
 * previste, il programma dovrà avvisare che èstato commesso un errore. 
 * Si ricordi che:
 * - forbice vince su carta;
 * - carta vince su pietra;
 * - pietra vince su forbice.
 * Nel caso in cui entrambi i giocatori scelgono la stessa stringa,la 
 * giocata è pari. Terminata una giocata, il programma dovrà chiedere 
 * se si intende farne un’altra. 
 * In caso negativo,terminerà immediatamente l’esecuzione (senza usare 
 * il metodo exit()); in caso affermativo, chiederà nuovamente ad entrambi 
 * i giocatori di inserire una parola tra "forbice", "carta" o "pietra", 
 * stamperà a video il nome del vincitore, e così via.
 ***/

public class Es4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tastiera = new Scanner(System.in);
		  String giocata1, giocata2;
		  boolean rispostaValida;
		  String risposta;

	      System.out.print("Inserisci il nome del primo giocatore: ");
	      String giocatore1 = tastiera.next();
	      System.out.print("Inserisci il nome del secondo giocatore: ");
	      String giocatore2 = tastiera.next();
		  
		  boolean altraGiocata = true;
		  while (altraGiocata) {	  
			 
			 //inserisci valore valido giocatore1 
			 giocata1 = "";
			 rispostaValida = false;
			 while (!rispostaValida) {
	            System.out.print(giocatore1 + ", inserisci la tua giocata (forbice, carta, pietra): ");
	            giocata1 = tastiera.next();
				if (giocata1.equals("forbice") || giocata1.equals("carta") || giocata1.equals("pietra"))
	               rispostaValida = true;
			    else
				   System.out.println("Giocata non valida!");
			 }
			 //inserisci valore valido giocatore2 
			 giocata2 = "";
			 rispostaValida = false;
			 while (!rispostaValida) {		 
		        System.out.print(giocatore2 + ", inserisci la tua giocata (forbice, carta, pietra): ");
		        giocata2 = tastiera.next();
				if (giocata2.equals("forbice") || giocata2.equals("carta") || giocata2.equals("pietra"))
	               rispostaValida = true;
			    else
				   System.out.println("Giocata non valida!");
	         }
			 //Decide chi vince fra i due giocatori
			 if (giocata1.equals("forbice") && giocata2.equals("carta") ||
			     giocata1.equals("carta")   && giocata2.equals("pietra") ||
				 giocata1.equals("pietra")  && giocata2.equals("forbice"))
	            System.out.println("Vince " + giocatore1);
			 else if (giocata1.equals(giocata2))
				System.out.println("Pari");
			 else
	            System.out.println("Vince " + giocatore2);
			 
			 //Decido se giocare di nuovo o terminare 
			 risposta = "";
	         rispostaValida = false;
			 while (!rispostaValida) {
	            System.out.print("Vuoi fare un'altra giocata? (si/no): ");
	            risposta = tastiera.next();
			    if (risposta.equals("si") || risposta.equals("no"))
	               rispostaValida = true;
	         }
	         if (risposta.equals("no"))
	            altraGiocata = false;
	      }
		
	}

}
