package esercizio1;

import java.util.Scanner;

/* Esercizio 1 (Array parzialmente riempito)
 * Scrivere un programma Java che consenta all’utente di effettuare operazioni 
 * su un array di interi parzialmente riempito. L’array può contenere da zero 
 * a un massimo di 100 elementi interi; 
 * il numero di interi contenuto in un certo momento è indicato dalla variabile 
 * intera numeroElementi. Le operazioni sono implementate come metodi della classe 
 * Metodi, mentre il metodo main() della classe Programma viene utilizzato per 
 * testare tali operazioni.
 * Le operazioni da implementare nella classe Metodi sono le seguenti:
 * - creaArray(): alloca un array di 100 elementi interi, e ne restituisce un 
 * riferimento al chiamante;
 * - aggiungiElemento(array,numeroElementi,elemento): aggiunge all’array specificato 
 * (contenente attualmente numeroElementi valori, presenti dall’indice 0 all’indice 
 * numeroElementi – 1) l’elemento specificato, se non c’è già, e in tal caso restituisce il 
 * valore booleano true al chiamante. Se l’elemento è già presente nell’array, lascia l’array 
 * inalterato e restituisce false. Si noti che se numeroElementi vale 100 non è possibile 
 * inserire l’elemento specificato, anche se non è presente nell’array: 
 * in tal caso lasciare l’array inalterato e restituire false al chiamante;
 * - rimuoviElemento(array,numeroElementi,elemento): rimuove dall’array, contenente 
 * numeroElementi valori, l’elemento specificato, se c’è, e in tal caso restituisce 
 * il valore booleano true al chiamante. Se l’elemento non è presente nell’array, 
 * lascia l’array inalterato e restituisce false. Si noti che rimuovendo un elemento 
 * si può creare un “buco”nella sequenza dei valori; gestire la cosa, facendo in modo 
 * che all’uscita del metodo i valori validi presenti nell’array siano quelli con indice 
 * compreso tra 0 e numeroElementi – 2.
*/
public class Es1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		int numeroElementi=0;
		int elemento;
		int[] array;

		array = Metodi.creaArray();

		String inputLetto;
		boolean inputValido, finito;
		char comando;

		finito = false;
		while (!finito) {
			do {
				System.out.println("Scegli una delle seguenti operazioni:");
				System.out.println("a) Aggiungi elemento all'array");
				System.out.println("b) Elimina elemento dall'array");
				System.out.println("c) Termina il programma");
				System.out.print("> ");

				inputLetto = tastiera.nextLine().toLowerCase();
				inputValido = true;
				if (inputLetto.length() != 1)
					inputValido = false;
				else {
					comando = inputLetto.charAt(0);
					switch (comando) {
					case 'a':
					case 'b':
					case 'c': break;
					default: inputValido = false;
					}
				}
				if (!inputValido)
					System.out.println("Comando specificato non valido!\n");
			} while (!inputValido);

			// Esegue il comando specificato
			comando = inputLetto.charAt(0);
			switch (comando) {
			case 'a': System.out.print("Inserisci elemento da aggiungere: ");
					elemento = tastiera.nextInt();
					tastiera.nextLine();
					
					if(Metodi.aggiungiElemento(array, numeroElementi, elemento)) {
						numeroElementi++;
						System.out.println("L'elemento " + elemento + " e' stato aggiunto");
					}else {
						if(numeroElementi < array.length) {
							System.out.println("L'elemento " + elemento + " era gia' presente");
						}else {
							System.out.println("Non   possibile aggiungere altri elementi");
						}
					}
					System.out.print("Array: ");
					Metodi.stampaArray(array, numeroElementi);
					System.out.println("\n");
					
					break;
					
			case 'b': System.out.print("Inserisci elemento da eliminare: ");
					elemento = tastiera.nextInt();
					tastiera.nextLine();
					
					if(Metodi.rimuoviElemento(array, numeroElementi, elemento)) {
						numeroElementi--;
						System.out.println("L'elemento " + elemento + " e' stato eliminato");
					}else {
						System.out.println("L'elemento " + elemento + " non era presente");
					}
					System.out.print("Array: ");
					Metodi.stampaArray(array, numeroElementi);
					System.out.println("\n");
					
					break;
					
			case 'c': finito = true;
			}
		}
		tastiera.close();

	}

}
