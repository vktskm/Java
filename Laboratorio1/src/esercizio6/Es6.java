package esercizio6;

/*
 * Scrivere un programma Java che esegua le seguenti operazioni:
 * • inizializzi tre variabili intere x, y e h;
 * • calcoli l’area del trapezio di basi x e y e altezza h;
 * • stampi a video le misure delle basi e dell’altezza e l’area del trapezio, in modo che
 * l’output abbia la forma seguente:
 * > Base1 = (valore di x) Base2 = (valore di y) Altezza = (valore di h)
 * > Area = (area calcolata)
 * */

public class Es6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 4;
		int y= 5;
		int h = 3;
		double area = ((x + y)*h)/2.0;
		System.out.println("> Base1 = " + x + " Base2 = " + y + " Altezza = " + h);
		System.out.println("> Area = " + area);
	}
		
}


