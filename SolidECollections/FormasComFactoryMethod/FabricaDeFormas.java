package FormasComFactoryMethod;

public class FabricaDeFormas{
    public static Forma criarForma(String tipo){
        if(tipo.equals("quadrado")) return new Quadrado();
        else if(tipo.equals("retangulo")) return new Retangulo();
        else if(tipo.equals("circulo")) return new Circulo();
        else throw new IllegalArgumentException("Tipo desconhecido");
    }
}