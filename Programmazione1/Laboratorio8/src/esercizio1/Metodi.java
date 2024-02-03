package esercizio1;

public class Metodi {
       
	public static int[] creaArray() {
		int[] array = new int[100];
		return array;
	}

	public static boolean aggiungiElemento(int[] array, int numeroElementi, int elemento) {
		boolean trovato = false;

		if(numeroElementi < array.length) {

			//Ricerca se l'elemento è già presente
			for(int i=0; i<numeroElementi; i++) {
				if(array[i] == elemento) {
					trovato = true;
				}
			}

			if(!trovato) {
				array[numeroElementi] = elemento;
				return true;
			}
		}
		return false;
	}
	
	public static boolean rimuoviElemento(int[] array, int numeroElementi, int elemento) {
		boolean trovato = false;
		
		//Ricerca l'elemento
		for(int i=0; i<numeroElementi; i++) {
			if(!trovato && array[i] == elemento) {
				trovato = true;
			}
			
			//Shift dei valori per occupare la posizione vuota
			if(trovato && i < numeroElementi-1) {
				array[i] = array[i+1];
			}
		}
		
		if(trovato) {
			return true;
		}
		return false;
	}
	
	public static void stampaArray(int[] array, int numeroElementi) {
		for(int i=0; i<numeroElementi; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
