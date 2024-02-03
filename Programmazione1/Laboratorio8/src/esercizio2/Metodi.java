package esercizio2;

import java.util.Random;

public class Metodi {

	public static int[][] creaMondo(){
		int[][] mondo = new int[20][20];

		for(int i=0; i < mondo.length; i++) {
			for(int j=0; j < mondo[i].length; j++) {
				mondo[i][j] = 0;
			}
		}

		return mondo;
	}

	public static boolean aggiungiObiettivo(int[][] mondo, int riga, int colonna) {

		if(riga>=0 && riga<mondo.length && colonna>=0 && colonna<mondo[0].length && mondo[riga][colonna] == 0) {
			mondo[riga][colonna] = 1;
			return true;
		}
		return false;

	}

	public static boolean aggiungiOstacolo(int[][] mondo) {
		Random r = new Random();
		int riga = r.nextInt(mondo.length);
		int colonna = r.nextInt(mondo[0].length);

		if(mondo[riga][colonna] == 0) {
			mondo[riga][colonna] = 2;
			return true;
		}
		return false;
	}

	public static int aggiungiPosizioniRobot(int[][] mondo, String percorso) {
		int riga = 0;
		int colonna = 0;
		int risultato = 0;
		
		//Controllo posizione iniziale
		switch (mondo[riga][colonna]) {
		case 1: risultato = 1;	//Obiettivo in [0,0]
			break;
		case 2: risultato = 2;	//Ostacolo in [0,0]
			break;
		default: mondo[riga][colonna] = 3;	//Posizione vuota in [0,0]
			break;
		}

		int i = 0;
		while(i < percorso.length() && risultato == 0) {
			
			//Movimento
			switch(percorso.charAt(i)) {
			case 's': riga++;
				break;
			case 'n': riga--;
				break;
			case 'e': colonna++;
				break;
			case 'o': colonna--;
				break;
			default: break;
			}
			
			//Controllo posizione
			if(riga<0 || riga>=mondo.length || colonna<0 || colonna>=mondo[0].length) {
				risultato = 3;	//Uscito dal mondo
			}else {
				switch(mondo[riga][colonna]) {
				case 1: risultato = 1; //Obiettivo raggiunto
					break;
				case 2: risultato = 2; //Ostacolo colpito
					break;
				default: mondo[riga][colonna] = 3; //Posizione valida
					break;
				}
			}
			
			i++;
		}

		return risultato;
	}
	
	public static void stampaMondo(int[][] mondo) {
		for(int i=-1; i<= mondo.length; i++) {
			for(int j=-1; j<=mondo[0].length; j++) {
				if(i==-1 || i==mondo.length || j==-1 || j==mondo[0].length) {
					System.out.print('*');
				}else {
					switch(mondo[i][j]){
					case 0: System.out.print(' ');
						break;
					case 1: System.out.print('X');
						break;
					case 2: System.out.print('#');
						break;
					case 3: System.out.print('O');
						break;
					}
				}
			}
			System.out.println();
		}
	}

}


