package esercizio5;

/* Esercizio 5 (MCD ricorsivo)
 * Scrivere un programma Java che calcoli il massimo comun divisore (MCD) tra due numeri 
 * interi positivi a e b in maniera ricorsiva, sfruttando la definizione induttiva già 
 * vista nella quarta esercitazione:
 * MCD(x,x) = x
 * MCD(x,y) = MCD(y,x)
 * MCD(x,y) = MCD(x – y,y) se x > y
 * Definire pertanto un metodo ricorsivo mcd(a,b), che restituisce al chiamante il valore 
 * del massimo comun divisore tra a e b. Basandosi sulla definizione induttiva data sopra, 
 * impostare la ricorsione sul primo parametro, scambiando fra loro gli argomenti passati 
 * quando è necessario farlo
 ***************************/


import java.util.Scanner;

public class Es5 {

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
		
		System.out.println("Il MCD di " + a + " e " + b + " e' " + MCD(a,b));
		
		tastiera.close();

	}

	public static int MCD(int a, int b) {
		if(a==b) {
			return a;
		}else {
			if(a>b) {
				return MCD(a-b,b);
			}else {
				return MCD(b,a);
			}
		}

	}

}
