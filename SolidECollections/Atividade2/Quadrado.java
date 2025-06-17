package Atividade2;

import java.util.Scanner;
public class Quadrado implements Forma{
    @Override
    public void desenhar(Scanner scanner){
        System.out.println("Informe o tamanho dos lados");
        int tamanho = scanner.nextInt();
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
