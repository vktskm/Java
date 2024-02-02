package esercizio2;

public class Metodi {
   
	   public static int sommaDueInteri (int a, int b) {
	      return a+b;
	   }

	   public static int divisioneIntera (int a, int b) {
	      return a/b;
	   }

	   public static int restoDivisioneIntera (int a, int b) {
	      return a%b;
	   }

	   public static double mediaTraDueDouble (double a, double b) {
	      return (a+b)/2;
	   }

	   public static int valoreAssolutoIntero (int a) {
	      if (a < 0) a*= -1;
	      return a;
	   }

	   public static int lunghezzaStringaIntero (int a) {
	      String stringa = "" + a;
	      return stringa.length();
	   }
}
