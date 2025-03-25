import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
       
        imprimirSelecionados();
    }
static  void imprimirSelecionados(){
    String [] candiatos ={"Daniel", "Raquel", "Rafael", "Karinna", "Simone"};
    System.out.println("Imprimindo a lista de caditados informando o indice do elemento");
    
    
    
        for(int indice =0; indice < candiatos.length; indice++){
            System.out.println("o canditado selecionado  é "+candiatos[indice] );

        }
}
    static void selecaoCandidatos() {
        String[] candidatos = {"Daniel1", "Daniel2", "Daniel3", "Daniel", "Raquel", "Rafael", "Karinna", "Simone"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou esse valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
                analisarCandidato(salarioPretendido); // Chama a função para analisar o candidato
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 22000);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contraproposta.");
        } else {
            System.out.println("Aguardando resultado dos outros candidatos.");
        }
    }
}