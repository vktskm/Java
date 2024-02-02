package esercizio6;

import java.util.Random;

public class Metodi {
	// 0 indica una posizione vuota
	// 1 indica una posizione occupata dall'utente
	// 2 indica una posizione occupata dal computer
	
	public static void stampaConfigurazioneDiGioco(int[][] matrice) {
		for(int i=0; i<matrice.length; i++) {
			for(int j=0; j<matrice[i].length; j++) {
				if(matrice[i][j] == 0) {
					System.out.print(' ');
				}else {
					if(matrice[i][j] == 1) {
						System.out.print('O');
					}else {
						System.out.print('X');
					}
				}
				System.out.print('|');
			}
			System.out.println("\n-+-+-");
		}
	}

	public static int[][] creaNuovaConfigurazione(){
		int[][] matrice = new int[3][3];

		for(int  i=0; i<matrice.length; i++)
			for(int j=0; j<matrice[i].length; j++)
				matrice[i][j] = 0;

		return matrice;
	}

	public static void mossaComputer(int[][] matrice) {
		boolean mossaEseguita = false;

		//L'utente ha occupato due caselle di fila?
		//Controllo righe
		for(int i=0; i<matrice.length && !mossaEseguita; i++)
			for(int j=0; j<matrice[i].length-1 && !mossaEseguita; j++)
				if(matrice[i][j] == 1 && matrice[i][j] == matrice[i][j+1] && matrice[i][(j+2) % matrice[i].length] == 0) {
					matrice[i][(j+2) % matrice[i].length] = 2;
					mossaEseguita=true;
				}

		//Controllo colonne
		for(int j=0; j<matrice[0].length && !mossaEseguita; j++)
			for(int i=0; i<matrice.length-1 && !mossaEseguita; i++)
				if(matrice[i][j] == 1 && matrice[i][j] == matrice[i+1][j] && matrice[(i+2) % matrice.length][j] == 0) {
					matrice[(i+2) % matrice.length][j] = 2;
					mossaEseguita=true;
				}

		//Controllo prima diagonale
		for(int i=0; i<matrice.length-1 && !mossaEseguita; i++)
			if(matrice[i][i] == 1 && matrice[i][i] == matrice[i+1][i+1] && matrice[(i+2) % matrice.length][(i+2) % matrice.length] == 0) {
				matrice[(i+2) % matrice.length][(i+2) % matrice.length] = 2;
				mossaEseguita=true;
			}

		//Controllo seconda diagonale
		for(int i=0; i<matrice.length-1 && !mossaEseguita; i++) {
			int j = 2-i;
			if(matrice[i][j] == 1 && matrice[i][j] == matrice[i+1][j-1] && matrice[(i+2) % matrice.length][2-((i+2) % matrice.length)] == 0) {
				matrice[(i+2) % matrice.length][2-((i+2) % matrice.length)] = 2;
				mossaEseguita=true;
			}
		}

		//Coppie di caselle adiacenti
		for(int i=0; i<matrice.length && !mossaEseguita; i++) {
			for(int j=0; j<matrice.length && !mossaEseguita; j++) {
				int contUtente = 0;
				int contComputer = 0;

				//Controllo l'intorno della casella selezionata in cerca di coppie
				if(matrice[i][j] == 0) {
					for(int k=i-1; k<=i+1; k++) {
						for(int l=j-1; l<=j+1; l++) {
							if(k >= 0 && k < matrice.length && l >= 0 && l < matrice.length && matrice[k][l] != 0){
								if(matrice[k][l] == 1) {
									contUtente++;
								}else {
									if(matrice[k][l] == 2)
										contComputer++;
								}
							}
						}
					}
				}

				if(contUtente >= 2 || contComputer >= 2) {
					matrice[i][j] = 2;
					mossaEseguita = true;
				}
			}
		}

		//Controllo della casella centrale
		if(!mossaEseguita && matrice[1][1] == 0) {
			matrice[1][1] = 2;
			mossaEseguita=true;
		}

		//Controllo caselle angolo
		for(int i=0; i<matrice.length && !mossaEseguita; i=i+2)
			for(int j=0; j<matrice[i].length && !mossaEseguita; j=j+2)
				if(matrice[i][j] == 1 && matrice[2-i][2-j] == 0) {
					matrice[2-i][2-j] = 2;
					mossaEseguita=true;
				}

		//Controllo presenza di un angolo vuoto
		for(int i=0; i<matrice.length && !mossaEseguita; i=i+2)
			for(int j=0; j<matrice[i].length && !mossaEseguita; j=j+2)
				if(matrice[i][j] == 0) {
					matrice[i][j] = 2;
					mossaEseguita=true;
				}

		//Occupare una casella vuota qualsiasi
		while(!mossaEseguita) {
			Random r = new Random();
			int i = r.nextInt(matrice.length);
			int j = r.nextInt(matrice[0].length);

			if(matrice[i][j] == 0) {
				matrice[i][j] = 2;
				mossaEseguita = true;
			}
		}

	}

	public static boolean mossaUtente(int[][] matrice, int riga, int colonna) {
		if(riga >= 0 && riga < matrice.length && colonna >= 0 && colonna < matrice[0].length)
			if(matrice[riga][colonna] == 0) {
				matrice[riga][colonna] = 1;

				return true;
			}

		System.out.println("La casella scelta non va bene, scegline un'altra.");

		return false;

	}

	public static int verificaVittoria(int[][] matrice) {
		int risultato = 0;

		//Controllo righe
		for(int i=0; i<matrice.length; i++) {
			if(matrice[i][0] == matrice[i][1] && matrice[i][1] == matrice[i][2])
				if(matrice[i][0] == 1) {
					risultato = 1;
				}else {
					if(matrice[0][i] == 2)
						risultato = -1;
				}
		}

		//Controllo colonne
		if(risultato == 0) {
			for(int i=0; i<matrice.length; i++) {
				if(matrice[0][i] == matrice[1][i] && matrice[1][i] == matrice[2][i])
					if(matrice[0][i] == 1) {
						risultato = 1;
					}else {
						if(matrice[0][i] == 2)
							risultato = -1;
					}
			}
		}

		//Controllo diagonali
		if(risultato == 0) {
			if((matrice[0][0] == matrice[1][1] && matrice[1][1] == matrice[2][2]) || (matrice[0][2] == matrice[1][1] && matrice[1][1] == matrice[2][0]))
				if(matrice[1][1] == 1) {
					risultato = 1;
				}else {
					if(matrice[1][1] == 2)
						risultato = -1;
				}
		}

		return risultato;
	}

	public static boolean controlloSpaziLiberi(int[][] matrice) {
		boolean trovato = false;

		for(int i=0; i<matrice.length; i++)
			for(int j=0; j<matrice.length; j++)
				if(matrice[i][j] == 0)
					trovato = true;

		return trovato;
	}
   
}
