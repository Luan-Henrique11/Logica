package LogicaDeProgramacao;

import java.io.IOException;
import java.util.Scanner;

public class DesafioDistanciaDP {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        int tempseg = entrada.nextInt();

        int horas = tempseg / 3600;
        int restoHoras = tempseg % 3600;

        int minutos = restoHoras / 60;
        int RestoMinutos = restoHoras % 60;

        int segundos = RestoMinutos;
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);


        entrada.close();
    }

}
