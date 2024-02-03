package esercizio3;

import java.util.Scanner;

/*
 * Scrivere un programma Java che legga da tastiera:
 * - una stringa, e la salvi nella variabile messaggio;
 * - un numero intero, e lo salvi nella variabile posizione;
 * - una seconda stringa, e la salvi nella variabile stringa;
 * e costruisca un nuovo messaggio, da stampare in output, ottenuto inserendo 
 * nella stringa messaggio, a partire dalla posizione, la stringa.
 * Di seguito viene presentato un esempio di I/O risultante dall'esecuzione 
 * del programma Java implementato:
 * 
 * Inserisci una stringa: gelo a Milano
 * Inserisci un numero: 3
 * Inserisci un’altra stringa: at
 * Il messaggio e’: gelato a Milano
 * 
 * Si implementino inoltre i seguenti controlli:
 * - le stringhe inserite non devono essere vuote;
 * - la posizione specificata deve essere compresa tra 0 e la lunghezza di 
 * messaggio – 1.
 * Se uno di questi controlli dovesse fallire, il programma deve stampare un 
 * messaggio di errore e terminare l’esecuzione, usando il metodo exit().*/

public class Es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
		  
		  System.out.print("Inserisci una stringa: ");
		  String messaggio = tastiera.nextLine();
		  if (messaggio.length() == 0) {
	         System.out.println("La stringa non puo' essere vuota!");
			 System.exit(-1);
		  }
		  
		  System.out.print("Inserisci una posizione all'interno della stringa: ");
		  int posizione = tastiera.nextInt();
		  if (posizione < 0 || posizione >= messaggio.length()) {
	         System.out.print("La posizione specificata deve essere compresa tra 0 e ");
			 System.out.println(messaggio.length()-1 + "!");
			 System.exit(-1);
		  }
		  
		  tastiera.nextLine();  // Rimuove il \n rimasto nel buffer
		  
		  System.out.print("Inserisci ora un'altra stringa: ");
		  String stringa = tastiera.nextLine();
		  if (stringa.length() == 0) {
	         System.out.println("La stringa non puo' essere vuota!");
			 System.exit(-1);
		  }
		  
	      String nuovoMessaggio = messaggio.substring(0,posizione) + 
	    		  stringa +messaggio.substring(posizione);
		  
		  System.out.println("Il messaggio costruito e': " + nuovoMessaggio);
	}

}
