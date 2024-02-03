package compitoC;

/* Metodo main() nella classe Programma:
 * 1. legge da tastiera un numero intero positivo n, istanzia un array di interi 
 * denominato interi di tale lunghezza, e legge da tastiera n numeri interi con 
 * cui inizializza l’array
 * 2. legge da tastiera due interi a e b tali che a < b
 * 3. invoca il metodo occorrenzeElementi() (definito sotto), passandogli come 
 * argomenti l’array interi e i numeri a e b
 * 4. crea una copia dell’array interi, denominata copiaInteri
 * 5. stampa a video il contenuto dell’array originale interi, e di quello modi-
 * ficato dalla chiamata al metodo occorrenzeElementi()
 * 6. se il metodo occorrenzeElementi() ha modificato più della metà degli elementi 
 * dell’array interi,
 * a) invoca il metodo modificaElementi() (definito sotto), passandogli come 
 * argomenti i due array
 * b) stampa a video il risultato del metodo modificaElementi()
 ***************************************************************/

import java.util.Scanner;

public class EsC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 Scanner tastiera = new Scanner(System.in);
	      int n, a, b;
	      
	      // Legge da tastiera un numero intero positivo n
	      do {
	         System.out.print("Inserisci un numero intero positivo n: ");
	         n = tastiera.nextInt();
	         if (n <= 0)
	            System.out.println("Errore: devi inserire un numero intero positivo!");
	      } while (n <= 0);
	      
	      // Crea un array di n elementi interi
	      int[] interi = new int[n];
	      
	      // Legge da tastiera il contenuto dell'array
	      for (int i = 0; i < n; i++) {
	         System.out.print("Inserisci l'elemento numero " + i + ": ");
	         interi[i] = tastiera.nextInt();
	      }
	      
	      do {
	         System.out.print("Inserisci ora due numeri interi a e b tali che a < b: ");
	         a = tastiera.nextInt();
	         b = tastiera.nextInt();
	         if (a >= b)
	            System.out.println("Avevo detto a < b!");
	      } while (a >= b);
	      
	      // Crea una copia dell'array interi
	      int[] copiaInteri = new int[interi.length];
	      for (int i=0; i < interi.length; i++)
	         copiaInteri[i] = interi[i];
	      
	      Metodi.occorrenzeElementi(interi,a,b);

	      // Stampa il contenuto dei due array      
	      System.out.print("Array interi: ");
	      Metodi.stampaArray(interi);
	      System.out.print("Array copiaInteri: ");
	      Metodi.stampaArray(copiaInteri);
	      
	      // Conta quanti elementi di interi sono stati modificati da occorrenzeElementi()
	      int count = 0;
	      for (int i=0; i < interi.length; i++)
	         if (interi[i] != copiaInteri[i])
	            count++;
	        
	      if (count > interi.length/2) {
	         System.out.print("Array modificato: ");
	         Metodi.stampaArray(Metodi.modificaElementi(interi,copiaInteri));
	      }
	}

}
