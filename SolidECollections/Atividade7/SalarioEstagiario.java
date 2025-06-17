package Atividade7;

public class SalarioEstagiario implements Salario{
    @Override
    public double calcular(double valorBase) {
        return (valorBase - 0.2 * valorBase);
    }
}
