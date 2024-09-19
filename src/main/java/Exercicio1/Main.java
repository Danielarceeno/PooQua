package Exercicio1;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando listas de indicações e contraindicações
        List<String> indicacoesParacetamol = Arrays.asList("Dor de cabeça", "Febre");
        List<String> contraIndicacoesParacetamol = Arrays.asList("Problemas hepáticos");

        List<String> indicacoesIbuprofeno = Arrays.asList("Dor de cabeça", "Dor muscular");
        List<String> contraIndicacoesIbuprofeno = Arrays.asList("Úlcera gástrica");

        // Criando alguns medicamentos
        Medicamento paracetamol = new Medicamento(
            "Paracetamol", "Oral",
            indicacoesParacetamol,
            contraIndicacoesParacetamol
        );

        Medicamento ibuprofeno = new Medicamento(
            "Ibuprofeno", "Oral",
            indicacoesIbuprofeno,
            contraIndicacoesIbuprofeno
        );

        // Criando uma pessoa
        List<String> condicoesSaudeJoao = Arrays.asList("Úlcera gástrica");
        Pessoa joao = new Pessoa(
            "João", "Dor de cabeça",
            condicoesSaudeJoao
        );

        // Criando a prescrição para João
        Prescricao prescricaoJoao = new Prescricao(joao);

        // Tentando prescrever os medicamentos
        prescricaoJoao.prescrever(paracetamol);  // Deve passar
        prescricaoJoao.prescrever(ibuprofeno);  // Deve falhar devido à contraindicação

        // Listando os medicamentos prescritos
        System.out.println("Medicamentos prescritos para " + joao.getNome() + ":");
        for (Medicamento med : prescricaoJoao.getMedicamentos()) {
            System.out.println("- " + med.getNome());
        }
    }
}