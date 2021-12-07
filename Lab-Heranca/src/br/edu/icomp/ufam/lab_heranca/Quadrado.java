package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo {

	public Quadrado(int posX, int posY, double lado) {
		super(posX, posY, lado, lado);
	}
	
	
	public String toString() {
		String descricao = "Quadrado na " + this.getPosString() + " com lado de " + this.getAltura() + "cm ";
		descricao += "(�rea=" + this.getArea() + "cm2, per�metro=" + this.getPerimetro() + "cm)";
		
		return descricao;
	}
	

}
