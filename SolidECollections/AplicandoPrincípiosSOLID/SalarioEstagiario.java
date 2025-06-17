package AplicandoPrincípiosSOLID;

public class SalarioEstagiario implements CalculadoraSalario{
    @Override
    public double calcular(double valorBase) {
        return (valorBase - 0.2 * valorBase);
    }
}
