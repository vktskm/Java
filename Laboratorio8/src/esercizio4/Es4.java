package esercizio4;

/* Esercizio 4 (Somma ricorsiva)
 * Scrivere un programma Java che calcoli la somma a+b tra due numeri interi non 
 * negativi (cioè maggiori o uguali a 0) a e b in maniera ricorsiva, sfruttando la 
 * seguente definizione induttiva della somma:
 * a + 0 = a
 * a + b = (a + 1) + (b – 1) per b > 0
 * Definire pertanto un metodo ricorsivo somma(a,b), che restituisce al chiamante 
 * il valore della somma a+b. Basandosi sulla definizione induttiva data sopra, 
 * impostare la ricorsione sul secondo parametro.*/
import java.util.Scanner;

public class Es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner tastiera = new Scanner(System.in);
		int a,b;
		
		do {
			System.out.println("Inserisci il valore di a");
			a = tastiera.nextInt();
			tastiera.nextLine();
			if(a<0) {
				System.out.println("Inserisci un valore positivo");
			}
			
		}while(a < 0);
		
		do {
			System.out.println("Inserisci il valore di b");
			b = tastiera.nextInt();
			tastiera.nextLine();
			if(b<0) {
				System.out.println("Inserisci un valore positivo");
			}
		}while(b < 0);
		
		System.out.println("La somma di " + a + " e " + b + " e' " + somma(a,b));
		
		tastiera.close();

	}

	public static int somma(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return somma(a+1,b-1);
		}
	
	}

}
