package AplicandoPrincípiosSOLID;

public class FolhaPagamento {
    public void calcularSalario(String tipo, double valorBase) {
        CalculadoraSalario calculadora = CalculadoraFactory.getCalculadora(tipo);
        double salario = calculadora.calcular(valorBase);
        System.out.println("Salário " + tipo + ": " + salario);
    }
}
