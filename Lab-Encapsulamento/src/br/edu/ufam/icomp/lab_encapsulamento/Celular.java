package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class Celular implements Localizavel{
	private int codPais;
	private int codArea;
	private int numero;

	public Celular(int codPais, int codArea, int numero) {
		this.setCodArea(codArea);
		this.setCodPais(codPais);
		this.setNumero(numero);
	}

	public int getCodPais() {
		return codPais;
	}

	public boolean isValid(int value, int ini, int fim) {
		return value >= ini && value <= fim;
	}
	
	
	public final void setCodPais(int codPais) {
		
		this.codPais = this.isValid(codPais, 1, 1999) ? codPais:-1;
	}

	public int getCodArea() {
		return codArea;
	}

	public final void setCodArea(int codArea) {
		this.codArea = this.isValid(codArea, 10, 99) ? codArea : -1;

	}

	public int getNumero() {
		return numero;
	}

	public final void setNumero(int numero) {
		this.numero = this.isValid(numero, 10000000 , 999999999) ? numero : -1;

	}
	
	public Posicao getPosicao() {
		Random r = new Random();

		Double minLatManaus = -3.160000;
		Double maxLatManaus = -2.960000;
		
		Double minLonManaus = -60.120000;
		Double maxLonManaus = -59.820000;

		Double minAltManaus = 15.0 ;
		Double maxAltManaus = 100.0;
		
		double lat = minLatManaus + (maxLatManaus - minLatManaus) * r.nextDouble();
	    double lon = minLonManaus + (maxLonManaus - minLonManaus) * r.nextDouble();
	    double alt = minAltManaus + (maxAltManaus - minAltManaus) * r.nextDouble();

		return new Posicao(lat, lon, alt);
		
	}
	public double getErroLocalizacao() {
		return 50.0;
	}

}
