package Construtores;

public class Instrumento {

	private String nome;
	private String tipo = "Cordas";
	
	
	
	public Instrumento() {
		nome = "";
	}
	
	
	public Instrumento(String n, String t) {
		nome = n;
		tipo = t;
			
	}
	public Instrumento(boolean f) {
		this();
		tipo = "false";
			
	}

	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
