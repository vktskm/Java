package esercizio2;

import java.util.Arrays;
import java.util.Scanner;

/* Esercizio 2 (Indovina la parola)
 * Scrivere un programma Java che consenta all’utente di giocare a 
 * “Indovina la parola”.
 * Nel metodo main(), il programma estrae anzitutto a caso una stringa 
 * da un array di stringhe prefissato, definito all’interno del metodo 
 * estraiStringaCasuale() della classe Metodi (il metodo restituisce al 
 * chiamante la stringa estratta). 
 * Converte poi la stringa in un array di char, ed entra quindi in un 
 * ciclo in cui:
 * - stampa le lettere della parola indovinate finora, e un trattino 
 * al posto di quelle non ancora indovinate. 
 * Ad esempio, se la parola segreta è automobile, e l’utente ha finora 
 * indovinato che la parola contiene delle a, delle t e delle o, il 
 * programma stampa:
 * a-to-o----
 * Inizialmente, quando l’utente non ha ancora indovinato nessuna lettera, 
 * il programma stamperà una sequenza di trattini, fornendo così al gioca-
 * tore un’indicazione su quanto è lunga la parola da indovinare;
 * - chiede all’utente di inserire una lettera (per semplicità, supporre 
 * che le parole siano tutte formate solamente da lettere minuscole). 
 * Se la lettera non è presente nella parola, stampa un messaggio appro-
 * priato, e poi riesegue il ciclo (stampa lettere e trattini, chiede di 
 * inserire una lettera, ecc.). 
 * Similmente, se la lettera è già tra quelle indovinate allora stampa un 
 * messaggio appropriato e riesegue il ciclo.
 * Il gioco termina quando l’utente ha indovinato la parola, oppure quando 
 * ha fatto 20 tentativi. Per la stampa delle lettere indovinate finora si 
 * invochi il metodo stampaLettereIndovinate(), passandogli gli opportuni 
 * argomenti. Per vedere se una lettera compare all’interno di una parola, 
 * e in tal caso rendere visibili tutte le occorrenze della lettera nella 
 * parola, invocare il metodo scopriLettera(), passandogli gli opportuni 
 * argomenti.
 ****/

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
		String parolaDaIndovinare = Metodi.estraiStringaCasuale();
		char lettera;
		/* 1. parolaDaIndovinare.length(): 
		 * Questa parte restituisce la lunghezza della stringa parolaDaIndovinare. 
		 * Presumibilmente, parolaDaIndovinare è una stringa che rappresenta una 
		 * parola o una sequenza di caratteri da indovinare in un gioco o un'ap-
		 * plicazione.
		 * 2. "-".repeat(parolaDaIndovinare.length()): 
		 * Utilizzando il metodo repeat della classe String, viene creata una 
		 * nuova stringa che consiste nel ripetere il carattere "-" per un nume-
		 * ro di volte pari alla lunghezza di parolaDaIndovinare. Quindi, se la 
		 * lunghezza di parolaDaIndovinare fosse, ad esempio, 5, la stringa 
		 * risultante sarebbe "-----".
		 * 3. toCharArray(): 
		 * Infine, il metodo toCharArray() converte la stringa ottenuta in un 
		 * array di caratteri. Quindi, l'array di caratteri parolaVisualizzata 
		 * sarà inizializzato con un array di "-" della stessa lunghezza di 
		 * parolaDaIndovinare.
		 *****/
		char[] parolaVisualizzata = "-".repeat(parolaDaIndovinare.length()).toCharArray();
		char[] caratteriDaIndovinare = parolaDaIndovinare.toCharArray();
		char[] lettereProvate = null;
		
		int tentativi = 0;
		
		System.out.println("Indovina la parola!");
		System.out.println(parolaVisualizzata);
		
		/* In sintesi, il ciclo while continuerà ad eseguirsi fintanto che la stringa 
		 * ottenuta dalla conversione di parolaVisualizzata contiene il carattere "-" 
		 * e il numero di tentativi è inferiore a 20. */
		while(String.valueOf(parolaVisualizzata).contains("-") && tentativi < 20) {
		    
			System.out.println("Inserisci una lettera:");
		
			lettera = tastiera.nextLine().toLowerCase().charAt(0);
			
			/* In altre parole, questo codice verifica se la lettera (carattere) indicata 
			 * non è presente nella stringa parolaDaIndovinare. Se la condizione è vera, 
			 * il blocco di codice all'interno delle parentesi graffe verrà eseguito.
			 */
			if(!parolaDaIndovinare.contains(Character.toString(lettera)))
				System.out.format("La lettera %c non è presente all'interno della parola.\n", lettera);
			    /* contains(): Questo è un metodo della classe String in Java che restituisce 
			     * true se la stringa su cui viene chiamato contiene la sottostringa specificata, 
			     * altrimenti restituisce false.*/
			else {
				parolaVisualizzata = Metodi.scopriLettera(lettera, caratteriDaIndovinare, parolaVisualizzata);
				Metodi.stampaLettereIndovinate(parolaVisualizzata);
			
			}
			tentativi++;
		}
		
		/* System.out.format è un metodo di output in Java utilizzato per 
		 * formattare e stampare una stringa su System.out, che rappresenta 
		 * lo standard output, generalmente la console o un altro flusso di 
		 * output predefinito.
		 * La sintassi generale di System.out.format è simile a quella del 
		 * metodo String.format e segue uno stile di formattazione simile a 
		 * printf in C. Ecco come puoi utilizzarlo:
		 * System.out.format(String formato, Object... argomenti);
		 * formato: Una stringa di formato che specifica come i successivi 
		 * argomenti devono essere formattati e stampati.
		 * argomenti: Gli oggetti da formattare e stampare secondo il formato 
		 * specificato. Può essere uno o più oggetti.
		 ********/
		
		if(tentativi == 20)
			System.out.format("Spiacenti, hai terminato il numero di tentativi consentiti :( \n "
					+ "La parola da indovinare era: %s ", parolaDaIndovinare);
		else {
			System.out.format("Compilemnti! La parola da indovinare era proprio %s!\n" , parolaDaIndovinare);
		}
		
	}

}
