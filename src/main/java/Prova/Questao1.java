package Prova;

public class Questao1 {

	public static void main(String[] args) {
		  Instrumento i1 = new Instrumento();
		    Instrumento i2 = new Instrumento();
		    i2.setNome("Guitarra");
		    Instrumento i3 = new Instrumento();
		    i3.cadastra("Bateria", "Percussão");

		    System.out.println(i1.exibir()); // la
		    System.out.println(i2.exibir()); // lb
		    System.out.println(i3.exibir()); // lc

		    Banda b1 = new Banda();
		    b1.cadastra("A", "Rock", 6);
		    Banda b2 = new Banda();
		    b2.cadastra("B", "POP", 4);
		    b1.adicionaInstrumento(i2);
		    b2.adicionaInstrumento(i3);

		    System.out.println(b1.exibir()); // ld
		    System.out.println(b2.exibir()); // le

		    Instrumento ix = new Instrumento();
		    ix.cadastra("Gaita", "Percussão");
		    b2.getInstrumentos().add(ix);
		    Instrumento iy = new Instrumento();
		    iy.setNome("Violino");
		    b1.getInstrumentos().add(iy);

		    System.out.println(b1.exibir()); // lf
		    System.out.println(b2.exibir()); // lg
		    System.out.println(b1.soma());   // lh
		    System.out.println(b2.soma());   // li

	}

}