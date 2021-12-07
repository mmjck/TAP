package br.edu.ufam.icomp.lab_excecoes;

public class RoverCoordenadaException extends RoverException {
	public RoverCoordenadaException() {
		super();
	}
	
	public RoverCoordenadaException(String exception) {
		super(exception);
	}
	
	public String getMessage() {
		return "Exceção geral de coordenada do rover";
	}
}
