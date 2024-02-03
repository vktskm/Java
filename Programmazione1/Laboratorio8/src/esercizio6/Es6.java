package esercizio6;

/* Esercizio 6 (Gioco del Tris)
 * Scrivere un programma Java che consenta all’utente di giocare a Tris contro 
 * il computer.Il computer gioca secondo le seguenti regole, prese dal Capitolo 
 * 1 del libro “L’Algoritmo Definitivo. 
 * La macchina che impara da sola e il futuro del nostro mondo”, di Pedro Domingos, 
 * edizioni Bollati Boringhieri (2016):
 * 1. se l'avversario ha occupato due caselle di fila, occupare la casella 
 * rimanente;
 * 2. altrimenti, se c'è una mossa che crea due coppie di caselle adiacenti in 
 * un colpo solo,scegliere quella;
 * 3. altrimenti, se la casella centrale è libera, occuparla;
 * 4. altrimenti, se l'avversario ha occupato una casella d'angolo, occupare la 
 * casella opposta;
 * 5. altrimenti, se c'è un angolo vuoto, occuparlo;
 * 6. altrimenti, occupare una casella vuota qualsiasi.
 * Il programma chiederà anzitutto se l’utente vuole fare o no la prima mossa, e poi 
 * giocherà secondo le regole date sopra. Assegnare il simbolo O all’utente, mentre 
 * il computer userà il simbolo X.
 * La classe Metodi conterrà almeno i seguenti metodi:
 * - stampaConfigurazioneDiGioco(): stampa la configurazione attuale del gioco (di 
 * cui si passa un riferimento, come argomento), secondo lo schema che segue:
 * O|O|O
 * -+-+-
 *  |X|
 * -+-+-
 * X|X|
 * - creaNuovaConfigurazione(): crea una nuova tabella, vuota, pronta per giocare. 
 * Restituisce al chiamante un riferimento a tale tabella;
 * - mossaComputer(): prende come argomento un riferimento alla configurazione 
 * attuale del gioco, ed esegue la prossima mossa del computer, secondo le regole 
 * riportate sopra;
 * - mossaUtente(): prende come argomento un riferimento alla configurazione attuale 
 * del gioco, e chiede all’utente di fare la propria mossa. Se l’utente specifica 
 * una casella già occupata, stampa un opportuno messaggio d’errore e chiede nuova-
 * mente di specificare la mossa;
 * - verificaVittoria(): prende come argomento un riferimento alla configurazione 
 * attuale del gioco, e restituisce al chiamante: 1 se l’utente ha vinto, – 1 se il 
 * computer ha vinto, 0 se non ha vinto nessuno.
 * Prima di invocare i metodi mossaComputer() e mossaUtente(), assicurarsi che sia 
 * effettivamente possibile fare una mossa.
 * Osservazione finale: nel libro di Domingos si dice che l’algoritmo è ottimale, 
 * nel senso che non perde mai. Giocare qualche partita per vedere se è vero
 *******************************/
import java.util.Scanner;

public class Es6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
		int[][] matrice;
		int riga, colonna;
		int risultato = 0;
		boolean inputValido;
		String inputLetto;
		char comando;
		boolean spaziLiberi = true;	//indica se è possibile fare una mossa
		boolean alternaGioco = true; //true indica che la mossa è dell'utente
		boolean mossaValida = false;

		//Chi comincia?
		System.out.println("Chi comincia?");

		do {
			System.out.println("Scegli una delle seguenti operazioni:");
			System.out.println("a) Utente");
			System.out.println("b) Computer");
			System.out.print("> ");

			inputLetto = tastiera.nextLine().toLowerCase();
			inputValido = true;
			if (inputLetto.length() != 1)
				inputValido = false;
			else {
				comando = inputLetto.charAt(0);
				switch (comando) {
				case 'a':
				case 'b': break;
				default: inputValido = false;
				}
			}
			if (!inputValido)
				System.out.println("Comando specificato non valido!\n");
		} while (!inputValido);

		// Esegue il comando specificato
		comando = inputLetto.charAt(0);
		switch (comando) {
		case 'a': alternaGioco = true;	
			break;
		case 'b': alternaGioco = false;
			break;
		}
		System.out.println();


	matrice = Metodi.creaNuovaConfigurazione();

	//Comincia la partita
	while(risultato == 0 && spaziLiberi) {
		if(alternaGioco) {
			do {
				System.out.println("Turno utente");
				System.out.println("Inserisci la riga");
				riga = tastiera.nextInt();
				tastiera.nextLine();

				System.out.println("Inserisci la colonna");
				colonna = tastiera.nextInt();
				tastiera.nextLine();

				mossaValida = Metodi.mossaUtente(matrice, riga, colonna);
			}while(!mossaValida);
		}else {
			System.out.println("Turno computer");
			Metodi.mossaComputer(matrice);
		}

		alternaGioco = !alternaGioco;
		risultato = Metodi.verificaVittoria(matrice);
		Metodi.stampaConfigurazioneDiGioco(matrice);
		spaziLiberi = Metodi.controlloSpaziLiberi(matrice);
		System.out.println();
	}
	
	if(risultato == 0) {
		System.out.println("Parita'");
	}else {
		if(risultato == 1) {
			System.out.println("L'utente ha vinto");
		}else {
			if(risultato == -1) {
				System.out.println("Il computer ha vinto");
			}
		}
	}

	tastiera.close();

	}

}
