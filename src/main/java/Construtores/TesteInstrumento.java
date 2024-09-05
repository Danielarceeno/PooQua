package Construtores;

public class TesteInstrumento {

	public static void main(String[] args) {
		Instrumento i = new Instrumento();
		Instrumento i2 = new Instrumento("abc", "abc");
		Instrumento i3 = new Instrumento(true);
		System.out.println(i.getNome() + " - " + i.getTipo());
		System.out.println(i2.getNome() + " - " + i2.getTipo());
		System.out.println(i3.getNome() + " - " + i3.getTipo());
		
		
	}
}
