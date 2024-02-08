package Compito2;


public class Es2 {
   

	public static void main ( String[] args) {
		
	String espr = args[0];
	String val = args [1];
	
	if( Metodi.checkEspr( espr) == false) {
		System.out.println("Errore Espressione");
		System.exit(1);
	}
		
	
	if( Metodi.checkValori( val) == false) {
		System.out.println("Errore Valori");
		System.exit(2);
	}
	
	
	int[] tabella = {0,0,0,0,0};
	//esegue l'invocazione estraiValori(valori,tabella);
    Metodi.estraiValori(val, tabella);
		
    String daCalc = Metodi.sostituisci(espr, tabella);

    System.out.println("Stringa da calcolare vale : " + daCalc);
    System.out.println( Metodi.calcola(daCalc) );
    
    
	}//end main

}
