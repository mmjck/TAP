package br.edu.ufam.icomp.lab_excecoes;

public class RoverCoordenadaException extends RoverException {
	public RoverCoordenadaException() {
		super();
	}
	
	public RoverCoordenadaException(String exception) {
		super(exception);
	}
	
	public String getMessage() {
		return "Exce��o geral de coordenada do rover";
	}
}
