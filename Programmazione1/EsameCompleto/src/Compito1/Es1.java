package Compito1;



/* 1. Riceve due stringhe di caratteri da linea di comando (nel parametro String[] 
 * args) e le copia nelle stringhe espressione (la prima) e valori (la seconda)
 * 2. la prima stringa è un'espressione tipo “A+2-B”, di sole lettere A-E o cifre 
 * 0-9, separati da operatori + e -;
 * 3. passa espressione al metodo checkEspr(): se ritorna false uscire dal programma;
 * 4. passa valori al metodo checkValori(): se ritorna false uscire dal programma;
 * 5. crea un array tabella di 5 interi e lo inizializza con valori tutti a 0;
 * 6. in tabella andranno i valori da dare alle lettere A-E dell'espressione, posizionati 
 * negli elementi di tabella da [0] a [4];
 * 7. esegue l'invocazione estraiValori(valori,tabella);
 * 8. esegue l'invocazione sostituisci(espressione,tabella) e memorizza il risultato nella 
 * stringa daCalc;
 * 9. Stampa a video il risultato dell'invocazione del metodo calcola(daCalc).
 **************************************/

public class Es1 {
    
	//Eseguo questo programma con:
	// java Programma A+2-B A:2B:9
	// con risultato: -5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String espressione = args[0];
	    String valori = args[1];

	    if (Metodi.checkEspr(espressione) == false)
	      System.exit(1);

	    if (Metodi.checkValori(valori) == false)
	      System.exit(2);

	    int[] tabella = {0,0,0,0,0};

	    Metodi.estraiValori(valori, tabella);

	    String daCalc = Metodi.sostituisci(espressione, tabella);

	    System.out.println( Metodi.calcola(daCalc) );
	}

}
