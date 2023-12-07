package esercizio7;

/*
 * Scrivere un programma Java che risolva le seguenti espressioni e ne stampi il risultato:
 * (a)  (13 + 9 + 6 − 7) * 2
 * (b)  [(2 + 3) * 5] + [(2/3 + 5) * 4] + [3 * (7 + 5 − 13)]
 * (c)  [(3.4 + 5 − 6.3) * 4.3 + (3.5 ∗ (−4))] * 6
 * (d)  (x + y) * (x − y)
 * (e)  x^2 + y^2
 *       (x + y) * (x − y)
 * (f)  ------------------
 *         (2x + y)^2
 * Dove necessario, inserire al posto delle variabili dei valori a piacere. Scegliere un tipo 
 * di dato adeguato per il risultato.
 * */
public class Es7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(a)  (13 + 9 + 6 − 7) * 2
		int exprA = (13 + 9 + 6 - 7)*2;//42
		System.out.println("Il risultato dell'espressione A e' " + exprA);
		/* Nota: l'espressione seguente valuta 2/3 come 0 (essendo divisione tra
		 * interi). Se avessimo voluto cambiare il comportamento avremmo dovuto
		 * forzare almeno uno dei valori ad essere float, scrivendo ad esempio
		 * 2.0/3. Ovviamente il risultato dell'esepressione in quel caso andrebbe
		 * salvato in un float od un double.
		 * (b)  [(2 + 3) * 5] + [(2/3 + 5) * 4] + [3 * (7 + 5 − 13)]
		 * (b)  [25]+ [(0+5)*4] + [-3] = 42
		 */
		int exprB = ((2 + 3)*5) + ((2/3 + 5)*4) + (3*(7 + 5 - 13)); //42
		System.out.println("Il risultato dell'espressione B e' " + exprB);
		// [(3.4 + 5 − 6.3) * 4.3 + (3.5 *(−4))] * 6
		// [(2.1)*4.3 +(-14)]*6
		double exprC = ((3.4 + 5 - 6.3)*4.3 + (3.5 *(-4)))*6;//-29.819999999999993
		System.out.println("Il risultato dell'espressione C e' " + exprC);
		/*
		 * Ora dichiariamo tre variabili x,y  da utilizzare per le altre
		 * espressioni.
		 */
		double x = 2.3;
		double y = 3.4;
		//(d)  (x + y) * (x − y)
		// (5.7) * (-1.1)
		double exprD = (x + y)*(x - y);//-6,27
		System.out.println("Il risultato dell'espressione D e' " + exprD);
		// (e)  x^2 + y^2
		// (5,29) + (11,56)
		double exprE = x*x + y*y; //16.849999999999998
		System.out.println("Il risultato dell'espressione E e' " + exprE);
	    /*      (x + y) * (x − y)
	     * (f)  ------------------
	     *         (2x + y)^2
	     *  (5.7) * (-1.1)
	     *  --------------
	     *      (8)^2
	     */  
		double exprF = (x+y)*(x-y)/((2*x + y)*(2*x + y));
		System.out.println("Il risultato dell'espressione F e' " + exprF);

	}

}
