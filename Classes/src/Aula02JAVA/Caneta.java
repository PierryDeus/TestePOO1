package Aula02JAVA;
public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status () {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta: " + this.cor);
		System.out.println("Como est� a carga? " + this.carga + "%");
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Est� tampada? " + this.tampada);
	}
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO, nao posso rabiscar");
		}
		else 
			System.out.println("Estou Rabiscando");
			
		}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
	
}