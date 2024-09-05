package Prova;

public class Questao3 {

		 public static void main(String[] args) {
		        Instrumento i1 = new Instrumento();
		        i1.cadastra("Gaita", "Percussão");
		        i1.afinado = 'S';

		        Instrumento i2 = new Instrumento();
		        i2.setNome("Viola");
		        i2.afinado = 'S';

		        Instrumento i3 = new Instrumento();
		        i3.cadastra("Saxofone", "Sopro");
		        i3.afinado = 'N';

		        Banda b1 = new Banda();
		        b1.cadastra("B1", "Sertanejo", 2);
		        b1.adicionaInstrumento(i1);
		        b1.adicionaInstrumento(i2);
		        b1.adicionaInstrumento(i3);

		        // Primeira iteração
		        for (Instrumento i : b1.getInstrumentos()) {
		            System.out.println(i.afinado); // Serão escritas 3 linhas: 'S', 'S', 'N'
		        }

		        // Altera a afinação de todos os instrumentos
		        for (Instrumento i : b1.getInstrumentos()) {
		            i.afinado = 'S';
		        }

		        // Segunda iteração
		        for (Instrumento i : b1.getInstrumentos()) {
		            System.out.println(i.afinado); // Serão escritas 3 linhas: 'S', 'S', 'S'
		        }
		    }
		
	}
