package br.edu.ufam.icomp.lab_excecoes;

public class CoordenadaNegativaException extends RoverCoordenadaException {
	public CoordenadaNegativaException() {
		super();
	}
	
	public CoordenadaNegativaException(String exception) {
		super(exception);
	}
	
	public String getMessage() {
		return "Coordenada com valor negativo";
	}
}
