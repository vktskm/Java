package esercizio4;

import java.util.Scanner;

public class Es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
		int numCol, numRig;
		int[][] matrice, matriceT;
		
		do {
			System.out.println("Inserisci numero colonne (tra 1 e 10):");
			numCol = tastiera.nextInt();
		
			if (numCol < 1 || numCol > 10)
				System.out.println("Il numero inserito non è corretto");
		
		}while(numCol<1 || numCol > 10);
		
		do {
			System.out.println("Inserisci numero righe (tra 1 e 10):");
			numRig = tastiera.nextInt();
			
			if (numRig < 1 || numRig > 10)
				System.out.println("Il numero inserito non è corretto");
			
		}while(numRig<1 || numRig > 10);
		
		matrice = Metodi.generaMatriceCasuale(numCol, numRig);
		System.out.println("Matrice generata casualmente:");
		Metodi.stampaMatrice(matrice);
		
		matriceT = Metodi.trasponiMatrice(matrice);
		System.out.println("Matrice transposta:");
		Metodi.stampaMatrice(matriceT);
	}

}
