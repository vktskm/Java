package esercizio4;

import java.util.Scanner;

/* Esercizio 4
 * Scrivere un programma Java che permetta all’utente di convertire 
 * temperature da Fahrenheit a Celsius o viceversa, fino a quando 
 * decide di uscire dal programma 
 * (gestire quindi un menù a 3 scelte: 
 * Fahrenheit → Celsius, 
 * Celsius → Fahrenheit, 
 * Uscita). 
 * Il programma dovrà contenere i seguenti metodi:
 * ➢ menu(): stampa a video il menù per l’utente, e restituisce al 
 * chiamante la scelta effettuata;
 * ➢ convertiFinC(): prende come argomento una temperatura espressa 
 * in gradi Fahrenheit, e restituisce al chiamante la temperatura 
 * corrispondente in gradi Celsius;
 * ➢ convertiCinF(): prende come argomento una temperatura espressa 
 * in gradi Celsius, e restituisce al chiamante la temperatura cor- 
 * rispondente in gradi Fahrenheit.
 * Si ricorda che le formule di conversione da Fahrenheit a Celsius, 
 * e viceversa, sono le seguenti:
 * ➢ C = (F – 32) / 1,8
 * ➢ F = 1,8*C + 32
 ****/
public class Es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner tastiera = new Scanner(System.in);
	      int comando;

	      System.out.println("Programma di conversione da Fahrenheit a Celsius, e viceversa.\n");
	      boolean finito = false;
	      while (!finito) {
	         comando = menu();  
	         switch (comando) {
	            case 1: System.out.print("Inserisci i gradi Fahrenheit: ");
	                    double fahrenheit = tastiera.nextDouble();
	                    System.out.println("In Celsius, sono " + convertiFinC(fahrenheit) + " gradi.\n");
	                    break;
	            case 2: System.out.print("Inserisci i gradi Celsius: ");
	                    double celsius = tastiera.nextDouble();
	                    System.out.println("In Fahrenheit, sono " + convertiCinF(celsius) + " gradi.\n");
	                    break;
	            case 3: finito = true;
	         }         
	      }
	   }

	   public static int menu() {
	      Scanner tastiera = new Scanner(System.in);
	      int comando;
	      
	      do {
	         System.out.println("1) Conversione Fahrenheit -> Celsius");
	         System.out.println("2) Conversione Celsius -> Fahrenheit");
	         System.out.println("3) Esci dal programma");
	         System.out.print("\nInserisci un numero [1-3]: ");
	         comando = tastiera.nextInt();
	         if (comando < 1 || comando > 3)
	            System.out.println("Il numero inserito non e' valido!\n");
	      } while (comando < 1 || comando > 3);
	      return comando;
	   }   
	   
	   public static double convertiFinC (double fahrenheit) {
	      return (fahrenheit - 32) / 1.8;
	   }
	   
	   public static double convertiCinF (double celsius) {
	      return 1.8 * celsius + 32;
       }

}
