package LogicaDeProgramacao;

import java.io.IOException;
import java.util.Scanner;

public class DesafioConsumo {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        double y = entrada.nextDouble();

        double consumo = x / y;

        System.out.printf("%.3f km/l\n", consumo);

        entrada.close();

    }
}
