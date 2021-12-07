package br.edu.ufam.icomp.lab_excecoes;

public class DistanciaEntrePontosExcedidaException  extends RoverCaminhoException{

	public DistanciaEntrePontosExcedidaException() {
		super();
	}
	
	public DistanciaEntrePontosExcedidaException(String exception) {
		super(exception);
	}
	
	public String getMessage() {
		return "Distância máxima entre duas coordenadas vizinhas excedida";
	}
	 
}
