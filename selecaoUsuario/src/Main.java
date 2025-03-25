import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        // Chama o método para imprimir a lista de candidatos
        selecaoCandidatos();
        imprimirSelecionados();
        
    }

    // Método para imprimir a lista de candidatos
    static void imprimirSelecionados() {
        // Array de strings com os nomes dos candidatos
        String[] candidatos = {"Daniel", "Raquel", "Rafael", "Karinna", "Simone"};
        // Imprime uma mensagem informando que a lista de candidatos será exibida
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        // Loop for para percorrer o array de candidatos
        for (int indice = 0; indice < candidatos.length; indice++) {
            // Imprime o nome de cada candidato
            System.out.println("o candidato selecionado é " + candidatos[indice]);
        }
    }

    // Método para simular a seleção de candidatos
    static void selecaoCandidatos() {
        // Array de strings com os nomes dos candidatos
        String[] candidatos = {"Daniel1", "Daniel2", "Daniel3", "Daniel", "Raquel", "Rafael", "Karinna", "Simone"};
        // Inicializa o contador de candidatos selecionados
        int candidatosSelecionados = 0;
        // Inicializa o índice do candidato atual
        int candidatoAtual = 0;
        // Define o salário base
        double salarioBase = 2000.0;

        // Loop while para percorrer os candidatos até que 5 sejam selecionados ou todos sejam avaliados
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            // Obtém o nome do candidato atual
            String candidato = candidatos[candidatoAtual];
            // Gera um salário pretendido aleatório para o candidato
            double salarioPretendido = valorPretendido();

            // Imprime o nome do candidato e o salário pretendido
            System.out.println("O candidato " + candidato + " solicitou esse valor de salário: " + salarioPretendido);

            // Verifica se o salário base é maior ou igual ao salário pretendido
            if (salarioBase >= salarioPretendido) {
                // Imprime que o candidato foi selecionado
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                // Incrementa o contador de candidatos selecionados
                candidatosSelecionados++;
                // Chama o método para analisar o candidato
                analisarCandidato(salarioPretendido);
            }
            // Incrementa o índice do candidato atual
            candidatoAtual++;
        }
    }

    // Método para gerar um salário pretendido aleatório
    static double valorPretendido() {
        // Gera um valor aleatório entre 1800 e 22000
        return ThreadLocalRandom.current().nextDouble(1800, 22000);
    }

    // Método para analisar o candidato com base no salário pretendido
    static void analisarCandidato(double salarioPretendido) {
        // Define o salário base
        double salarioBase = 2000.0;

        // Verifica se o salário base é maior que o salário pretendido
        if (salarioBase > salarioPretendido) {
            // Imprime para ligar para o candidato
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            // Imprime para ligar com uma contraproposta
            System.out.println("Ligar para o candidato com contraproposta.");
        } else {
            // Imprime para aguardar o resultado dos outros candidatos
            System.out.println("Aguardando resultado dos outros candidatos.");
        }
    }
}