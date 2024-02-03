package esercizio5;

import java.util.Scanner;

/* Esercizio 5
 * Scrivere un programma Java che permetta all’utente di 
 * convertire numeri interi positivi da decimale a binario 
 * o viceversa, fino a quando decide di uscire dal programma 
 * (gestire quindi un menù a 3 scelte: 
 * Decimale → Binario,  Binario → Decimale, Uscita). 
 * Il programma dovrà contenere i seguenti metodi:
 * ➢ menu(): stampa a video il menù per l’utente, e restituisce 
 * al chiamante la scelta effettuata;
 * ➢ convertiDecInBin(): prende come argomento un numero intero 
 * positivo (prima di chiamare il metodo, verificare che il nu- 
 * mero sia positivo) espresso in decimale (es.: 243), e restituisce
 * al chiamante la stringa che corrisponde al numero specificato 
 * espresso in binario;
 * ➢ convertiBinInDec(): prende come argomento un numero intero 
 * positivo espresso in binario (notare che non stiamo usando la 
 * notazione in complemento a 2, quindi se il bit più significativo 
 * è 1 considerare il numero come positivo) e restituisce al chiamante 
 * l’intero corrispondente.
 **/

public class Es5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner tastiera = new Scanner(System.in);
	      int comando, decimale;
	      String binario;
	      boolean inputCorretto;

	      System.out.println("Programma di conversione da decimale a binario, e viceversa.\n");
	      boolean finito = false;
	      while (!finito) {
	         comando = menu();  
	         switch (comando) {
	            case 1: do {
	                       System.out.print("Inserisci un numero (decimale) intero positivo: ");
	                       decimale = tastiera.nextInt();
	                       if (decimale <= 0)
	                          System.out.println("Devi inserire un numero positivo!");
	                    } while (decimale <= 0);
	                    System.out.println("In binario, e' " + convertiDecInBin(decimale) + ".\n");
	                    break;
	            case 2: do {
	                       System.out.print("Inserisci un numero in binario: ");
	                       binario = tastiera.nextLine();
	                       inputCorretto = true;
	                       for (int i = 0; i < binario.length() & inputCorretto; i++)
	                          if (binario.charAt(i) != '0' && binario.charAt(i) != '1')
	                             inputCorretto = false;
	                       if (!inputCorretto)
	                          System.out.println("Devi inserire un numero in binario!");
	                    } while (!inputCorretto);
	                    System.out.println("In decimale, e' " + convertiBinInDec(binario) + ".\n");
	                    break;
	            case 3: finito = true;
	         }         
	      }
	   }

	   public static int menu() {
	      Scanner tastiera = new Scanner(System.in);
	      int comando;
	      
	      do {
	         System.out.println("1) Conversione decimale -> binario");
	         System.out.println("2) Conversione binario -> decimale");
	         System.out.println("3) Esci dal programma");
	         System.out.print("\nInserisci un numero [1-3]: ");
	         comando = tastiera.nextInt();
	         if (comando < 1 || comando > 3)
	            System.out.println("Il numero inserito non e' valido!\n");
	      } while (comando < 1 || comando > 3);
	      return comando;
	   }   
	   
	   public static String convertiDecInBin (int decimale) {
	      String binario = "";
	      while (decimale > 0) {
	         if (decimale % 2 == 0)
	            binario = "0" + binario;
	         else
	            binario = "1" + binario;
	         decimale /= 2;
	      }
	      return binario;
	   }
	   
	   public static int convertiBinInDec (String binario) {
	      int decimale = 0;
	      
	      for (int i = 0; i < binario.length(); i++) {
	         decimale *= 2;
	         System.out.println("decimale è " + decimale + " " + binario.charAt(i));
	         if (binario.charAt(i) == '1')
	            decimale++;
	      }
	      return decimale;
	}

}
