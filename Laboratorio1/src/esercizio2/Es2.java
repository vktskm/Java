package esercizio2;

/*Scrivere un programma Java che esegua le seguenti operazioni:
 * • definisca due variabili double x e y;
 * • assegni alle variabili i valori 125.0 e 85.3;
 * • stampi a video i valori di x e y, il loro prodotto e la loro divisione.
 * a) Cosa succede se le variabili vengono inizializzate con i valori 125 e 85 ?
 * x vale 125.0, y vale 85.0
 * il loro prodotto vale 10625.0
 * e la loro divisione 1.4705882352941178
 */

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x;
		double y;
		x = 125.0;
		y = 85.3;
		
		double prodotto = x * y;
		double divisione = x / y;
		
		System.out.println("x vale " + x + ", y vale " + y);
		System.out.println("il loro prodotto vale " + prodotto);
  		System.out.println("e la loro divisione " + divisione);
  		/*x vale 125.0, y vale 85.3
  		 * il loro prodotto vale 10662.5
  		 * e la loro divisione 1.4654161781946073
  		 * */

	}

}
