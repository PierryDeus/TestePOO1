package Aula02JAVA;
public class Aula02Java {
	public static void main(String[] args) {
		System.out.println("-------Caneta 1-------");
		Caneta c1 = new Caneta();
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
	
		//Teste para commit
	}
	
}

