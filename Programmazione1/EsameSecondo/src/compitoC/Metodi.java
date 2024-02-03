package compitoC;

/* La classe Metodi conterrà i seguenti metodi, più eventualmente quelli che 
 * si ritenesse utile definire (ad es., per stampare il contenuto di un array, 
 * o per altre operazioni di uso frequente):
 * - occorrenzeElementi(): ha come parametri un array di interi denominato par 
 * e due interi a e b. Sostituisce con b gli elementi di par minori di a, e con 
 * a gli elementi di par maggiori di b; tutti gli altri elementi di par rimangono 
 * inalterati. Non restituisce niente al chiamante
 * - modificaElementi(): ha come parametri due array di interi denominati par1 e 
 * par2. Crea e restituisce al chiamante un terzo array, ottenuto inserendo gli 
 * elementi di par1 e par2 in maniera alternata: ad esempio, dati gli array 
 * {1, 2, 3, 4, 5} e {6, 7, 8, 9, 10}, il risultato sarebbe l’array 
 * {1, 6, 2, 7, 3, 8, 4, 9, 5, 10}. 
 **/

public class Metodi {
       
	   public static void stampaArray(int[] array) {
	      for (int i=0; i < array.length; i++)
	         System.out.print(array[i] + "  ");
	      System.out.println();
	   }
	   
	   public static void occorrenzeElementi (int[] par, int a, int b) {
	      for (int i=0; i < par.length; i++) {
	         if (par[i] < a)
	            par[i] = b;
	         else if (par[i] > b)
	                 par[i] = a;
	      }
	   }
	   
	   public static int[] modificaElementi (int[] par1, int[] par2) {
	      int[] risultato = new int[par1.length + par2.length];
	      
	      int k = 0;
	      for (int i=0; i < par1.length; i++) {
	         risultato[k++] = par1[i];
	         risultato[k++] = par2[i];
	      }
	      return risultato;
	   }
}
