/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar.

Entrada: O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um
item conforme tabela acima.

Saída: O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago,
com 2 casas após o ponto decimal. */

package LogicaDeProgramacao;

import java.util.Scanner;

public class DesafioLanche {

    public static void main(String[] args) {;

        Scanner lanchonete = new Scanner(System.in);

        int ID, conta;

        ID = lanchonete.nextInt();
        conta = lanchonete.nextInt();

        if (ID == 1) {
            System.out.printf("Total: R$ %.2f\n",conta*4.00);
        }
        if (ID == 2) {
            System.out.printf("Total: R$ %.2f\n",conta*4.50);
        }
        if (ID == 3) {
            System.out.printf("Total: R$ %.2f\n",conta*5.00);
        }
        if (ID == 4) {
            System.out.printf("Total: R$ %.2f\n",conta*2.00);
        }
        if (ID == 5) {
            System.out.printf("Total: R$ %.2f\n",conta*1.50);
        }
    }
}

