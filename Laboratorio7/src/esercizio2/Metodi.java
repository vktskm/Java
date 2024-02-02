package esercizio2;

public class Metodi {
	
	public static String estraiStringaCasuale() {
		String[] vocabolario = {"casa", "albero", "barbagianni", "frigorifero"};
		int rand = (int)(Math.random() * vocabolario.length);
		
		return vocabolario[rand];
	}
	
	public static void stampaLettereIndovinate(char[] parolaVisualizzata) {
		System.out.println(parolaVisualizzata);
	}
	
	public static char[] scopriLettera(char lettera, char[] caratteriDaIndovinare, char[] parolaVisualizzata) {
		for (int i = 0; i < parolaVisualizzata.length; i++) {
			if (caratteriDaIndovinare[i] == lettera)
				parolaVisualizzata[i] = lettera;
		}
		
		return parolaVisualizzata;
	}

}
