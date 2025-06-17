package Atividade7;

public class SalarioCLT implements Salario{
    @Override
    public double calcular(double valorBase) {
        return (valorBase - 0.1 * valorBase);
    }
}
