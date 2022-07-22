package LogicaDeProgramacao;

import java.util.Calendar;

public class DesafioJuros {

        public static void main(String[] args) {

            int Dia;
            Calendar agora = Calendar.getInstance();

            System.out.println("A data atual e: " + agora.getTime()); //Dia de hoje com horario

            agora.add(Calendar.DATE, +10); //Contabilizando daqui 10 dias

            System.out.println("Voce tem ate o dia " + agora.getTime() +
                    " para efeutar o pagamento"); //Dia, data, e horario para prazo maximo do pagamento

        }
    }

