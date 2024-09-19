package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Prescricao {
    private Pessoa pessoa;
    private List<Medicamento> medicamentos;

    // Construtor
    public Prescricao(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.medicamentos = new ArrayList<>();
    }

    // Método para prescrever um medicamento
    public boolean prescrever(Medicamento medicamento) {
        // Verifica se o medicamento é indicado para o sintoma da pessoa
        if (!medicamento.getIndicacoes().contains(pessoa.getSintoma())) {
            System.out.println("O medicamento " + medicamento.getNome() + " não é indicado para o sintoma " + pessoa.getSintoma());
            return false;
        }

        // Verifica se há contraindicações
        for (String condicao : pessoa.getCondicoesSaude()) {
            if (medicamento.getContraindicacoes().contains(condicao)) {
                System.out.println("O medicamento " + medicamento.getNome() + " é contraindicado para a condição " + condicao);
                return false;
            }
        }

        // Se passar pelas verificações, o medicamento é prescrito
        medicamentos.add(medicamento);
        return true;
    }

    // Método para listar os medicamentos prescritos
    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}