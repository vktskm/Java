package compitoB;

public class Metodi {
	
	/* La classe Metodi conterrà i seguenti metodi, più eventualmente quelli 
	 * che si ritenesse utile definire (ad es., per stampare il contenuto di 
	 * un array, o per altre operazioni di uso frequente):
	 * - modificaArray(): ha come parametri un array di caratteri denominato 
	 * par e un carattere c. Conta quante volte c compare in par. Se tale va-
	 * lore è uguale a 0, sostituisce con c i caratteri di par di indice pari; 
	 * se invece tale valore è minore della lunghezza di par allora sostitui- 
	 * sce con c i caratteri di par di indice dispari, altrimenti lascia 
	 * l’array inalterato
	 * - valutaDifferenzeArray(): ha come parametri due array di caratteri 
	 * denominati par1 e par2. Se i due array hanno la stessa lunghezza, il 
	 * metodo restituisce al chiamante il valore intero così determinato:
	 * 0, se il contenuto dei due array è identico
	 * 1 altrimenti
	 * Se invece la lunghezza dei due array è diversa, il metodo restituisce -1.
	 * Ad esempio, dati gli array par1 = {‘a’, ‘b’, ‘c’, ‘d’, ‘e’} e par2 = 
	 * {‘a’, ‘b’, ‘c’, ‘d’, ‘f’}, il valore restituito sarebbe 1
	 ***********************************/
	
	public static void stampaArray(char[] array) {
	      for (int i = 0; i < array.length; i++)
	         System.out.print(array[i] + "  ");
	      System.out.println();
	   }
	   
	   public static void modificaArray(char[] par, char c) {
	      int count = 0;
	      
	      for (int i = 0; i < par.length; i++)
	         if (par[i] == c)
	            count++;
	      
	      if (count == 0) {
	         for (int i = 0; i < par.length; i+=2)
	            par[i] = c;        
	      }
	      else if (count < par.length) {
	         for (int i = 1; i < par.length; i+=2)
	            par[i] = c;                 
	      }      
	   }
	   
	   public static int valutaDifferenzeArray(char[] par1, char[] par2) {
	      if (par1.length != par2.length) return -1;
	      // Da qui in poi, gli array hanno la stessa lunghezza
	      for (int i = 0; i < par1.length; i++)
	         if (par1[i] != par2[i])
	            return 1;
	      return 0;
	   }
}
