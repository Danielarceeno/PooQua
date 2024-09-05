package Construtores;

import java.util.Random;

public class Aleatorio {

	int numero;

	// construtor sempre é public e tem o mesmo nome da classe
	public Aleatorio(int maximo) {
		numero = new Random().nextInt(maximo);
	}
	
	public Aleatorio() {
		this(20); //this chama outro construtor.
	}
	
	
}
