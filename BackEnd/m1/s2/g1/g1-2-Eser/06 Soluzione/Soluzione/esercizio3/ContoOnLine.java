package it.epicode.exercises.week3.giorno1.esercizio3;

public class ContoOnLine extends ContoCorrente {
	double maxPrelievo;

	ContoOnLine(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	void stampaSaldo() {

		System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
				+ " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
	}

	void preleva(double x) {
		if (x <= maxPrelievo) {
			super.preleva(x);
		}
	}
}
