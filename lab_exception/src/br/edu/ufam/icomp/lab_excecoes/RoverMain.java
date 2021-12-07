package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
	public static void main(String[] args) {
		
	
	Caminho caminho = new Caminho(4);
	
	
		try {
		
			
			Coordenada c1 = new Coordenada(30, 30, 10);
		    Coordenada c2 = new Coordenada(35, 45, 20);
		    Coordenada c3 = new Coordenada(40, 30, 30);
		    Coordenada c4 = new Coordenada(45, 35, 40);
			caminho.addCoordenada(c1);
			caminho.addCoordenada(c2);
			caminho.addCoordenada(c3);
			caminho.addCoordenada(c4);
			System.out.println(caminho);

		
		
		}catch(Exception exc) {
			System.out.println(exc.getMessage());

			caminho.reset();
		}
	
	}
}

