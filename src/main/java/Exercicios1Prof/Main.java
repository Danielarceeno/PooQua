package Exercicios1Prof;

public class Main {
	public static void main(String[] args) {
		Livro livro1 = new Livro("Java para Iniciantes", "João Silva", 500, 89.90);
        livro1.mostrarInfo();

        System.out.println();

        // Usando o construtor com apenas o título (demais valores padrões)
       Livro livro2 = new Livro("Python Essencial");
        livro2.mostrarInfo();

        System.out.println();

        // Usando o construtor com título e autor (demais valores padrões)
        Livro livro3 = new Livro("C++ Avançado", "Maria Souza");
        livro3.mostrarInfo();	
	}
}
