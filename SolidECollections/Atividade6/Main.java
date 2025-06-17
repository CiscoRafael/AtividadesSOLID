package Atividade6;

import java.util.List;

public class Main {
    public static void main(String args[]){
        Empresa empresa = new Empresa();

        Funcionario f1 = new Funcionario("Francisco", "TI", 900);
        Funcionario f2 = new Funcionario("Michelle", "Financeiro", 10000);
        Funcionario f3 = new Funcionario("Rafael", "RH", 2000);
        Funcionario f4 = new Funcionario("Murilo", "Marketing", 800);
        Funcionario f5 = new Funcionario("Maycon", "TI", 7000);

        empresa.addFuncionario(f1);
        empresa.addFuncionario(f2);
        empresa.addFuncionario(f3);
        empresa.addFuncionario(f4);
        empresa.addFuncionario(f5);


        List<Funcionario> funcionariosRicos = empresa.filtrFuncionariosPorSalario();

        for (Funcionario funcionario : funcionariosRicos) {
            System.out.println(funcionario);
        }

        System.out.println("Média salarial de " + empresa.calcularMediaSalarial());

        empresa.imprimirFuncionariosOrdemAlfabetica();
        empresa.imprimirTotalFuncionariosSetor();
        
    }
}
