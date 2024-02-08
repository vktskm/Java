package compitoA;

public class Metodi {
	
	   public static void stampaArray(int[] array) {
	        
		   for (int i = 0; i < array.length; i++)
	             System.out.print(array[i] + "  ");
	      
	       System.out.println();
	   }
	   
       /* modificaArray(): ha come parametri un array 
        * di interi denominato par e un intero
        ********************************************/    
	   public static void modificaArray(int[] par, int a) {
	      
		  int sum = 0, prod = 1;
	      
		  //Calcola la somma sum e il prodotto prod di tutti gli elementi di par. 
	      for (int i = 0; i < par.length; i++) {
	         sum += par[i];
	         prod *= par[i];
	      }
	      
	      /* Se a è compreso fra (prod – sum) e (prod + sum), sostituisce i valori di  
	       * par maggiori di a con prod + sum, altrimenti sostituisce i valori di par 
	       * minori di a con prod - sum
	       *******************************************************/
	      if (prod-sum <= a && a <= prod+sum) {
	         for (int i = 0; i < par.length; i++)
	            if (par[i] > a)
	               par[i] = prod + sum;  
	         
	         System.out.println("Somma");
	      }
	      else {
	         for (int i = 0; i < par.length; i++)
	            if (par[i] < a)
	               par[i] = prod - sum; 
	         
	         System.out.println("Sottrazione");
	         
	      }      
	   }
	   
	   // valutaDifferenzeArray(): ha come parametri due 
	   // array di interi denominati par1 e par2. 
	   public static int valutaDifferenzeArray(int[] par1, int[] par2) {
		
	   // Se i due array hanno la stessa lunghezza, il metodo restituisce 
	   // al chiamante il valore intero così determinato:
	   // 0, se il contenuto dei due array è identico
	   // 1 altrimenti
	   //Se invece la lunghezza dei due array è diversa, il metodo restituisce -1
	   //Ad esempio, dati gli array par1 = {1, 2, 3, 4, 5} e par2 = {3, 4, 5, 6, 7}, 
	   //il valore restituito sarebbe 1. 
	      if (par1.length != par2.length) 
	    	  return -1;
	      // Da qui in poi, gli array hanno la stessa lunghezza
	      for (int i = 0; i < par1.length; i++)
	         if (par1[i] != par2[i])
	            return 1;
	      
	      return 0;
	   }
}
