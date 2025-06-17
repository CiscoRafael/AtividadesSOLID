package Atividade7;

public class SalarioFreeLancer implements Salario {
    @Override
    public double calcular(double valorBase) {
        return (valorBase + 100);
    }
}
