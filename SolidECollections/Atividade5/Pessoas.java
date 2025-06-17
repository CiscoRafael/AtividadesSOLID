package Atividade5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pessoas {
    List<Pessoa> pessoas = new ArrayList<>();


    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa){
        pessoas.remove(pessoa);
    }

    public List<Pessoa> filtrarMaiores18(){
        return pessoas.stream().filter(p -> p.getIdade() >= 18).collect(Collectors.toList()); 
    }

    public Map<String, List<Pessoa>> agruparPorCidade() {
        return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCidade));
    }

    public double calcularMediaIdade() {
        return pessoas.stream().mapToInt(Pessoa::getIdade).average().orElse(0);
    }

    public void exibirEmOrdemAlfabetica() {
        List<Pessoa> pessoasOrdemAlfabetica = pessoas.stream().sorted((p1, p2 ) -> p1.getNome().compareToIgnoreCase(p2.getNome())).collect(Collectors.toList());
        for (Pessoa p : pessoasOrdemAlfabetica) {
            System.out.println(p.toString());
        }
    }

}
