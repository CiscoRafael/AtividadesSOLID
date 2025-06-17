package AplicandoPrincípiosSOLID;

public class SalarioCLT implements CalculadoraSalario{
    @Override
    public double calcular(double valorBase) {
        return (valorBase - 0.1 * valorBase);
    }
}
