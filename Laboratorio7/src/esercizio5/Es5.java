package esercizio5;

/* Esercizio 5 (Cifrario di Vigenère)
 * Scrivere un programma Java che permetta all’utente di cifrare e 
 * decifrare dei messaggi usando il famoso cifrario di Vigenère 
 * (pubblicato nell’anno 1586). Il metodo main() invoca il metodo 
 * sceltaMenu(), che stampa a video il seguente menù e restituisce 
 * al chiamante la scelta fatta dall’utente:
 * 1 – Inserisci/cambia la parola chiave
 * 2 – Cifra un messaggio
 * 3 – Decifra un messaggio
 * 0 – Esci dal programma
 * Per semplicità supponiamo che i messaggi e le parole chiave siano 
 * formate solamente da lettere minuscole. Inizialmente la parola chiave 
 * non è ancora stata specificata, ed è quindi la stringa vuota. 
 * Tuttavia, non si possono cifrare o decifrare messaggi se prima non si 
 * è specificata una parola chiave; 
 * se l’utente prova a farlo, il programma deve stampare a video un 
 * messaggio d’errore.
 * Per cifrare un messaggio, il cifrario di Vigenère opera come segue.
 * Supponiamo che il messaggio da cifrare sia programmazione, e che la 
 * parola chiave sia cane. 
 * Ogni lettera del messaggio viene cifrata usando una lettera della 
 * parola chiave, e precisamente:
 * - la p di programmazione con la c di cane
 * - la r di programmazione con la a di cane
 * - la o di programmazione con la n di cane
 * - la g di programmazione con la e di cane
 * - la r di programmazione con la c di cane
 * - la a di programmazione con la a di cane
 * - la m di programmazione con la n di cane
 *  … e così via, finché non è stato cifrato tutto il messaggio.
 *  In pratica, le lettere della parola chiave vengono usate a rotazione, 
 *  finché non è terminato il messaggio da cifrare.
 *  Per cifrare una lettera del messaggio (supponiamo p) usando una lettera 
 *  della parola chiave (supponiamo c), si usa la seguente matrice: 
 *  in particolare, si incrociano la riga che inizia con p e la colonna che 
 *  inizia per c, e la lettera contenuta nella casella così individuata (r) 
 *  costituisce la cifratura di p con la chiave c.
 *  
 *  Mancano J K X Y W 
 *  A B C D E F G H I L M N O P Q R S T U V Z
 *  B C D E F G H I L M N O P Q R S T U V Z A
 *  C D E F G H I L M N O P Q R S T U V Z A B
 *  D E F G H I L M N O P Q R S T U V Z A B C
 *  E F G H I L M N O P Q R S T U V Z A B C D 
 *  F G H I L M N O P Q R S T U V Z A B C D E
 *  .........................................
 *  .........................................
 *  ................................ cosi via
 *  La cifratura del messaggio programmazione con la parola chiave cane 
 *  risulta quindi essere:
 *  Lettere del messaggio:         programmazione
 *  Lettere della parola chiave:   canecanecaneca
 *  Lettere del messaggio cifrato: rrbktazqczvspe
 *  Per decifrare il messaggio rrbktazqczvspe con la parola chiave cane, 
 *  ancora una volta si usano i caratteri della parola chiave, a rotazione:
 *  Lettere del messaggio cifrato: rrbktazqczvspe
 *  Lettere della parola chiave: canecanecaneca
 *  Lettere del messaggio decifrato: programmazione
 *  Per decifrare una lettera del messaggio cifrato (supponiamo r) usando 
 *  una lettera della parola chiave (supponiamo c), si usa ancora la matrice 
 *  di cui sopra. In particolare, nella colonna che inizia per c si cerca il 
 *  carattere r da decifrare; il carattere decifrato è quello che si trova 
 *  all’inizio della riga corrispondente (p).
 *  Il programma dovrà utilizzare i seguenti metodi:
 *  - cambiaParolaChiave(), che chiede all’utente di specificare una nuova 
 *  parola chiave, controlla che sia formata da caratteri minuscoli e la 
 *  restituisce al chiamante;
 *  - creaMatrice(), che crea la matrice riportata sopra e ne restituisce un 
 *  riferimento al chiamante;
 *  - cifraLettera(), a cui si passa come argomenti il carattere da cifrare e 
 *  il carattere della parola chiave da usare, e restituisce al chiamante il 
 *  carattere cifrato;
 *  - decifraLettera(), a cui si passa come argomenti il carattere da decifrare 
 *  e il carattere della parola chiave da usare, e restituisce al chiamante il 
 *  carattere decifrato;
 *  - cifraMessaggio(), a cui si passa come argomenti il messaggio da cifrare e 
 *  la parola chiave, e restituisce al chiamante il messaggio cifrato;
 *  - decifraMessaggio(), a cui si passa come argomenti il messaggio da decifrare 
 *  e la parola chiave, e restituisce al chiamante il messaggio decifrato.
 *  Il programma dovrà consentire all’utente di cifrare e decifrare messaggi, e 
 *  cambiare la parola chiave, fino a che selezionerà la voce 
 *  “0 – Esci dal programma” nel menù
 ************/

import java.util.Scanner;

public class Es5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
		String parolaChiave = null;
		String messaggio = null;
		String messaggioCifrato = null;
		char[][] cifrario = Metodi.creaMatrice();
		boolean fine = false;
		
		while(!fine) {
			int inputLetto = Metodi.sceltaMenu();
			
			if ((inputLetto == 2 || inputLetto == 3) && parolaChiave == null)
				System.out.println("Non essendo stata ancora inserita alcuna "
						+ "parola chiave non è possibile cifrarla o decifrarla.");
			else {
				switch(inputLetto) {
					case 1: parolaChiave = Metodi.cambiaParolaChiave();
							break;
					case 2: System.out.println("Inserisci il messaggio che vorresti cifrare:");
							messaggio = tastiera.next();
							messaggio = Metodi.contieneMaiuscole(messaggio);
							messaggioCifrato = Metodi.cifraMessaggio(messaggio, parolaChiave);
							System.out.println(messaggioCifrato);
							break;
					case 3: System.out.println("Inserisci il messaggio che vorresti decifrare:");
							messaggio = tastiera.next();
							messaggio = Metodi.contieneMaiuscole(messaggio);
							messaggioCifrato = Metodi.decifraMessaggio(messaggio, parolaChiave);
							System.out.println(messaggioCifrato);
							break;
					case 0: fine = true;
							break;
				}
			}
		
		}
		
	}

}
