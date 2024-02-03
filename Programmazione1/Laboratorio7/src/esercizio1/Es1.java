package esercizio1;
/* Esercizio 1 (Indovina il numero)
 * Scrivere un programma Java che consenta all’utente di giocare a 
 * “Indovina il numero”.
 * Nel metodo main(), il programma estrae anzitutto a caso un numero 
 * intero compreso tra 1 e 100,invocando il metodo estraiNumeroCasuale() 
 * della classe Metodi. 
 * Entra poi in un ciclo, in cui chiede all’utente di indovinare il 
 * numero estratto a caso: chiede quindi di inserire da tastiera un 
 * numero intero compreso tra 1 e 100, e dice all’utente se il numero 
 * inserito è corretto, è più piccolo o è più grande di quello da indovinare.
 * Per rendere più intelligente il programma, memorizzare ad ogni iterazione:
 * - il numero più piccolo, tra quelli inseriti dall’utente, che sono più 
 * grandi del numero da indovinare;
 * - il numero più grande, tra quelli inseriti dall’utente, che sono più 
 * piccoli del numero da indovinare.
 * Così, se il numero da indovinare è 53, e l’utente inserisce i numeri 10, 
 * 80, 20, 83, il programma potrà rispondere come segue:
 * Il numero 10 e’ piu’ piccolo di quello da indovinare.
 * Il numero 80 e’ piu’ grande di quello da indovinare.
 * Il numero 20 e’ piu’ piccolo di quello da indovinare.
 * Hai inserito 83, ma se gia’ ti avevo detto che il numero
 * da indovinare e’ piu’ piccolo di 80…
 * Il confronto tra il numero inserito e quello da indovinare andrebbe 
 * fatto invocando il metodo confrontaNumeri(numeroInserito,numeroDaIndovinare), 
 * che restituisce -1, 0, 1 a seconda che il numero inserito sia minore, uguale 
 * o maggiore del numero da indovinare.Inoltre:
 * - per ogni numero da indovinare, il giocatore ha a disposizione al più 10 
 * tentativi;
 * - al termine della partita riporta le seguenti informazioni relative alle 
 * ultime 5 partite:
 * qual era il numero da indovinare 
 * - se l’utente l’ha indovinato oppure no
 * - se l’utente ha indovinato il numero, con quanti tentativi lo ha fatto
 * - chiede poi all’utente se vuole giocare ancora, oppure se si vuole terminare 
 * il programma.
 * Suggerimento: le informazioni relative alle ultime 5 partite possono essere 
 * memorizzate in tre array: numeriDaIndovinare (di interi), indovinato (di 
 * boolean), e numeroTentativi(di interi). 
 * Gestire l’aggiornamento del contenuto di questi array tramite il metodo 
 * aggiornaInformazioniPartite().
*/
import java.util.*;
import java.util.Scanner;

public class Es1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
		boolean corretto;
		boolean continuareGioco = true;
		int rand, inputLetto, tentativoMinimo, tentativoMassimo, tentativi, numeroPartite, decisione;
		int[] numeriDaIndovinare, numeroTentativi;
		boolean[] indovinato;

		decisione = 1;
		numeroPartite = 0;
		numeriDaIndovinare = new int[5];
		numeroTentativi = new int[5];
		indovinato = new boolean[5];

		while(continuareGioco) {
			rand = Metodi.numeroRandom();
			tentativoMinimo = 1;
			tentativoMassimo = 100;
			tentativi = 0;
			corretto = false;
			while(!corretto && tentativi<10) {
				System.out.print("Indovina un numero tra 1 e 100: \n");
				inputLetto = tastiera.nextInt();
				int confronto = Metodi.confrontaNumeri(inputLetto, rand);
				if(tentativoMassimo != 100 && confronto == 1 && inputLetto > tentativoMassimo)
					System.out.format("Hai inserito %d, ma se già ti avevo detto che il numero da "
							+ "indovinare è più piccolo di %d\n", inputLetto, tentativoMassimo);
				else if(tentativoMinimo != 1 && confronto == -1 && inputLetto < tentativoMinimo) {
					System.out.format("Hai inserito %d, ma se già ti avevo detto che il numero da "
							+ "indovinare è più grande di %d\n", inputLetto, tentativoMinimo);
				} else {

					switch(confronto) {
					case 1: System.out.format("Il numero %d è maggiore del numero da indovinare\n", inputLetto);
							tentativoMassimo = inputLetto;
							break;
					case 0:	System.out.format("Hai indovinato, il numero da indovinare era %d\n", rand);
							corretto = true;
							break;
					case -1: System.out.format("Il numero %d è minore del numero da indovinare\n", inputLetto);
						 	tentativoMinimo = inputLetto;
						 	break;
					}
					tentativi++;
				}
			}


			Metodi.aggiornaPartite(numeriDaIndovinare, numeroTentativi, indovinato, rand, tentativi,
					corretto, numeroPartite);
			numeroPartite++;


			if(!corretto)
				System.out.print("Hai esaurito il numero di tentativi disponibili.\n");

			System.out.print("Ecco il riassunto delle partite precedenti:\n");

			for(int i = 0; i < Math.min(numeroPartite, 5); i++) {

				if (indovinato[i])
					System.out.format("Nella partita numero %d hai indovinato il numero %d in %d "
							+ "tentativi\n", i+1, numeriDaIndovinare[i], numeroTentativi[i]);
				else {
					System.out.format("Nella partita numero %d non hai indovinato il numero %d\n",
							i+1, numeriDaIndovinare[i]);
				}
			}

			System.out.print("Vuoi giocare ancora? \n\t (1) Sì \n\t (2) No\n");
			decisione = tastiera.nextInt();
			if (decisione == 2)
				continuareGioco = false;
		
		}//end primo while
     
	}//end main
}//end classe
