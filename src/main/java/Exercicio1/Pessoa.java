package Exercicio1;

public class Pessoa {
    private String nome;
    private String sintoma;
    

    // Construtor
    public Pessoa(String nome, String sintoma) {
        this.nome = nome;
        this.sintoma = sintoma;
    }

    // Getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public String getSintoma() {
        return sintoma;
    }

   

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sintoma=" + sintoma;
	}
}


//toString ele vai usar na prova

