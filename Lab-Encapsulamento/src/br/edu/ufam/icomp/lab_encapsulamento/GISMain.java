package br.edu.ufam.icomp.lab_encapsulamento;



public class GISMain {

	public static void main(String[] args) {

	    Localizavel[] vetorLocalizaveis	 = new Localizavel[6];

	  
	    CarroLuxuoso cel1 = new CarroLuxuoso("AMMAUFAM");
	    CarroLuxuoso cel2 = new CarroLuxuoso("AMMAUFAM");
	    CarroLuxuoso cel3 = new CarroLuxuoso("AMMAUFAM");
	    
	    Celular car1 = new Celular(21, 80, 81216666);
	    Celular car2 = new Celular(92, 90, 81216666);
	    Celular car3 = new Celular(92, 70, 81216666);
	    
	    
	    vetorLocalizaveis[0] = car1;
	    vetorLocalizaveis[1] = car2;
	    vetorLocalizaveis[2] = car3;
	    vetorLocalizaveis[3] = cel1;
	    vetorLocalizaveis[4] = cel2;
	    vetorLocalizaveis[5] = cel3;

	    for (int i = 0; i < 6; i++) {
	      System.out.println(vetorLocalizaveis[i].getPosicao());
	    }
		
	}

}
