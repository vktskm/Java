package cartaoro2;

import java.util.Scanner;

/*
 * E’ noto che l’estremo superiore dell’insieme                                                                                        
 * { n/n+1 tale che n appartiene N}  vale 1 .  Quindi                                                                                                     
 * per ogni a > 0  esiste  n che appartiene N :   1 - a  < n / n+1  <= 1                     
 * Scrivere un programma in Java che legge un valore a di tipo double e calcola, 
 * partendo da n=0, tutti i valori di n/(n+1) finchè non ne trova uno che soddisfa 
 * la condizione sopra riportata. Il programma deve poi stamparlo a video con il 
 * corrispondente valore di n.
 * */
public class Oro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tastiera = new Scanner(System.in);

        System.out.print("Inserisci il valore di a: ");
        double a = tastiera.nextDouble();

        double n = 0;
        double valore = 0;
        while (true){
        	
            valore = n / (n + 1);
            /* Questo programma chiede all'utente di inserire il valore di a, 
             * quindi utilizza un ciclo while per calcolare i valori di n/(n+1) 
             * partendo da n=0 finché trova un valore che soddisfa la condizione 
             * 1 - a < n / (n+1) <= 1. 
             */ 
            if (1 - a < valore && valore <= 1) {
                System.out.println("Valore di n: " + n);
                System.out.println("Valore di n/(n+1): " + valore);
                break;
            }
            
            System.out.println("Valore di n: " + n);
            System.out.println("Valore di n/(n+1): " + valore);

            n++;
        }

        tastiera.close();

	}

}
