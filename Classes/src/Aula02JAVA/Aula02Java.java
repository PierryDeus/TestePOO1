package Aula02JAVA;
public class Aula02Java {
	public static void main(String[] args) {
		System.out.println("-------Caneta 1-------");
		Caneta c1 = new Caneta();
		c1.modelo = "Caran d'Ache";
		c1.cor = "Azul";
		c1.ponta = 0.5f;  // chamada para atributos
		c1.carga = 57; 
		c1.tampar();
		c1.status();  // chamada para métodos
		c1.rabiscar();
	
		System.out.println("---------Caneta 2--------");
		Caneta c2 = new Caneta();
		c2.modelo = "Bic";
		c2.cor = "Vermelha";
		c2.carga = 89;
		c2.destampar();
		c2.status();
		c2.rabiscar();
	
		System.out.println("---------Caneta 3--------");
		Caneta c3 = new Caneta();
		c3.modelo = "Rainha das Canetas";
		c3.cor = "Preta";
		c3.destampar();
		c3.status();
		c3.rabiscar();
		
		System.out.println("----------Caneta 4----------");
		Caneta c4 = new Caneta();
		c4.modelo = "Caneta Final dos Testes"; //pegando de volta o Javinha
		c4.cor = "Rosa";
		c4.tampar();
		c4.status();
		c4.rabiscar();	
		
	}
	
}

