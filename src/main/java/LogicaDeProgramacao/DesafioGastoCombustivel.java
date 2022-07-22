package LogicaDeProgramacao;

import java.io.IOException;
import java.util.Scanner;

public class DesafioGastoCombustivel {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        int horas = entrada.nextInt();
        int km = entrada.nextInt();

        double distancia = horas * km;
        double consumo = distancia / 12;

        System.out.printf("%.3f\n", consumo);

        entrada.close();
    }

}

