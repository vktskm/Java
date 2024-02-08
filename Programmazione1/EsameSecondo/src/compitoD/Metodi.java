package compitoD;

/* La classe Metodi conterrà i seguenti metodi, più eventualmente quelli 
 * che si ritenesse utile definire (ad es., per stampare il contenuto di 
 * un array, o per altre operazioni di uso frequente):
 * - modificaArray(): ha come parametri due array di caratteri denominati 
 * pari e dispari. Fa diventare maiuscole le vocali di pari se la lunghezza 
 * di pari è minore della lunghezza di dispari, e fa diventare maiuscole le 
 * consonanti di dispari se la lunghezza di dispari è minore della lunghezza 
 * di pari (e lascia inalterati i due array se hanno la stessa lunghezza). 
 * Non restituisce niente al chiamante
 * - unisciArray(): ha come parametri due array di caratteri denominati par1 
 * e par2, e crea e restituisce al chiamante la stringa ottenuta concatenando 
 * i caratteri di par1 e par2.
 *******************/

public class Metodi {
	
	public static void stampaArray (char[] array) {
	      for (int i = 0; i < array.length; i++)
	         System.out.print(array[i] + "  ");
	      System.out.println();
	   }

	   public static void modificaArray (char[] pari, char[] dispari) {
	      if (pari.length < dispari.length) {
	         for (int i = 0; i < pari.length; i++)
	            switch (pari[i]) {
	               case 'a':
	               case 'e':
	               case 'i':
	               case 'o':
	               case 'u':
	                  pari[i] = (char) (pari[i] + 'A' - 'a');
	            }
	      }
	      else if (pari.length > dispari.length) {
	         for(int i = 0; i < dispari.length; i++)
	            switch (dispari[i]) {
	               case 'a':
	               case 'e':
	               case 'i':
	               case 'o':
	               case 'u':
	                  break;
	               default:
	                  dispari[i] = (char) (dispari[i] + 'A' - 'a');
	            }
	      }
	   }

	   public static String unisciArray (char[] par1, char[] par2) {
	      String risultato = "";

	      for(int i = 0; i < par1.length; i++)
	         risultato += par1[i];
	      for(int i = 0; i < par2.length; i++)
	         risultato += par2[i];
	      return risultato;
	   }
	   
	   
 }