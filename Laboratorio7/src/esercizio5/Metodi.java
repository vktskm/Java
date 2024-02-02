package esercizio5;

import java.util.Scanner;

public class Metodi {
	
	public static int sceltaMenu() {
		Scanner tastiera = new Scanner(System.in);
		int inputLetto;
		String parolaChiave = null;
		
		System.out.println("1 –Inserisci/cambia la parola chiave");
		System.out.println("2 –Cifra un messaggio");
		System.out.println("3 –Decifra un messaggio");
		System.out.println("0 –Esci dal programma");
		
		inputLetto = tastiera.nextInt();
		
		return inputLetto;
	}
	
	public static String contieneMaiuscole(String parola) {
		boolean valid = true;
		Scanner tastiera = new Scanner(System.in);
		
		for(int i = 0; i < parola.length(); i++) {
			char[] lettere = parola.toCharArray();
			if (Character.isUpperCase(lettere[i])) {
				System.out.println("La parola contiene caratteri maiuscoli.\n"
						+ "Inserire nuovamente la parola senza caratteri maiuscoli:");
				parola = tastiera.next();
				parola = contieneMaiuscole(parola);
			}
				
		}
		
		return parola;
	}
	
	public static String cambiaParolaChiave() {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci/cambia parola chiave:");
		String parolaChiave = tastiera.next();
		parolaChiave = contieneMaiuscole(parolaChiave);
		
		return parolaChiave;
	}
	
	public static char[][] creaMatrice() {
		char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[][] cifrario = new char[alfabeto.length][alfabeto.length];
		
		for(int i = 0; i< alfabeto.length; i++) {
			cifrario[i][0] = alfabeto[i]; 
			for(int j = 1; j< alfabeto.length; j++) {
				int valoreCarattere = cifrario[i][j-1]+1;
				
				if (valoreCarattere > "z".charAt(0))
					valoreCarattere -= alfabeto.length;
				
				cifrario[i][j] = Character.toString((char) valoreCarattere).charAt(0);
			}
		}
		
		return cifrario;
	}
	
	public static char cifraLettera(char carattereDaCifrare, char carattereParolaChiave) {
		char[][] cifrario = creaMatrice();
		return cifrario[carattereDaCifrare-"a".charAt(0)][carattereParolaChiave-"a".charAt(0)];
	}
	
	public static char decifraLettera(char carattereDaDecifrare, char carattereParolaChiave) {
		char[][] cifrario = creaMatrice();
		int indiceColonna = carattereParolaChiave-"a".charAt(0);
		int indiceRiga = 0;
		
		for(int i = 0; i< cifrario.length; i++) {
			if (cifrario[i][indiceColonna] == carattereDaDecifrare)
				indiceRiga = i;
		}
		
		return cifrario[indiceRiga][0];
	}
	
	public static String cifraMessaggio(String messaggio, String parolaChiave) {
		char [] lettereMessaggio = messaggio.toCharArray();
		char [] lettereParolaChiave = parolaChiave.toCharArray();
		char [] lettereCifrate = new char[lettereMessaggio.length];
		String messaggioCifrato;
		
		for(int i = 0; i< lettereMessaggio.length; i++) {
			lettereCifrate[i] = cifraLettera(lettereMessaggio[i], lettereParolaChiave[i%lettereParolaChiave.length]);
		}
		
		messaggioCifrato = new String(lettereCifrate);
		return messaggioCifrato;
	}
	
	public static String decifraMessaggio(String messaggio, String parolaChiave) {
		char [] lettereMessaggio = messaggio.toCharArray();
		char [] lettereParolaChiave = parolaChiave.toCharArray();
		char [] lettereDecifrate = new char[lettereMessaggio.length];
		String messaggioDecifrato;
		
		for(int i = 0; i< lettereMessaggio.length; i++) {
			lettereDecifrate[i] = decifraLettera(lettereMessaggio[i], lettereParolaChiave[i%lettereParolaChiave.length]);
		}
		
		messaggioDecifrato = new String(lettereDecifrate);
		return messaggioDecifrato;
	}
}