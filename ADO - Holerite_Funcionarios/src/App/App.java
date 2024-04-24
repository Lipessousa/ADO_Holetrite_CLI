package App;

import CalculoHolerite.CalculoHolerite;
import java.util.Scanner;
import Ganhos.Ganhos;

public class App {

    public static void main(String[] args) {
        
        //Scanner que irá ler a resposta do usuário
        Scanner reader = new Scanner(System.in);

        System.out.println("|\t\tBem vindo ao Sistema de Holerite\t\t|");
        System.out.println("-----------------------------------------------------------------");

        System.out.println("|\t\t\tMenu de opcoes\t\t\t\t|");

        System.out.println("|1- Entrar \t\t\t\t\t\t\t|");
        System.out.println("|2- Sair \t\t\t\t\t\t\t|");
        
        // a variável i será usada para ler a opção do usuário
        int i = reader.nextInt();
        
        System.out.println("-----------------------------------------------------------------");

        //Aqui, de acrodo com o valor de i que será inserido pelo usuário
        //será retornado uma ação diferente
        switch (i) {
            //caso o usuário escolha 1, será chamado o método que faz o cálculo do salário
            case 1:
                CalculoHolerite.Holerite();
                break;
            //caso escolha a opção 2, o programa será encerrado
            case 2:
                System.out.println("|\t\t\tPrograma encerrado\t\t\t|");
                System.exit(0);
                break;
        }
    }
}
