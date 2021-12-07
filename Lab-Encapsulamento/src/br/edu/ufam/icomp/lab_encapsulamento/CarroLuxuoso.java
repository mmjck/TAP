package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class CarroLuxuoso extends Carro implements Localizavel {
	public CarroLuxuoso(String placa){
		super(placa);
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
	    return 15.0;
	}	
}
