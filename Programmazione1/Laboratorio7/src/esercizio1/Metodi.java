package esercizio1;

public class Metodi {
	
	public static int numeroRandom() {
		int Min = 1;
		int Max = 100;
		int rand = Min + (int)(Math.random() * ((Max - Min) + 1));
		return rand;
	}

	public static int confrontaNumeri(int numeroInserito, int numeroDaIndovinare) {
		if (numeroInserito > numeroDaIndovinare) {
			return 1;
		} else if (numeroInserito == numeroDaIndovinare) {
			return 0;
		} else {
			return -1;
		}
	}

	public static void aggiornaPartite(int[] numeriDaIndovinare, int[] numeroTentativi,
			boolean[] indovinato, int numeroDaIndovinare, int tentativi, boolean corretto,
			int numeroPartite) {

		if (numeroPartite<5) {
			numeriDaIndovinare[numeroPartite] = numeroDaIndovinare;
			numeroTentativi[numeroPartite] = tentativi;
			indovinato[numeroPartite] = corretto;
		}else {
			for (int i = 1; i < 5; i++) {
				numeriDaIndovinare[i-1] = numeriDaIndovinare[i];
				numeroTentativi[i-1] = numeroTentativi[i];
				indovinato[i-1] = indovinato[i];
			}

			numeriDaIndovinare[4] = numeroDaIndovinare;
			numeroTentativi[4] = tentativi;
			indovinato[4] = corretto;
		}
	}

}
