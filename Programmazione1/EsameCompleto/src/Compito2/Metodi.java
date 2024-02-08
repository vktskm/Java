package Compito2;


/*  - boolean checkEspr(), che riceve una stringa e ritorna true solo se la stringa 
 * è una sequenza che alterna correttamente lettera A-E o cifra 0-9 ed un operatore 
 * + o - (“A-C+2”->true, “AB-2”->false);
 * - boolean checkValori(), che riceve una stringa e ritorna true solo se la stringa 
 * è una sequenza che alterna correttamente lettera A-E e cifra 0-9 separati da : 
 * (“A:2B:9”->true, “A1B-2”->false);
 * - void estraiValori(), che riceve una stringa come primo argomento e un array di 
 * 5 interi come secondo, e estrae dalla stringa i valori da dare alle lettere e li 
 * mette nelle corrette caselle dell'array: “A:2E:1”->2/0/0/0/1;
 * - String sostituisci(), che riceve una stringa come primo argomento e un array di 
 * 5 interi come secondo, e restituisce una stringa ottenuta dalla prima sostituendo 
 * le lettere con I giusti valori presi dall'array di interi: “A+B” con array visto 
 * sopra → “2+0”;
 * - int calcola(), che riceve una stringa prodotta da sostituisci() e restituisce 
 * l'intero ottenuto calcolando il valore di tale espressione: “2+0”->2.
 ************************************/



public class Metodi {
	
	public static boolean checkEspr( String espr) {
		
		if( espr.length() != 5)
			return false;
		
		for(int i=0; i < espr.length(); i = i+2) {
		      
		    switch (espr.charAt(i)){//o qualche if(...)
	        case 'A':  case 'B':  case 'C':  case 'D':  case 'E':
	        case '0':  case '1':  case '2':  case '3':  case '4':
	        case '5':  case '6':  case '7':  case '8':  case '9':
	          break; //(proseguo, lascio switch)
	        default:// carattere sbagliato
	          return false;
	      }
		    
		}
		
		for( int i=1; i < espr.length(); i = i+2) {
		   
			//carattere + oppure - :
		      switch (espr.charAt(i)){//o qualche if(...)
		        case '+':
		        case '-':// valido
		          break;
		        default:// sbagliato
		          return false;
		      }
		}
		
		
		return true ;
	}
	
	
	public static boolean checkValori( String val) {
		
		if( val.length() != 6)
			return false;
		
		int i=0;
		
		while( i < val.length()) {
		
			 //primo carattere, solamente lettera tra A e E:
		      switch (val.charAt(i)){//o qualche if(...)
		        case 'A':
		        case 'B':
		        case 'C':
		        case 'D':
		        case 'E':
		          break; //(proseguo, lascio switch)
		        default://primo carattere sbagliato
		          return false;
		      }   
		          
		      i += 1;
			  //secondo carattere, ":" :
		      switch (val.charAt(i)){//o qualche if(...)
			        case ':':
			          break;
			        default:// sbagliato
			          return false;
			   }

			   i += 1;
			   //terzo carattere, solamente cifra:
			      switch (val.charAt(i)){//o qualche if(...)
			        case '0':  case '1':  case '2':  case '3':  case '4':
			        case '5':  case '6':  case '7':  case '8':  case '9':
			          break; //(proseguo, lascio switch)
			        default:// carattere sbagliato
			          return false;
			   }

			   i += 1; //proseguo col ciclo, prossimo gruppo
			    

		}//fine while
		      
		return true ;
	}//fine checkValori
     
	//- void estraiValori(), che riceve una stringa come primo argomento e un array di 
	//* 5 interi come secondo, e estrae dalla stringa i valori da dare alle lettere e li 
	//* mette nelle corrette caselle dell'array: “A:2E:1”->2/0/0/0/1;
	
	public static void estraiValori( String val, int [] tab){
		
		int i = 0; //comincero' dal primo carattere e 2 seguenti
	    while (i < val.length()){
	      //lettera A..E in charAt(i), e
	      //cifra in i+2 : (gioco coi char)
	      System.out.print(val.charAt(i)+ " ");
	      System.out.print(val.charAt(i)-'A' + " ");
	      System.out.print(val.charAt(i+2)-'0' + " ");
	      tab[val.charAt(i)-'A'] = (val.charAt(i+2) - '0');
          System.out.println();
	      i += 3; //proseguo col ciclo, prossimo gruppo
	    }    
	}

	
	
	/*String sostituisci(), che riceve una stringa come primo argomento e un array di 
	 * 5 interi come secondo, e restituisce una stringa ottenuta dalla prima sostituendo 
	 * le lettere con I giusti valori presi dall'array di interi: “A+B” con array visto 
	 * sopra → “2+0”;
	 */
	 public static String sostituisci(String espr, int[] tab){
		    String nuova = "";

		    for (int i = 0; i < espr.length(); i++)
		      switch (espr.charAt(i)){//o qualche if(...)
		        case 'A':
		        case 'B':
		        case 'C':
		        case 'D':
		        case 'E'://sostituisco con valori in array
		          nuova = nuova + tab[espr.charAt(i)-'A'];
		          break; //(proseguo, lascio switch)
		        default://copio qualunque altro carattere
		          nuova = nuova + espr.charAt(i);
		      }

		    return nuova;
		  }

	 /* - int calcola(), che riceve una stringa prodotta da sostituisci() e restituisce 
		 * l'intero ottenuto calcolando il valore di tale espressione: “2+0”->2.*/
	 
		  public static int calcola(String esprNum){
		    //la stringa e' corretta, e
		    // comincia certamente con una cifra,
		    int ris = (esprNum.charAt(0) - '0');
		    //poi aggiungo o sottraggo i seguenti + o - e cifra
		    for (int i = 1; i < esprNum.length(); i += 2) {
		      //operatore + o - in charAt(i), e
		      //cifra in i+1 : (gioco coi char)
		      if (esprNum.charAt(i) == '+')
		        ris += (esprNum.charAt(i+1) - '0');
		      else
		        ris -= (esprNum.charAt(i+1) - '0');
		    }

		    return ris;
		  }
	
}
	
