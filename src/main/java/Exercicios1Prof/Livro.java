package Exercicios1Prof;

public class Livro {

	private String titulo;
	private String autor;
	private int paginas;
	private double preco;

	public Livro() {

	}

	public Livro(String titulo, String autor, int paginas, double preco) {

		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.preco = preco;
	}

	public Livro(String titulo) {
		this.titulo = titulo;
		this.autor = "Desconhecido";
		this.paginas = 100;
		this.preco = 29.90;
	}
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = 200;
		this.preco = 49.90;
	}
	
	public void mostrarInfo() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas: " + this.paginas);
        System.out.println("Preço: " + this.preco);
    }

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
