package Atividade2;

import java.util.Scanner;

public class Circulo implements Forma{
    @Override
    public void desenhar(Scanner scanner) {
        System.out.println("Informe o tamanho do raio");
        int raio = scanner.nextInt();
        for (int y = -raio; y <= raio; y++) {
            for (int x = -raio; x <= raio; x++) {
                double distancia = Math.sqrt(x * x + (y * 2) * (y * 2));
                if (distancia <= raio) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
