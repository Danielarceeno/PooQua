package Prova;

public class Instrumento {
	private String nome;
	private String tipo = "Cordas";
	public static char afinado = 'N';

	public void cadastra (String nome, String tipo) {
	this . nome = nome;
	this.tipo = tipo;
	}
	
	public String exibir() {
		return getNome() + "(" + getTipo() + ") ";
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

	public static char getAfinado() {
		return afinado;
	}

	public static void setAfinado(char afinado) {
		Instrumento.afinado = afinado;
	}
	
	
	
}
