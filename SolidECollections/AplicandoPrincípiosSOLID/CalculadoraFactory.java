package AplicandoPrincípiosSOLID;

public class CalculadoraFactory {
    public static CalculadoraSalario getCalculadora(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo não pode ser nulo");
        }
        switch (tipo.trim().toUpperCase()) {
            case "CLT": return new SalarioCLT();
            case "PJ": return new SalarioPJ();
            case "ESTAGIARIO": return new SalarioEstagiario();
            case "FREELANCER": return new SalarioFreeLancer();
            // outros casos
            default: throw new IllegalArgumentException("Tipo desconhecido");
        }
    }

}