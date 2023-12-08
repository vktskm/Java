package esercizio6;

import java.util.Scanner;

/*
 * Scrivere un programma Java che legga da tastiera due stringhe di 5 caratteri ciascuna, formate dai caratteri
 * + e -. Ad esempio:
 * Inserisci la prima stringa: +++--
 * Inserisci la seconda stringa: -+--+
 * Se le stringhe inserite non sono entrambe di 5 caratteri, o se i caratteri sono diversi da + e -, il programma
 * stampa un messaggio d’errore e termina l’esecuzione.
 * Siano poi a e b due variabili intere, inizializzate rispettivamente con i valori 0 e 4.
 * La prima stringa indica le operazioni di incremento e di decremento da fare al valore della variabile a;
 * analogamente, la seconda stringa indica le operazioni di incremento e decremento da applicare al valore della
 * variabile b. Il programma deve applicare il primo incremento/decremento specificato per entrambe le
 * variabili, poi il secondo incremento/decremento ad entrambe, e così via, stampando ogni volta a video i
 * valori ottenuti per le due variabili. Se dopo un incremento/decremento di entrambe le variabili dovesse
 * capitare che a e b assumono lo stesso valore, stampare un messaggio a video e terminare l’esecuzione del
 * programma.
 * Segue un esempio di output prodotto dal programma, dopo aver inserito le due stringhe dell’esempio dato
 * sopra:
 * Il valore di a e’ 1, il valore di b e’ 3.
 * Il valore di a e’ 2, il valore di b e’ 4.
 * Il valore di a e’ 3, il valore di b e’ 3.
 * Le variabili a e b hanno assunto lo stesso valore!
 * */
public class Es6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
		  
		  System.out.print("Inserisci la prima stringa: ");
		  String operazioniA = tastiera.next();
		  if (operazioniA.length() != 5) {
	         System.out.println("La stringa deve essere di 5 caratteri!");
			 System.exit(-1);
		  }
		  
		  // Controlla che i caratteri siano tutti + o -
		  if (operazioniA.charAt(0) != '+' && operazioniA.charAt(0) != '-') {
	         System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }
		  if (operazioniA.charAt(1) != '+' && operazioniA.charAt(1) != '-') {
	         System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }
		  if (operazioniA.charAt(2) != '+' && operazioniA.charAt(2) != '-') {
	         System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }
		  if (operazioniA.charAt(3) != '+' && operazioniA.charAt(3) != '-') {
	         System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }
		  if (operazioniA.charAt(4) != '+' && operazioniA.charAt(4) != '-') {
	         System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }
		  
		  System.out.print("Inserisci la seconda stringa: ");
		  String operazioniB = tastiera.next();
		  if (operazioniB.length() != 5) {
	         System.out.println("La stringa deve essere di 5 caratteri!");
			 System.exit(-1);
		  }
		  // Controlla che i caratteri siano tutti + o -
		  if (operazioniB.charAt(0) != '+' && operazioniB.charAt(0) != '-') {
	         System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }
		  if (operazioniB.charAt(1) != '+' && operazioniB.charAt(1) != '-') {
	         System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }
		  if (operazioniB.charAt(2) != '+' && operazioniB.charAt(2) != '-') {
	         System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }
		  if (operazioniB.charAt(3) != '+' && operazioniB.charAt(3) != '-') {
	         System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }
		  if (operazioniB.charAt(4) != '+' && operazioniB.charAt(4) != '-') {
	         System.out.println("La stringa contiene caratteri non validi!");
			 System.exit(-1);
		  }
		  
		  // Dichiara e inizializza le variabili
		  int a = 0, b = 4;
		  
		  // Esegue le operazioni indicate dalle due stringhe
		  if (operazioniA.charAt(0) == '+')
	         a++;
	      else
	         a--;
	      if (operazioniB.charAt(0) == '+')
	         b++;
	      else
	         b--;
		  System.out.println("Il valore di a e' " + a + ", il valore di b e' " + b + ".");
	      if (a == b) {
	         System.out.println("Le variabili a e b hanno assunto lo stesso valore!");
			 System.exit(0);
		  }
		  
		  if (operazioniA.charAt(1) == '+')
	         a++;
	      else
	         a--;
	      if (operazioniB.charAt(1) == '+')
	         b++;
	      else
	         b--;
		  System.out.println("Il valore di a e' " + a + ", il valore di b e' " + b + ".");
	      if (a == b) {
	         System.out.println("Le variabili a e b hanno assunto lo stesso valore!");
			 System.exit(0);
		  }
		  
		  if (operazioniA.charAt(2) == '+')
	         a++;
	      else
	         a--;
	      if (operazioniB.charAt(2) == '+')
	         b++;
	      else
	         b--;
		  System.out.println("Il valore di a e' " + a + ", il valore di b e' " + b + ".");
	      if (a == b) {
	         System.out.println("Le variabili a e b hanno assunto lo stesso valore!");
			 System.exit(0);
		  }
		  
		  if (operazioniA.charAt(3) == '+')
	         a++;
	      else
	         a--;
	      if (operazioniB.charAt(3) == '+')
	         b++;
	      else
	         b--;
		  System.out.println("Il valore di a e' " + a + ", il valore di b e' " + b + ".");
	      if (a == b) {
	         System.out.println("Le variabili a e b hanno assunto lo stesso valore!");
			 System.exit(0);
		  }
		  
		  if (operazioniA.charAt(4) == '+')
	         a++;
	      else
	         a--;
	      if (operazioniB.charAt(4) == '+')
	         b++;
	      else
	         b--;
		  System.out.println("Il valore di a e' " + a + ", il valore di b e' " + b + ".");
	      if (a == b) {
	         System.out.println("Le variabili a e b hanno assunto lo stesso valore!");
			 System.exit(0);
		  }		  
	}

}
