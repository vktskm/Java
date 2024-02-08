package compitoD;

/* Metodo main() nella classe Programma:
 * 1. legge una stringa da linea di comando (cioè dal parametro args[] del metodo 
 * main()) e la memorizza in una variabile denominata stringa
 * 2. utilizza i caratteri di stringa in posizione pari per inizializzare un array 
 * di caratteri denominato pari, di dimensione opportuna; similmente, utilizza i 
 * caratteri di stringa in posizione dispari per inizializzare un array di caratteri 
 * denominato dispari, di dimensione opportuna
 * 3. invoca il metodo modificaArray() (definito sotto), passandogli come argomenti 
 * gli array pari e dispari
 * 4. stampa il contenuto degli array originali pari e dispari, e il contenuto degli 
 * array (eventualmente) modificati dalla chiamata al metodo modificaArray()
 * 5. Se il metodo modificaArray() ha modificato il contenuto dell’array dispari,
 * a) invoca il metodo unisciArray() (anch’esso definito sotto) passandogli come 
 * argomenti gli array pari e dispari
 * b) stampa a video il risultato del metodo unisciArray()
 *******************************/


public class EsD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		if (args.length != 1){
	         System.out.println("Errore: devi inserire una stringa come parametro!");
	         System.exit(0);
	      }

	      String stringa = args[0];
          
	      
	      boolean controllo = true;
	      int k=0;
			while(  k < stringa.length() && controllo) {
				
				if(  stringa.charAt(k) < 'a' ||  stringa.charAt(k) > 'z') 
					controllo = false;
				
				k++;
			}
			
	        if( !controllo ) {
			    System.out.println("Devi inserire solamente caratteri nella stringa");
				System.exit(1);
			}
	      
	      
	      // Calcola la lunghezza corretta dell'array pari
	      int lunghezzaPari = 0;
	      if (stringa.length() % 2 == 0)
	         lunghezzaPari = stringa.length()/2;
	      else
	         lunghezzaPari = stringa.length()/2 + 1;

	      // Crea gli array pari e dispari, e le loro copie
	      char[] pari = new char[lunghezzaPari];
	      char[] copiaPari = new char[lunghezzaPari];
	      char[] dispari = new char[stringa.length()/2];
	      char[] copiaDispari = new char[stringa.length()/2];

	      // Riempie gli array pari e dispari, e le loro copie
	      for (int i = 0; i < pari.length; i++) {
	         pari[i] = stringa.charAt(2*i);
	         copiaPari[i] = stringa.charAt(2*i);
	      }
	      for (int i = 0; i < dispari.length; i++) {
	         dispari[i] = stringa.charAt(2*i+1);
	         copiaDispari[i] = stringa.charAt(2*i+1);
	      }

	      Metodi.modificaArray(pari,dispari);

	      // Stampa il contenuto degli array
	      System.out.print("Array pari originale: ");
	      Metodi.stampaArray(copiaPari);
	      System.out.print("Array dispari originale: ");
	      Metodi.stampaArray(copiaDispari);
	      System.out.print("Array pari modificato: ");
	      Metodi.stampaArray(pari);
	      System.out.print("Array dispari modificato: ");
	      Metodi.stampaArray(dispari);
	      
	      // Controlla se il metodo modificaArray() ha modificato l'array dispari
	      boolean arrayUguali = true;
	      for (int i = 0; i < dispari.length && arrayUguali; i++)
	         if (dispari[i] != copiaDispari[i])
	            arrayUguali = false;

	      // Se il contenuto dell'array dispari è cambiato, invoca il metodo
	      // unisciArray() e ne stampa a video il risultato
	      if (!arrayUguali) {
	         System.out.print("Il risultato di unisciArray e': ");
	         System.out.println(Metodi.unisciArray(pari,dispari));
	      }     
		
	      
	}

}
