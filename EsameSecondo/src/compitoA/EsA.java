package compitoA;
/* Scrivere un programma Java composto da due classi: una denominata 
 * Programma contenente il metodo main(), l’altra denominata Metodi e 
 * contenente tutti gli altri metodi. Il programma deve svolgere le 
 * seguenti operazioni:
 * Metodo main() nella classe Programma:
 * 1. legge una sequenza di 6 valori interi positivi da linea di comando 
 * (cioè dai parametri args[] del metodo main()). Il programma sarà quindi 
 * utilizzabile dal Prompt dei comandi di Windows (cmd) come nei tre esempi 
 * che seguono:
 * > java Programma 1 1 1 1 1 -2
 * > java Programma 1 1 1 1 1 3
 * > java Programma 1 2 3 4 5 3
 * 2. utilizza i primi 5 valori per inizializzare un array denominato interi 
 * (si utilizzi il metodo Integer.parseInt(args[i]) per convertire le stringhe 
 * dei parametri in numeri interi)
 * 3. utilizza il sesto parametro in ingresso per inizializzare una variabile 
 * intera n
 * 4. crea una copia dell’array interi, denominata copiaInteri
 * 5. invoca il metodo modificaArray() (descritto sotto) passando come argomenti
 * copiaInteri e n
 * 6. stampa a video il contenuto degli array interi e copiaInteri
 * 7. invoca il metodo valutaDifferenzeArray() (descritto sotto) passando come 
 * parametri l’array interi originale e l’array copiaInteri
 * 8. se il valore restituito da valutaDifferenzeArray() è 1, stampa un messaggio 
 * di errore; se il valore restituito da valutaDifferenzeArray() è 0, stampa a video 
 * il contenuto dell’array copiaInteri; in tutti gli altri casi, stampa a video il 
 * contenuto dell’array interi
 * **********************************************************/

public class EsA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Controlla che ci siano 6 argomenti
	      if (args.length != 6) {
	         System.out.println("Errore: devi inserire 6 numeri interi!");
	         System.exit(0);
	      }
	      
	      // Crea e inizializza l'array interi
	      int[] interi = new int[5];
	      for (int i = 0; i < interi.length; i++)
	         interi[i] = Integer.parseInt(args[i]);
	     
	      // Crea e inizializza la variabile n
	      int n = Integer.parseInt(args[5]);
	      
	      // Controlla che tutti i numeri dati come argomenti siano positivi
	      for (int i = 0; i < interi.length; i++)
	         if (interi[i] <= 0) {
	            System.out.println("Errore: devi inserire 6 numeri interi!");
	            System.exit(0);      
	         }
	      if (n <= 0) {
	         System.out.println("Errore: devi inserire 6 numeri interi!");
	         System.exit(0);                
	      }

	      // Crea la copia dell'array interi
	      int[] copiaInteri = new int[5];
	      for (int i = 0; i < interi.length; i++)
	         copiaInteri[i] = interi[i];
	     
	      Metodi.modificaArray(copiaInteri,n);
	      
	      // Stampa a video il contenuto dei due array
	      System.out.print("Array interi: ");
	      Metodi.stampaArray(interi);
	      System.out.print("Array copiaInteri: ");
	      Metodi.stampaArray(copiaInteri);
	      
	      // Esegue il confronto tra i due array
	      int risultatoConfronto = Metodi.valutaDifferenzeArray(interi,copiaInteri);
	      if (risultatoConfronto == -1)
	         System.out.println("Errore: gli array hanno lunghezza diversa!");
	      else if (risultatoConfronto == 0) {
	         System.out.print("Array copiaInteri: ");
	         Metodi.stampaArray(copiaInteri);
	      }
	      else {
	         System.out.print("Array interi: ");
	         Metodi.stampaArray(interi);          
	      }
	}

}
