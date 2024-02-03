package esercizio2;

import java.util.Scanner;

/* Esercizio 2 
 * Scrivere un programma Java formato da due classi: 
 * Programma e Metodi. 
 * La classe Programma contiene solamente il metodo main(), che 
 * mostra a video il seguente menù:
 * a) somma di due numeri interi
 * b) divisione intera e resto tra due numeri interi
 * c) media tra due numeri double
 * d) valore assoluto di un numero intero
 * e) lunghezza della stringa che rappresenta un numero intero
 * t) termina il programma
 * e legge una delle lettere a, b, c, d, e, t (indifferentemente 
 * in minuscolo o maiuscolo), rifiutando con un messaggio d’errore 
 * qualsiasi altro carattere. 
 * Determinata la funzione che l’utente vuole eseguire, legge uno o 
 * due numeri (interi o double, a seconda della funzione scelta) e 
 * richiama gli opportuni metodi della classe Metodi per calcolare 
 * il risultato (o risultati) da stampare a video.
 * 
 * La classe Metodi, pertanto, conterrà i seguenti metodi, di cui 
 * vanno specificati opportunamente i parametri formali e il tipo 
 * di dati restituito al chiamante:
 * ➢ sommaDueInteri(): restituisce al chiamante la somma dei due 
 * numeri interi passati come argomenti;
 * ➢ divisioneIntera(): restituisce al chiamante il valore della 
 * divisione intera tra due numeri interi passati come argomenti. 
 * Questo metodo va chiamato solamente se il divisore è diverso
 * da 0;
 * ➢ restoDivisioneIntera(): restituisce al chiamante il resto 
 * della divisione intera tra due numeri interi passati come ar-
 * gomenti. Anche in questo caso, il divisore dovrebbe essere 
 * diverso da 0;
 * ➢ mediaTraDueDouble(): restituisce al chiamante la media arit-
 * metica tra due numeri double passati come argomenti;
 * ➢ valoreAssolutoIntero(): restituisce al chiamante il valore 
 * assoluto di un numero intero passato come argomento; 
 * ➢ lunghezzaStringaIntero(): restituisce al chiamante la lun-
 * ghezza della stringa che rappresenta il numero intero passato 
 * come argomento
 *******/

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
	      String inputLetto;
	      boolean inputValido, finito;
	      char comando;
	      int n,m;
	      double x,y;
	      
	      finito = false;
	      while (!finito) {
	         do {
	            System.out.println("Scegli una delle seguenti operazioni:");
	            System.out.println("a) somma di due numeri interi");
	            System.out.println("b) divisione intera e resto tra due numeri interi");
	            System.out.println("c) media tra due numeri double");
	            System.out.println("d) valore assoluto di un numero intero");
	            System.out.println("e) lunghezza della stringa che rappresenta un numero intero");
	            System.out.println("t) termina il programma");
	            System.out.print("> ");
	            inputLetto = tastiera.nextLine().toLowerCase();
	            inputValido = true;
	            if (inputLetto.length() != 1)
	               inputValido = false;
	            else {
	               comando = inputLetto.charAt(0);
	               switch (comando) {
	                  case 'a':
	                  case 'b':
	                  case 'c':
	                  case 'd':
	                  case 'e':
	                  case 't': break;
	                  default: inputValido = false;
	               }
	            }
	            if (!inputValido)
	               System.out.println("Comando specificato non valido!\n");
	         } while (!inputValido);
	         
	         // Esegue il comando specificato
	         comando = inputLetto.charAt(0);
	         switch (comando) {
	            case 'a': System.out.print("Inserisci due numeri interi: ");
	                      n = tastiera.nextInt();
	                      m = tastiera.nextInt();
	                      tastiera.nextLine();
	                      System.out.println("La loro somma e': " + Metodi.sommaDueInteri(n,m) + "\n");
	                      break;
	            case 'b': System.out.print("Inserisci due numeri interi: ");
	                      n = tastiera.nextInt();
	                      m = tastiera.nextInt();
	                      tastiera.nextLine();
	                      if (m == 0)
	                         System.out.println("Non e' possibile calcolare i risultati: il divisore e' 0\n");
	                      else {
	                         System.out.println("Il risultato della divisione e': " + Metodi.divisioneIntera(n,m));
	                         System.out.println("e il resto della divisione e': " + Metodi.restoDivisioneIntera(n,m) + "\n");
	                      }
	                      break;
	            case 'c': System.out.print("Inserisci due numeri double: ");
	                      x = tastiera.nextDouble();
	                      y = tastiera.nextDouble();
	                      tastiera.nextLine();
	                      System.out.println("La loro media e': " + Metodi.mediaTraDueDouble(x,y) + "\n");
	                      break;
	            case 'd': System.out.print("Inserisci un numero intero: ");
	                      n = tastiera.nextInt();
	                      tastiera.nextLine();
	                      System.out.println("Il suo valore assoluto e': " + Metodi.valoreAssolutoIntero(n) + "\n");
	                      break;
	            case 'e': System.out.print("Inserisci un numero intero: ");
	                      n = tastiera.nextInt();
	                      tastiera.nextLine();
	                      System.out.println("La lunghezza della stringa che lo rappresenta e': " + Metodi.lunghezzaStringaIntero(n) + "\n");
	                      break;
	            case 't': finito = true;
	         }
	      }
	}

}
