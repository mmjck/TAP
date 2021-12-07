package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(1, 1, 2);
		Retangulo retangulo = new Retangulo(1,1, 1, 2);

		Quadrado quadrado = new Quadrado(1,1, 1);

		
		System.out.println(circulo.toString());
		System.out.println(retangulo.toString());
		System.out.println(quadrado.toString());

	}

}
