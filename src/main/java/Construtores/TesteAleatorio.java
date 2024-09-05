package Construtores;

public class TesteAleatorio {

	public static void main(String[] args) {
		Aleatorio a1 = new Aleatorio(45);
		Aleatorio a2 = new Aleatorio();
		Aleatorio a3 = new Aleatorio();
		System.out.println(a2.numero);
		System.out.println(a1.numero);
		System.out.println(a3.numero);
	}

}
