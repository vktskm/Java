package esercizio3;

import java.util.Scanner;

/* Esercizio 3 (Simulazione di una matrice bidimensionale)
 * Scrivere un programma Java che simuli le operazioni di accesso e modifica di un 
 * elemento in una matrice bidimensionale, usando un array unidimensionale. In altre 
 * parole, il programma lavora su un array unidimensionale array[] di interi, e i 
 * metodi scriviElemento() e leggiElemento() specificati sotto danno l’illusione di 
 * lavorare con una matrice bidimensionale matrice[][] di interi.
 * I metodi da implementare nella classe Metodi sono i seguenti, mentre il metodo 
 * main() della classe . Programma viene utilizzato per testare tali operazioni:
 * - creaMatrice(n,m): crea un array unidimensionale di n × m elementi interi, che 
 * verrà usato per simulare una matrice di n righe ed m colonne, e ne restituisce un 
 * riferimento al chiamante;
 * - scriviElemento(array,n,m,i,j,elemento): 
 * dato il riferimento ad un array unidimensionale di n × m elementi, considerarlo 
 * come una matrice di n righe ed m colonne i cui elementi sono memorizzati una riga 
 * dopo l'altra, e simulare l’operazione di assegnamento array[i][j] = elemento. 
 * Il metodo non restituisce nulla al chiamante. Verificare che la lunghezza dell’array 
 * sia effettivamente uguale a n × m, e che gli indici i e j non vadano fuori dalla 
 * matrice; in caso contrario, stampare un messaggio d’errore e uscire dal programma;
 * - leggiElemento(array,n,m,i,j): 
 * i parametri sono da interpretare come nel metodo precedente. 
 * Viene restituito al chiamante il valore dell’elemento array[i][j]. Anche in questo 
 * caso, verificare che la lunghezza dell’array sia effettivamente uguale a n × m, e 
 * che gli indici i e j non vadano fuori dalla matrice; 
 * in caso contrario, stampare un messaggio d’errore e uscire dal programma;
 * - stampaMatrice(array,n,m): stampa gli elementi della matrice, una riga dopo l’altra, 
 * andando a capo al termine di ogni riga. Per accedere agli elementi della matrice, 
 * questo metodo fa uso del metodo leggiElemento(array,n,m,i,j)
 ****************/

public class Es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
		int n, m, i, j;
		int elemento;
		int[] array;
		String inputLetto;
		boolean inputValido, finito;
		char comando;

		do {
			System.out.println("Inserisci il numero di righe maggiore di 1");
			n = tastiera.nextInt();
			tastiera.nextLine();
		}while(n < 1);
		
		do {
			System.out.println("Inserisci il numero di colonne maggiore di 1");
			m = tastiera.nextInt();
			tastiera.nextLine();
		}while(m < 1);
		
		array = Metodi.creaMatrice(n,m);

		finito = false;
		while (!finito) {
			do {
				System.out.println("Scegli una delle seguenti operazioni:");
				System.out.println("a) Scrivi elemento nella matrice");
				System.out.println("b) Leggi elemento nella matrice");
				System.out.println("c) Stampa la matrice");
				System.out.println("d) Termina il programma");
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
					case 'c':
					case 'd': break;
					default: inputValido = false;
					}
				}
				if (!inputValido)
					System.out.println("Comando specificato non valido!\n");
			} while (!inputValido);

			// Esegue il comando specificato
			comando = inputLetto.charAt(0);
			switch (comando) {
			case 'a': System.out.print("Inserisci elemento da scrivere: ");
				elemento = tastiera.nextInt();
				tastiera.nextLine();
				
				System.out.print("Inserisci riga dell'elemento: ");
				i = tastiera.nextInt();
				tastiera.nextLine();
				
				System.out.print("Inserisci colonna dell'elemento: ");
				j = tastiera.nextInt();
				tastiera.nextLine();
				
				Metodi.scriviElemento(array, n, m, i, j, elemento);
	
				break;

			case 'b': System.out.print("Inserisci riga dell'elemento da leggere: ");
				i = tastiera.nextInt();
				tastiera.nextLine();
				
				System.out.print("Inserisci colonna dell'elemento da leggere: ");
				j = tastiera.nextInt();
				tastiera.nextLine();
				
				elemento = Metodi.leggiElemento(array, n, m, i, j);
				System.out.println("L'elemento in posizione [" + i + ", " + j + "] e' " + elemento);

				break;

			case 'c': Metodi.stampaMatrice(array, n, m);
				break;
			
			case 'd': finito = true;
			}
			System.out.println();
		}
		tastiera.close();
	}

}
