package br.edu.ufam.icomp.lab_excecoes;

public class RoverException extends Exception{
	public RoverException() {
		super();
	}
	
	public RoverException(String exception) {
		super(exception);
	}
	
	public String getMessage() {
		return  "Exce��o geral do rover";
	}
}
