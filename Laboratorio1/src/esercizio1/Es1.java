package esercizio1;

/* Scrivere un programma Java che esegua le seguenti operazioni:
 * • definisca due variabili intere x e y;
 * • assegni alle variabili i valori 3 e 5;
 * • stampi a video i valori di x e y.
 * a) Cosa succede se le variabili intere non vengono inizializzate?
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
 * The local variable x may not have been initialized
 * The local variable y may not have been initialized
 * b) Cosa succede se le variabili intere vengono inizializzate con i valori 3.0 e 5.0 ?
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
 * Type mismatch: cannot convert from double to int
 * Type mismatch: cannot convert from double to int
 * c) Cosa succede se le variabili intere vengono inizializzate con i valori ’a’ e ’b’ ?
 * x vale 97, y vale 98
 * */

public class Es1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		x = 3;
		y = 5;
		
		System.out.println("x vale " + x + ", y vale " + y);
        // x vale 3, y vale 5
	}

}
