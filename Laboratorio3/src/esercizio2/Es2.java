package esercizio2;

import java.util.Scanner;

/*Esercizio 2
 * Scrivere un programma Java che chieda all’utente di inserire una 
 * frase tramite tastiera e,utilizzando gli opportuni metodi sulle 
 * stringhe, esegua le seguenti operazioni:
 * se la frase contiene 2 o più parole:
 * - stampi a video che la frase contiene due o più parole;
 * - stampi a video la prima parola e la sua lunghezza;
 * - stampi a video l’ultima parola e la sua lunghezza;
 * se la frase contiene una sola parola:
 * - stampi a video che la frase contiene una sola parola;
 * - stampi a video la parola e la sua lunghezza;
 * se la frase inserita è vuota:
 * - stampi a video che la frase non contiene parole.
 * Per semplicità, si assuma che la frase non inizi e non finisca 
 * con degli spazi, e che ogni parola sia separata dalla successiva 
 * usando un solo spazio. Grazie a questa assunzione, le parole sono 
 * individuabili semplicemente cercando gli spazi.*/

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner tastiera = new Scanner(System.in);
	      String frase;
		  int indicePrimoSpazio, indiceUltimoSpazio;

	      System.out.print("Inserisci una stringa: ");
	      frase = tastiera.nextLine();
		  
		  // Gestisce la stringa vuota
		  if (frase.length() == 0)
	         System.out.println("La frase non contiene parole.");
		  else {
	         indicePrimoSpazio = frase.indexOf(' ');
	         /*  Il metodo indexOf()restituisce l'indice della prima occorrenza 
	          * del carattere o della sottostringa specificati nella stringa chiamante. 
	          * Se l'elemento cercato non viene trovato, il metodo restituirà -1.*/
			 if (indicePrimoSpazio == -1) {
	            System.out.println("La frase e' composta da una sola parola,");
				System.out.print("che e' \"" + frase + "\"");
				System.out.println(" ed e' lunga " + frase.length() + " caratteri.");
	         }
			 else {
	            System.out.println("La frase e' composta da due o piu' parole.");
				String primaParola = frase.substring(0,indicePrimoSpazio);
	            System.out.print("La prima parola e' \"" + primaParola + "\"");
				System.out.println(" ed e' lunga " + primaParola.length() + " caratteri,");
	            indiceUltimoSpazio = frase.lastIndexOf(' ');
				String ultimaParola = frase.substring(indiceUltimoSpazio+1);
	            System.out.print("L'ultima parola e' \"" + ultimaParola + "\"");
				System.out.println(" ed e' lunga " + ultimaParola.length() + " caratteri.");			
	         }
		  }	
	}

}
