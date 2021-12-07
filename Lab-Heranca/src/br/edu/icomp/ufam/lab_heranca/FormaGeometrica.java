package br.edu.icomp.ufam.lab_heranca;

public abstract class FormaGeometrica {
	public int posX;
	public int posY;
	
	
	public FormaGeometrica(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
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
	
	public abstract double getArea();
	public abstract double getPerimetro();
	
	public String getPosString() {
		return "posição (" + this.getPosX() + ", " + this.getPosY() + ")";
	}
	
	
	
}
