package esercizio3;

/* Esercizio 3 (Valutazione di espressioni aritmetiche semplici)
 * Scrivere un programma Java che, letta una semplice espressione aritmetica 
 * da riga di comando, ne calcoli il valore e lo stampi a video. 
 * Le espressioni aritmetiche riconosciute come valide hanno le seguenti 
 * caratteristiche:
 * - gli operatori sono solo + e - (considerati come operatori binari)
 * - gli operandi sono solo cifre comprese tra 0 e 9
 * - ogni espressione inizia e finisce con un operando
 * - operandi e operatori sono intercalati
 * Esempi di espressioni valide:
 * 2 - 3 + 4
 * 3
 * 0 - 1 - 1 - 3 
 * Esempi di espressioni non valide:
 * 2 * 3 + 4 (non contiene solamente + e -)
 * 12 + 4 (l’operando 12 non è una cifra compresa tra 0 e 9)
 * -3 (non inizia con un operando)
 * 2 + - 5 (operandi e operatori non sono intercalati)
 * Come si diceva, l’espressione aritmetica viene specificata da riga di comando, 
 * quindi ad esempio:           java Programma 3 – 4 + 5
 * a cui il programma risponderà subito (senza ulteriori interazioni con l’utente): 4.
 * Se l’espressione specificata non è valida, il programma stamperà a video un 
 * messaggio d’errore. Il programma farà uso (almeno) dei seguenti metodi:
 * - controllaValiditaEspressione(): prende come argomento un riferimento all’array 
 * args dei parametri passati al programma da riga di comando, e verifica se l’espressione 
 * specificata in tali parametri è valida secondo le regole elencate sopra. 
 * Restituisce al chiamante un valore booleano;
 * - valutaOperando(): prende come argomento una stringa che rappresenta una cifra tra 
 * 0 e 9, e restituisce al chiamante il valore della cifra corrispondente (un int);
 * - valutaEspression(): prende come argomento un riferimento all’array args dei parametri 
 * passati al programma da riga di comando, e calcola il valore dell’espressione. Questo 
 * metodo va chiamato solo se il metodo controllaValiditaEspressione() ha precedentemente 
 * restituito true, e fa uso del metodo valutaOperando() per convertire gli operandi da 
 * String a int.
 *******/

public class Es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		
		boolean validita = Metodi.controllaValiditaEspressione(args);
		
		if (validita)
			System.out.print(Metodi.valutaEspressione(args));
		else {
			System.out.print("L'espressione inserita non è corretta.");
		}
	}

}
