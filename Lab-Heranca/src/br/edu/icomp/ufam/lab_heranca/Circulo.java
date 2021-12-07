package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica{
	public double raio;

	
	public Circulo(int posX, int posY, double raio) {
		super(posX, posY);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRaio(), 2);
	}

	public double getPerimetro() {
		return 2 * Math.PI * this.getRaio();
	}
	
	
	public String toString() {
		String descricao = "Círculo na " + this.getPosString() + " com raio de " + this.getRaio() + "cm ";
		descricao += "(área=" + this.getArea() + "cm2, perímetro=" + this.getPerimetro() + "cm)";
		
		return descricao;
	}
	
}
