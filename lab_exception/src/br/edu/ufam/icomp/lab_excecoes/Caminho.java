package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
	private Coordenada [] caminho;
	private int tamanho;
	
	
	public Caminho (int maxTam) {
		this.caminho = new Coordenada[maxTam];
		this.tamanho = maxTam;

	}
	
	
	public Coordenada getCaminho(int i) {
		return caminho[i];
	}


	public void setCaminho(int i, Coordenada caminho) {
		this.caminho[i] = caminho;
	}


	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	
	public int tamanho() {
		int tam = 0;
		for(int i = 0; i < caminho.length; i++) {
			if(this.getCaminho(i) != null) {
				tam++;
			}
		}
		
		return tam;
	}
	
	
	public void reset() {
		for(int i = 0; i < caminho.length; i++) {
			this.setCaminho(i, null);
		}
	}
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException{
		
		
		int tam = this.tamanho();
		if( tam == this.getTamanho()) {
			throw new TamanhoMaximoExcedidoException();
		}
		
		
		if(tam > 1 && this.getCaminho(tam - 1).distancia(coordenada) > 15) {
			throw new DistanciaEntrePontosExcedidaException();

		}
		
		
		this.setCaminho(tam, coordenada);
		
		
	}
	
	public String toString() {
		String descricao = "Dados do caminho: \n";
		
		descricao +="  - Quantidade de pontos: " + this.tamanho() + "\n";
		descricao +="  - Pontos: \n";
		for (int i = 0; i < tamanho(); i++) {
			descricao += "    -> " + this.getCaminho(i).toString() + "\n";
	      
		}
		
		return descricao;
		
		
	}

}

