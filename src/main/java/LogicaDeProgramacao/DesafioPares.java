/* Exibindo todos os numeros pares em ordem crescente de acordo com o numero que colocar
Exemplo: Ao colocar o numero 25, tera que ser exibido todos os numeros pares antes do 25, como
...18,20,22,24
 */

package LogicaDeProgramacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DesafioPares {

    public static void main(String[] args) throws IOException {
        String entrada;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        entrada = br.readLine();

        for (int i = 2; i <= Integer.parseInt(entrada); i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
