package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
	private int posX;
	private int posY;
	private int digito;
	
	
	public Coordenada(int posX, int posY, int digito) 
				throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException{ 
		
		if(posX < 0 || posY < 0) {
			throw new CoordenadaNegativaException();
			
		}
		
		if(posX > 30000 || posY > 30000) {
			throw new CoordenadaForaDosLimitesException();
			
		}
		
		if ((posX + posY) % 10 != digito && digito >= 0 && digito < 10 ) {
			throw new DigitoInvalidoException();
			
		}
			
		
		this.posX = posX;
		this.posY = posY;
		this.digito = digito;
	}
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getDigito() {
		return digito;
	}
	public void setDigito(int digito) {
		this.digito = digito;
	}
	
	public double distancia(Coordenada coordenada) {
		return Math.sqrt(Math.pow(this.getPosX() - coordenada.getPosX(), 2) + Math.pow(this.getPosY() - coordenada.getPosY(), 2));
	}
	
	
	public String toString() {
		return posX + ", " + posY;
	}
	
	
	
}
