package FormasComFactoryMethod;

import java.util.Scanner;

public class Retangulo implements Forma {
    @Override
    public void desenhar(Scanner scanner) {
        System.out.println("Informe a base e altura");
            int base = scanner.nextInt();
            int altura = scanner.nextInt();
            for (int i = 0; i < base; i++) {
                for (int j = 0; j < altura; j++) {
                    System.out.print("* ");
                }
                System.out.println();
        }
    }
}
