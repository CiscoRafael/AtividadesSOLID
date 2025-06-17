package Atividade7;

public class FolhaPagamento {
    public void calcularSalario(Salario calculadora, double valorBase) {
        double salario = calculadora.calcular(valorBase);
        System.out.println("Salário calculado: " + salario);
    }
}
