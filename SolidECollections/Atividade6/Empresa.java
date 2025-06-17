package Atividade6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Empresa {
    List<Funcionario> funcionarios = new ArrayList<Funcionario>();


    public void addFuncionario(Funcionario f){
        funcionarios.add(f);
    }

    public void removerFuncionario(Funcionario e){
        funcionarios.remove(e);
    }

    public List<Funcionario> filtrFuncionariosPorSalario(){
        return funcionarios.stream().filter(s -> s.getSalario() > 5000).collect(Collectors.toList());
    }

    public Map<String, List<Funcionario>> agruparPorSetor(){
        return funcionarios.stream().collect(Collectors.groupingBy(f -> f.getDepartamento()));
    }

    public double calcularMediaSalarial(){
        return funcionarios.stream().mapToDouble(f -> f.getSalario()).average().orElse(0);
    }

    public void imprimirFuncionariosOrdemAlfabetica(){
        List<Funcionario> funcionariosAaZ = funcionarios.stream().sorted((f1, f2 ) -> f1.getNome().compareToIgnoreCase(f2.getNome())).collect(Collectors.toList());
        for(Funcionario f :funcionariosAaZ){
            System.out.println(f.toString());
        }
    }


    public void imprimirTotalFuncionariosSetor() {
        agruparPorSetor().forEach((setor, lista) ->
            System.out.println("Setor: " + setor + " - Total de Funcionários: " + lista.size())
        );
    }

}
