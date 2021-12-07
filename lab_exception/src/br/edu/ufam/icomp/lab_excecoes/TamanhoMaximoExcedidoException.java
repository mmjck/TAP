package br.edu.ufam.icomp.lab_excecoes;

public class TamanhoMaximoExcedidoException extends RoverCaminhoException {
	public TamanhoMaximoExcedidoException() {
		super();
	}
	
	public TamanhoMaximoExcedidoException(String exception) {
		super(exception);
	}
	
	public String getMessage() {
		return "Quantidade máxima de coordenadas excedida";
	}
}
