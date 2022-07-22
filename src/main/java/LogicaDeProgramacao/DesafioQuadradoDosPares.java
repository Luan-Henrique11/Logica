package LogicaDeProgramacao;

import java.util.Scanner;

public class DesafioQuadradoDosPares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0 ) {
                System.out.println(i + "^" + "2" + " = " +
                        (int) Math.pow(i, 2));
            }
        }

        entrada.close();
    }

}
