package com.example.gestione_dispositivi.security.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Tablet")
public class Tablet extends Dispositivo{
     
	public Tablet(){
		this.setStato(Stato.DISPONIBILE);
		// TODO Auto-generated constructor stub
	}
}
