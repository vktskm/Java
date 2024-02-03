package compitoD;

import java.util.Scanner;

/* Scrivere un programma Java, denominato EsameD.java che:
 * - legga da tastiera una stringa formata da lettere maiuscole;
 * - se la stringa letta contiene dei caratteri che non sono lettere maiuscole, il 
 * programma termina immediatamente l’esecuzione;
 * - stampi a video tutte le rotazioni a sinistra della stringa letta. Ad esempio, 
 * se la stringa letta è CHIAVE, il programma stamperà a video le seguenti stringhe 
 * (rotazioni di CHIAVE):
 * HIAVEC
 * IAVECH
 * AVECHI
 * VECHIA
 * ECHIAV
 * CHIAVE
 * - stampi a video quante sono le vocali contenute nella stringa e, per ogni vocale, 
 * quante volte compare nella stringa.
 * Norme di implementazione
 * Il programma deve essere realizzato utilizzando esclusivamente i concetti di 
 * programmazione presentati nella prima parte del corso. L’unico tipo di ciclo 
 * consentito è il while. Il programma deve essere realizzato in modo da non 
 * generare errori in compilazione.
 ****************************************************************************************/

public class EsD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 Scanner tastiera = new Scanner(System.in);
	      int i,j,k;

	      System.out.print("Inserisci una stringa formata da lettere maiuscole: ");
		  String stringa = tastiera.nextLine();

	      boolean stringaValida = true;
	      i = 0;
	      while (stringaValida && i < stringa.length()) {
	         if (stringa.charAt(i) < 'A' || stringa.charAt(i) > 'Z')
	            stringaValida = false;
	         i++;
	      }
	      if (!stringaValida) {
	         System.out.println("Errore: la stringa inserita non e' valida!");
	         System.exit(-1);
	      }

	      j = 1;
	      while (j <= stringa.length()) {
	         k = 0;
	         while (k < stringa.length()) {
	            System.out.print(stringa.charAt((j+k)%stringa.length()));
	            k++;
	         }
	         System.out.println();
	         j++;
	      }
	      
	      int numA = 0;
	      int numE = 0;
	      int numI = 0;
	      int numO = 0;
	      int numU = 0;
	      
	      i = 0;
	      while (i < stringa.length()) {
	         switch (stringa.charAt(i)) {
	            case 'A': numA++;
	                      break;
	            case 'E': numE++;
	                      break;
	            case 'I': numI++;
	                      break;
	            case 'O': numO++;
	                      break;
	            case 'U': numU++;
	         }
	         i++;
	      }
	      int numVocali = numA + numE + numI + numO + numU;
	      System.out.println("Nella stringa ci sono " + numVocali + " vocali, e precisamente:");
	      System.out.println(numA + " A");
	      System.out.println(numE + " E");
	      System.out.println(numI + " I");
	      System.out.println(numO + " O");
	      System.out.println(numU + " U");   
		
	}

}
