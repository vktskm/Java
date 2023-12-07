package esercizio4;

/*
 * Scrivere un programma Java che esegua le seguenti operazioni:
 * • definisca due variabili carattere x e y;
 * • assegni alla variabile x il valore ’a’, alla variabile y il valore ’b’;
 * • stampi a video la stringa ab.
 * NOTA: utilizzando solo l’operatore + il risultato e' numerico, in quanto i caratteri
 * vengono codificati come numeri.
 * */
public class Es4 {
	
	public static void main (String args[]) {
	    // TODO Auto-generated method stub
		
		char x;
		char y;
		x = 'a';
		y = 'b';
		
		System.out.print("La concatenazione e' ");
		System.out.println("" + x + y);
		//La concatenazione e' ab
		System.out.println("" + (int)x + (int)y);//9798
		System.out.println(x + y);//195
		
	}

}
