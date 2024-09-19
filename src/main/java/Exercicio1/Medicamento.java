package Exercicio1;
import java.util.List;

public class Medicamento {
    private String nome;
    private List<String> indicacoes;
    private List<String> contraindicacoes;

    // Construtor
    public Medicamento(String nome, String administracao, List<String> indicacoes, List<String> contraindicacoes) {
        this.nome = nome;
        this.indicacoes = indicacoes;
        this.contraindicacoes = contraindicacoes;
    }
 
    // Getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public List<String> getIndicacoes() {
        return indicacoes;
    }

    public List<String> getContraindicacoes() {
        return contraindicacoes;
    }
}