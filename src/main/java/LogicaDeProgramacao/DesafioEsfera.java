package LogicaDeProgramacao;

import java.io.IOException;
import java.util.Scanner;

public class DesafioEsfera {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        double raio = entrada.nextDouble();
        double pi = 3.14159;

        double resultado = (4.0 / 3) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", resultado);

        entrada.close();

    }
}
