package Atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while(opcao!=4){
            System.out.println("Escolha a forma: 1-Círculo, 2-Quadrado, 3-Retângulo, 4-Sair");
            opcao = scanner.nextInt();           
        
            switch (opcao) {
                case 1:
                    FabricaDeFormas.criarForma("circulo").desenhar(scanner);
                    break;
                case 2:
                    FabricaDeFormas.criarForma("quadrado").desenhar(scanner);
                    break;
                case 3:
                    FabricaDeFormas.criarForma("retangulo").desenhar(scanner);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    System.exit(0);
            }

        }
    }
}
