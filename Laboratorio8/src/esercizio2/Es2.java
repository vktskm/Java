package esercizio2;

import java.util.Scanner;

/* Esercizio 2 (Istruzioni a un robot)
 * Scrivere un programma Java che consenta all’utente di specificare a un robot i passi 
 * da fare per raggiungere (eventualmente) un obiettivo. La posizione dell’obiettivo e 
 * i passi da effettuare vengono specificati da riga di comando, come nel seguente esempio:
 * java Programma 5 4 ssseeeenno
 * che indica che l’obiettivo da raggiungere si trova alla riga 5, colonna 4, e i passi che 
 * deve fare il robot sono: 
 * andare verso sud 3 volte, andare verso est 4 volte, andare verso nord 2 volte e infine 
 * andare verso ovest 1 volta.
 * Nel metodo main(), il programma crea anzitutto un mondo virtuale costituito da una matrice 
 * di 20 righe e 20 colonne. Posiziona poi l’obiettivo alle coordinate specificate dai primi 
 * due argomenti forniti sulla riga di comando. 
 * Quindi, posiziona 10 ostacoli in posizioni casuali: 
 * se al momento di posizionare un ostacolo, la posizione dovesse essere già occupata 
 * – da un altro ostacolo o dall’obiettivo 
 * – riprovare con un’altra posizione; alla fine, gli ostacoli posizionati devono essere 10.
 * Infine, segna le posizioni occupate dal robot durante il percorso indicato da riga di comando,
 * partendo dalla riga 0, colonna 0. Il percorso di interrompe se il robot va a finire nella 
 * posizione occupata dall’obiettivo, oppure in una posizione occupata da un ostacolo, oppure 
 * tenta di andare oltre a uno dei bordi del mondo. 
 * Stampa quindi a video il mondo virtuale con indicati obiettivo, ostacoli e percorso del robot, 
 * e stampa un messaggio che dice se il robot ha raggiunto l’obiettivo, oppure è finito contro un 
 * ostacolo o se ha cercato di attraversare uno dei bordi del mondo.
 * I metodi da implementare nella classe Metodi sono i seguenti:
 * - creaMondo(): alloca una matrice di 20 × 20 interi, e restituisce al chiamante un riferimento 
 * a tale matrice. Il mondo appena creato ha tutte le posizioni vuote, cioè la matrice contiene 0 
 * in ogni elemento;
 * - aggiungiObiettivo(mondo,riga,colonna): 
 * se la posizione specificata da riga e colonna è libera (contiene 0), aggiunge l’obiettivo 
 * (rappresentato dal numero 1) e restituisce true al chiamante. 
 * Se la posizione specificata è invece occupata, oppure è fuori dalla matrice, lascia il mondo 
 * inalterato e restituisce false al chiamante;
 * - aggiungiOstacolo(mondo): 
 * aggiunge un ostacolo (rappresentato dal numero 2) in una posizione casuale del mondo. Se
 * la posizione tirata a caso è occupata, riprova fino a che non trova una posizione libera;
 * - aggiungiPosizioniRobot(mondo,percorso): segna nella matrice corrispondente al mondo
 * virtuale, usando il numero 3, le posizioni occupate dal robot durante il suo cammino. 
 * Il robot parte sempre dalla posizione (0,0); se va a sud si incrementa il numero di riga, 
 * se va a est si incrementa il numero di colonna. L’argomento percorso è una stringa formata 
 * dai caratteri s (sud), n (nord), e (est) e o (ovest). 
 * Il percorso si interrompe se il robot va a occupare una posizione occupata da un 
 * ostacolo o dall’obiettivo, oppure se va contro uno dei bordi del mondo (cioè se 
 * cerca di uscire dalla matrice). Il metodo restituisce al chiamante: 
 * 1 se il robot ha raggiunto l’obiettivo, 
 * 2 se è finito contro un ostacolo, 
 * 3 se ha cercato di uscire dalla matrice, 0 se nessuna di queste condizioni si è verificata;
 * - stampaMondo(mondo): 
 * stampa a video una rappresentazione grafica del mondo virtuale, come segue:
 * 
 * **********************
 * *O OO #              *
 * *O #O                *
 * *OOOOO               *
 * *            #       *
 * *                    *
 * *      X             *
 * *  #       #         *
 * *                    *
 * *                    *
 * *     #              *
 * *                    *
 * *                    *
 * *                    *
 * *                    *
 * *     #          #   *
 * *                    *
 * *                    *
 * *   #                *
 * *        #           *
 * *                    *
 * **********************
 * dove i bordi del mondo sono rappresentati da asterischi, le posizioni vuote da spazi, 
 * gli ostacoli da #, l’obiettivo da X e il percorso del robot da O. 
 * Si noti che la posizione dell’obiettivo e il percorso corrispondono agli argomenti passati 
 * da riga di comando, nell’esempio dato sopra*/

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int riga = Integer.parseInt(args[0]);
		int colonna = Integer.parseInt(args[1]);
		String percorso = args[2].toLowerCase();
		int cont, risultato;
		int[][] mondo;

		//Crea mondo
		mondo = Metodi.creaMondo();

		//Posiziona obiettivo
		if(Metodi.aggiungiObiettivo(mondo, riga, colonna)) {

			//Aggiungi ostacoli
			cont=0;
			while(cont < 10) {
				if(Metodi.aggiungiOstacolo(mondo)) {
					cont++;
				}
			}
			
			//Esegui il movimento del robot
			risultato = Metodi.aggiungiPosizioniRobot(mondo, percorso);
			Metodi.stampaMondo(mondo);
			
			switch(risultato) {
			case 0: System.out.println("Il robot non ha raggiunto l'obiettivo");
				break;
			case 1: System.out.println("L'obiettivo e' stato raggiunto");
				break;
			case 2: System.out.println("Il robot ha colpito un ostacolo");
				break;
			case 3: System.out.println("Il robot ha cercato di uscire dal mondo");
				break;
			}
			
		}else {
			System.out.println("La posizione scelta per l'obiettivo non e' valida");
		}
	}

}
