package br.edu.ufam.icomp.lab_excecoes;

public class RoverCaminhoException extends RoverException  {
	public RoverCaminhoException() {
		super();
	}
	
	public RoverCaminhoException(String exception) {
		super(exception);
	}
	
	public String getMessage() {
		return "Exce��o geral de caminho do rover";
	}
}
