package compitoB;

/* Metodo main() nella classe Programma:
 * 1. legge una sequenza di 6 caratteri da linea di comando (cioè dai parametri 
 * args[] del metodo main()). Il programma sarà quindi utilizzabile dal Prompt 
 * dei comandi di Windows (cmd) come nei due esempi che seguono:
 * > java Programma a b c c c b
 * > java Programma a b c c c d
 * 2. utilizza i primi 5 caratteri specificati per inizializzare un array denomi-
 * nato caratteri, convertendo in maniera opportuna le stringhe dei parametri 
 * args[] in caratteri.
 * 3. utilizza il sesto parametro in ingresso per inizializzare una variabile c 
 * di tipo char
 * 4. crea una copia dell’array caratteri, denominata copiaCaratteri
 * 5. invoca il metodo modificaArray() (descritto sotto) passando come argomenti
 * copiaCaratteri e c
 * 6. stampa a video il contenuto degli array caratteri e copiaCaratteri
 * 7. invoca il metodo valutaDifferenzeArray() (descritto sotto) passando come 
 * parametri l’array caratteri originale e l’array copiaCaratteri
 * 8. se il valore restituito da valutaDifferenzeArray() è -1, stampa un messaggio 
 * di errore; se il valore restituito da valutaDifferenzeArray() è 0, stampa a 
 * video il contenuto dell’array copiaCaratteri; in tutti gli altri casi, stampa a 
 * video il contenuto dell’array caratteri
 ****************************/


public class EsB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		  // Controlla che ci siano 6 argomenti
	      if (args.length != 6) {
	         System.out.println("Errore: devi inserire 6 caratteri!");
	         System.exit(0);
	      }
	      
	      // Controlla che gli argomenti siano singoli caratteri
	      for (int i = 0; i < args.length; i++)
	         if (args[i].length() != 1) {
	            System.out.println("Errore: devi inserire 6 caratteri!");
	            System.exit(0);       
	         }
	      
	      // Crea e inizializza l'array caratteri
	      char[] caratteri = new char[5];
	      for (int i = 0; i < caratteri.length; i++)
	         caratteri[i] = args[i].charAt(0);
	     
	      // Crea e inizializza la variabile c
	      char c = args[5].charAt(0);
	      
	      // Crea la copia dell'array caratteri
	      char[] copiaCaratteri = new char[5];
	      for (int i = 0; i < caratteri.length; i++)
	         copiaCaratteri[i] = caratteri[i];
	     
	      Metodi.modificaArray(copiaCaratteri,c);
	      
	      // Stampa a video il contenuto dei due array
	      System.out.print("Array caratteri: ");
	      Metodi.stampaArray(caratteri);
	      System.out.print("Array copiaCaratteri: ");
	      Metodi.stampaArray(copiaCaratteri);
	      
	      // Esegue il confronto tra i due array
	      int risultatoConfronto = Metodi.valutaDifferenzeArray(caratteri,copiaCaratteri);
	      if (risultatoConfronto == -1)
	         System.out.println("Errore: gli array hanno lunghezza diversa!");
	      else if (risultatoConfronto == 0) {
	         System.out.print("Array copiaCaratteri: ");
	         Metodi.stampaArray(copiaCaratteri);
	      }
	      else {
	         System.out.print("Array caratteri: ");
	         Metodi.stampaArray(caratteri);          
	      }
	}

}
