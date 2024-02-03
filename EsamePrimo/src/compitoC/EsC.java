package compitoC;

import java.util.Scanner;

/* Scrivere un programma Java, denominato EsameC.java che:
 * - legga da tastiera una stringa formata da lettere minuscole;
 * - se la stringa letta contiene dei caratteri che non sono lettere minuscole, 
 * il programma termina immediatamente l’esecuzione;
 * - stampi a video quante sono le vocali contenute nella stringa;
 * - crei e stampi a video una stringa identica a quella che è stata inserita 
 * dall’utente, ma con le consonanti in maiuscolo;
 * - calcoli e stampi a video la somma dei codici Unicode di ciascun carattere 
 * che compone la stringa inserita dall’utente;
 * - calcoli e stampi a video la media (in virgola mobile) dei codici Unicode 
 * di ciascun carattere che compone la stringa inserita dall’utente.
 * Norme di implementazione
 * Il programma deve essere realizzato utilizzando esclusivamente i concetti di 
 * programmazione presentati nella prima parte del corso. L’unico tipo di ciclo 
 * consentito è il while. Il programma deve essere realizzato in modo da non 
 * generare errori in compilazione.
 ******************/

public class EsC {
	
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    
		Scanner tastiera = new Scanner(System.in);
	    int i;

	    System.out.print("Inserisci una stringa formata da lettere minuscole: ");
		  String stringa = tastiera.nextLine();

	    boolean stringaValida = true;
	    i = 0;
	    while (stringaValida && i < stringa.length()) {
	       if (stringa.charAt(i) < 'a' || stringa.charAt(i) > 'z')
	          stringaValida = false;
	       i++;
	    }
	    if (!stringaValida) {
	       System.out.println("Errore: la stringa inserita non e' valida!");
	       System.exit(-1);
	    }
	    
	    int numVocali = 0;
	    i = 0;
	    while (i < stringa.length()) {
	       switch (stringa.charAt(i)) {
	          case 'a':
	          case 'e':
	          case 'i':
	          case 'o':
	          case 'u': numVocali++;
	       }
	       i++;
	    }      
	    System.out.println("La stringa contiene " + numVocali + " vocali.");

	    String nuovaStringa = "";
	    i = 0;
	    while (i < stringa.length()) {
	       switch (stringa.charAt(i)) {
	          case 'a':
	          case 'e':
	          case 'i':
	          case 'o':
	          case 'u': nuovaStringa += stringa.charAt(i);
	                    break;
	          default: nuovaStringa += (char) (stringa.charAt(i) - 'a' + 'A');
	       }
	       i++;
	    }
	    System.out.println("La nuova stringa e': " + nuovaStringa);
	    
	    int somma = 0;
	    i = 0;
	    while (i < stringa.length()) {
	       somma += stringa.charAt(i);
	       i++;
	    }
	    System.out.println("La somma dei codici Unicode e': " + somma);
	    
	    double media = (double) somma / stringa.length();
	    System.out.println("La media dei codici Unicode e': " + media);  
	    
   }
}
