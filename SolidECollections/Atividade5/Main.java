package Atividade5;

import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String args[]){
        Pessoas pessoas = new Pessoas();
        Pessoa p1 = new Pessoa("Francisco", "Contagem", 19);
        Pessoa p2 = new Pessoa("Max", "São Paulo", 18);
        Pessoa p3 = new Pessoa("João", "Contagem", 10);
        
        pessoas.adicionarPessoa(p3);
        pessoas.adicionarPessoa(p2);
        pessoas.adicionarPessoa(p1);

        pessoas.exibirEmOrdemAlfabetica();

        Map<String, List<Pessoa>> pessoasPorCidade = pessoas.agruparPorCidade();
        List<Pessoa> pessoasDeContagem = pessoasPorCidade.get("Contagem");

        if (pessoasDeContagem != null) {
            System.out.println("Pessoas de Contagem:");
            for (Pessoa p : pessoasDeContagem) {
                System.out.println(p.getNome() + " - " + p.getIdade() + " anos");
            }
        } else {
            System.out.println("Não há pessoas de Contagem.");
        }

        List<Pessoa> maioresIdade = pessoas.filtrarMaiores18();

        for (Pessoa pessoa : maioresIdade) {
            System.out.println(pessoa);
        }

        System.out.printf("A média de idade é %.2f\n", pessoas.calcularMediaIdade());
    }
}
