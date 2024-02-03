package esercizio4;

import java.util.Arrays;

public class Metodi {
	
	public static int[][] generaMatriceCasuale(int numCol, int numRig) {
		int rand;
		int[][] newMatrice = new int[numRig][numCol];
		
		for(int i = 0; i < numRig; i++) {
			for(int j = 0; j < numCol; j++) {
				rand = (int)(Math.random() * 100);
				newMatrice[i][j] = rand;
			}
		}
		
		return newMatrice; 
	}
	
	public static int[][] trasponiMatrice(int[][] matrice){
		int[][] matriceTrasposta = new int[matrice[0].length][matrice.length];
		
		for(int i = 0; i< matrice[0].length; i++) {
			for(int j = 0; j<matrice.length ; j++) {
				matriceTrasposta[i][j] = matrice[j][i];
			}
		}
		
		return matriceTrasposta;
	}
	
	public static void stampaMatrice(int[][] matrice) {
		
		for (int i = 0; i< matrice.length; i++) {
			for (int j = 0; j< matrice[0].length; j++) {
				System.out.format("%d ", matrice[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("\n");
	}
}