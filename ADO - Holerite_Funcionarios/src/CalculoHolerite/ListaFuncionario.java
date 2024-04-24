
package CalculoHolerite;

import Funcionario.Funcionario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListaFuncionario {
    
    //método que lista os funcionários já cadastrados
    //onde é passado como parametro um array do tipo Funcionario
    public static void ListaFunc(Funcionario[] lista) {

        
        System.out.println("|\t\t LISTA DE FUNCIONARIOS CADASTRADOS\t\t|");

        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < lista.length; i++) {
            float salarioLiquido = (float) lista[i].salarioLiquido;
            float vt = (float) lista[i].vt;
            float va = (float) lista[i].va;
            float vr = (float) lista[i].vr;
            float horaExtra = (float) lista[i].horaExtra;
            float bonus = (float) lista[i].bonus;
            float convenioMedico = (float)lista[i].convenioMedico;
            float inss = (float) lista[i].inss;
            float irrf = (float) lista[i].irrf;

            System.out.println("Nome: \t\t\t" + lista[i].nome + "\t\t\t\t\t|");
            System.out.println("Salario Bruto: \t" + "R$ " + lista[i].salarioBruto);
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Bonificacoes:  ");
            System.out.println("Horas extras - R$: " + horaExtra + "\t\t" + "Bonus - R$: " + bonus);
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Descontos:  ");
            System.out.println("VT - R$: " + vt + "\t\t " + " VR - R$: " + vr + "\t\t " + "VA - R$: " + va);
            System.out.println("INSS - R$: " + inss + "\t" + " IRRF - R$" + irrf);
            System.out.println("Convenio medico - R$: " + convenioMedico);
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Salario Liquido - R$: " + salarioLiquido);
            System.out.println("-----------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t");

        }

        System.out.println("Selecione uma das opcoes abaixo");
        System.out.println("|1- Sair");
        System.out.println("|2- Cadastrar novo Funcionario");

        int resp = reader.nextInt();

        
        //Caso o usuário escolha a opção 1, o programa se encerra
        //caso escolha 2, ele pode cadatrar um novo funcionario
        if (resp == 1) {
            System.out.println("|\t\t\tPrograma encerrado\t\t\t|");
            System.out.println("-----------------------------------------------------------------");
            System.exit(0);
        } else {
            CalculoHolerite.Holerite();
        }

    }
}
