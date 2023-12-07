package esercizio3;
/*
 *Scrivere un programma Java che esegua le seguenti operazioni:
 * • definisca due variabili intere x e y;
 * • definisca due variabili double a e b;
 * • assegni alle variabili i valori x e y -> 7 e 2;
 * • assegni alle variabili i valori a e b -> 7.0 e 2.0;
 * • stampi a video il quoziente e il resto della divisione di x e y;
 * • stampi a video il risultato della divisione di a e b.
 * */
public class Es3 {
	
   public static void main (String args[]) {
	    // TODO Auto-generated method stub
	   
		int x;
		int y;
		double a;
		double b;
		x = 7;
		y = 2;
		a = 7.0;
		b = 2.0;

		int quoziente = x / y;
		int resto = x % y;
		double divisione = a / b;
		
		System.out.println("x/y vale " + quoziente + ", con resto " + resto);
		//x/y vale 3, con resto 1
		System.out.println("a/b vale " + divisione);
		//a/b vale 3.5
       }
}
