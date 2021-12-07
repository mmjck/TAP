package br.edu.ufam.icomp.lab_excecoes;

public class RoverException extends Exception{
	public RoverException() {
		super();
	}
	
	public RoverException(String exception) {
		super(exception);
	}
	
	public String getMessage() {
		return  "Exceção geral do rover";
	}
}
