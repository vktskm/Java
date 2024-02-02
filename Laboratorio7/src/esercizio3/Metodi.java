package esercizio3;

import java.util.*;

public class Metodi {
	
	public static boolean controllaValiditaEspressione(String[] variabili) {
		int len = variabili.length;
		boolean validita = true;
		
		for(int i = 0; i<len; i++) {
			if(i%2==0 || i == len-1) {
				if( !variabili[i].chars().allMatch( Character::isDigit ) || 
					Character.getNumericValue(variabili[i].charAt(0))<0 || 
					Character.getNumericValue(variabili[i].charAt(0))>9) {
						validita = false;
				}
			}else {
			if(!(variabili[i].charAt(0) == '-' || variabili[i].charAt(0) == '+')) {
				validita = false;
				}
			}
				
		}
		
		return validita;
	}
	
	public static int valutaOperando(String carattere) {
		int numero = Character.getNumericValue(carattere.charAt(0));
		return numero;
	}
	
	public static int valutaEspressione(String[] variabili) {
		int len = variabili.length;
		int temp = valutaOperando(variabili[0]);
		int risultato = valutaOperando(variabili[0]);
		
		for(int i = 0; i<len-1; i++) {
			if(i%2 != 0) {
				switch(variabili[i]) {
				case "+": risultato = temp + valutaOperando(variabili[i+1]);
						  break;
				case "-": risultato = temp - valutaOperando(variabili[i+1]);
						  System.out.println(valutaOperando(variabili[i-1]));
						  System.out.println(valutaOperando(variabili[i+1]));
						  break;	
				}
				temp = risultato;
			}
		}
		return risultato;
	}

}
