package esercizio5;

import java.util.Scanner;

/*Esercizio 5 (Gioco della morra cinese contro il computer)
 * Scrivere un programma Java che simuli il gioco della morra cinese, 
 * questa volta per un solo giocatore che giochi contro il computer. 
 * Il computer deciderà se scegliere "forbice", "carta" o "pietra" 
 * generando un numero casuale da 0 a 2 mediante l'espressione: 
 *               (int)(Math.random()*3)
 * In particolare:
 * - se il numero estratto è 0 il computer sceglierà forbice;
 * - se il numero estratto è 1 il computer sceglierà carta;
 * - se il numero estratto è 2 il computer sceglierà pietra.
 * Una volta deciso il proprio simbolo, il computer domanderà all'utente 
 * di inserire il suo e dichiarerà quindi il vincitore. Chiederà poi se 
 * si intende fare un’altra giocata (come nell’esercizio precedente),e 
 * terminerà quando l’utente risponderà di no.
 ****/

public class Es5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		  String giocataUtente, giocataComputer;
		  boolean rispostaValida;
		  String risposta;

	      System.out.print("Inserisci il tuo nome: ");
	      String giocatore = tastiera.next();
		  
		  boolean altraGiocata = true;
		  while (altraGiocata) {	  
			 
			 giocataUtente = "";
			 rispostaValida = false;
			 while (!rispostaValida) {
	            System.out.print(giocatore + ", inserisci la tua giocata (forbice, carta, pietra): ");
	            giocataUtente = tastiera.next();
				if (giocataUtente.equals("forbice") || giocataUtente.equals("carta") ||
				    giocataUtente.equals("pietra"))
	               rispostaValida = true;
			    else
				   System.out.println("Giocata non valida!");
			 }
			 
			 giocataComputer = "";
			 switch ((int) (Math.random()*3)) {
	            case 0: giocataComputer = "forbice";
	                    break;
				case 1: giocataComputer = "carta";
	                    break;
				case 2: giocataComputer = "pietra";
			 }
			 System.out.println("Computer ha scelto " + giocataComputer + ".");
			 
			 //Decide chi vince
			 if (giocataUtente.equals("forbice") && giocataComputer.equals("carta") ||
			     giocataUtente.equals("carta")   && giocataComputer.equals("pietra") ||
				 giocataUtente.equals("pietra")  && giocataComputer.equals("forbice"))
	            System.out.println("Hai vinto l'utente!");
			 else if (giocataUtente.equals(giocataComputer))
				System.out.println("Pari.");
			 else
	            System.out.println("Ho vinto il computer!");
			 
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
	      }//fine primo while 
	}

}
