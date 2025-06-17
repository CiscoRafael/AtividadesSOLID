package AplicandoPrincípiosSOLID;

public class SalarioFreeLancer implements CalculadoraSalario {
    @Override
    public double calcular(double valorBase) {
        return (valorBase + 100);
    }
}
