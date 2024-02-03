package esercizio3;

public class Metodi {
   
	public static int[] creaMatrice(int n, int m) {
		int[] array = new int[n*m];
		
		for(int i=0; i < array.length; i++) {
			array[i] = 0;
		}
		
		return array;
	}

	public static void scriviElemento(int[] array, int n, int m, int i, int j, int elemento) {
		if(array.length != m*n || i*m+j > n*m || i < 0 || j < 0) {
			System.out.println("Errore: la posizione inserita non e' valida");
			System.exit(0);
		}

		array[i*m+j] = elemento;
	}

	public static int leggiElemento(int[] array, int n, int m, int i, int j) {
		if(array.length != m*n || i*m+j > n*m || i < 0 || j < 0) {
			System.out.println("Errore: la posizione inserita non e' valida");
			System.exit(0);
		}

		return array[i*m+j];
	}
	
	public static void stampaMatrice(int[] array, int n, int m) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(leggiElemento(array, n, m, i, j) + " ");
			}
			System.out.println();
		}
	}

}
