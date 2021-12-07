package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {
	public double largura;
	public double altura;
	
	
	public Retangulo(int posX, int posY, double largura, double altura) {
		super(posX, posY);
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return this.getAltura() * this.getLargura();
	}

	public double getPerimetro() {
		return 2 * ( this.getAltura() +  this.getLargura());
	}
	

	public String toString() {
		String descricao = "Retângulo na " + this.getPosString() + " com largura de " + this.getLargura() + "cm ";
		descricao += "e altura de " + this.getAltura() + "cm ";
		descricao += "(área=" + this.getArea() + "cm2, perímetro=" + this.getPerimetro() + "cm)";
		
		return descricao;
	}
	
}
