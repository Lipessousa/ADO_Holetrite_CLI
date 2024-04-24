package CalculoHolerite;

import Descontos.Descontos;
import Funcionario.Funcionario;
import Ganhos.Ganhos;
import java.util.Scanner;

public class CalculoHolerite {

    public static double valorBonus;

    
    public static void Holerite() {

        int j = 1;

        while (j != 0) {

            System.out.println("|\t\t  Cadastro de Funcionarios\t\t\t|");

            System.out.println("-----------------------------------------------------------------");

            System.out.printf("|Digite a quantidade de funcionarios: ");

            //Scanner que vai ler a quantiadde de funcionários
            // que o usuário deseja inserir no array de tipo Funcionario
            Scanner reader = new Scanner(System.in);
            int qtdFuncionarios = reader.nextInt();
            Funcionario funcionario[] = new Funcionario[qtdFuncionarios];

            System.out.println("-----------------------------------------------------------------");

            //Neste laço é inserido em cada index do array
            // os dados Nome e SalarioBruto do funcionário
            for (int i = 0; i < funcionario.length; i++) {
                funcionario[i] = new Funcionario();
                System.out.printf("|Digite o nome do funcionario: ");
                funcionario[i].nome = reader.next();
                System.out.printf("|Digite o salario do funcionario: ");
                funcionario[i].salarioBruto = reader.nextDouble();
                System.out.println("-----------------------------------------------------------------");
            }

            //Neste laço, cada campo da classe Funcionario receberá seu respectivo valor de desconto | bonificação
            for (Funcionario funcionario1 : funcionario) {
                System.out.printf("|Funcionario" + " " + funcionario1.nome + " " + "tem Vale Transporte?(s/n): ");
                String vtFunc = reader.next();
                if (vtFunc.equals("s") || vtFunc.equals("S")) {
                    funcionario1.vt = Descontos.ValeTransporte(funcionario1.salarioBruto);
                } else {
                    funcionario1.vt = Descontos.ValeTransporte(0);
                }
                funcionario1.vr = Descontos.ValeRefeicao(funcionario1.salarioBruto);
                funcionario1.va = Descontos.ValeAlimentacao(funcionario1.salarioBruto);
                funcionario1.convenioMedico = Descontos.ValeAlimentacao(funcionario1.salarioBruto);
                funcionario1.inss = Descontos.INSS(funcionario1.salarioBruto);
                funcionario1.irrf = Descontos.IRRF(funcionario1.salarioBruto);
                System.out.printf("|Quantidade de horas extras de " + funcionario1.nome + ": ");
                int horas = reader.nextInt();
                funcionario1.horaExtra = Ganhos.HoraExtra(horas, funcionario1.salarioBruto);
                System.out.printf("|Valor do bonus de " + funcionario1.nome + ": ");
                valorBonus = reader.nextDouble();
                funcionario1.bonus = Ganhos.Bonus(valorBonus);
                System.out.println("-----------------------------------------------------------------");
            }

            //Neste laço será feito o cálculo do salário líquido de cada funcionário do meu array
            for (Funcionario funcionario1 : funcionario) {
                funcionario1.salarioLiquido = (funcionario1.salarioBruto - (funcionario1.va + funcionario1.vr + funcionario1.vt + funcionario1.convenioMedico + funcionario1.inss + funcionario1.irrf)) + funcionario1.horaExtra + funcionario1.bonus;
            }

            //Neste laço será retornado os devidos valores referentes a cada funcionário
            // seja ele bonificação | desconto
            for (Funcionario funcionario1 : funcionario) {
                //Como todos os valores da classe Funcionario são do tipo double
                // aqui eles são convertidos para float, onde os valores possam ser 
                // exibidos apenas com poucas casas decimais
                float horaExtra = (float) funcionario1.horaExtra;
                float bonus = (float) funcionario1.bonus;
                float vt = (float) funcionario1.vt;
                float vr = (float) funcionario1.vr;
                float va = (float) funcionario1.va;
                float convenioMedico = (float) funcionario1.convenioMedico;
                float inss = (float) funcionario1.inss;
                float irrf = (float) funcionario1.irrf;
                float salarioLiquido = (float) funcionario1.salarioLiquido;
                //Esttrutura de exibição dos valores
                System.out.println("|\t\t\t  HOLERITE\t\t\t\t|");
                System.out.println("|Nome: \t\t\t" + funcionario1.nome + "\t\t\t\t\t|");
                System.out.println("|Salario Bruto: \t" + "R$ " + funcionario1.salarioBruto + "\t\t\t\t|");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("|Bonificacoes:  \t\t\t\t\t\t|");
                System.out.println("|Horas extras: \t\t R$: " + horaExtra + "\t\t\t\t|");
                System.out.println("|Bonus: \t\t R$: " + bonus + "\t\t\t\t|");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("|Descontos:  \t\t\t\t\t\t\t|");
                System.out.println("|Desconto   VT: \t R$: " + vt + "\t\t\t\t|");
                System.out.println("|Desconto   VR: \t R$: " + vr + "\t\t\t\t|");
                System.out.println("|Desconto   VA: \t R$: " + va  + "\t\t\t\t|");
                System.out.println("|Desconto Convenio: \t R$: " + convenioMedico + "\t\t\t\t|");
                System.out.println("|Desconto INSS: \t R$: " + inss + "\t\t\t\t|");
                System.out.println("|Desconto IRRF: \t R$: " + irrf + "\t\t\t\t|");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("|Salario Liquido: \t R$: " + salarioLiquido + "\t\t\t\t|");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("\t\t\t\t\t\t\t");
            }

            System.out.println("-----------------------------------------------------------------");

            System.out.println("|1- continuar \t\t\t\t\t\t\t|");
            System.out.println("|2- sair  \t\t\t\t\t\t\t|");
            System.out.println("|3- consultar lista de funcionarios  \t\t\t\t|");
            int resp = reader.nextInt();

            //Aqui é lido a resposta do usuário
            //Caso escolha 1, ele poderá refazer o processo de inserção de funcionários
            //Caso o usuário escolha a opção 2, o programa se encerra
            //Caso 3, é listado os funcionários já cadastrados
            if (resp == 2) {
                j = 0;
                System.out.println("|\t\t\tPrograma encerrado\t\t\t|");
                System.out.println("-----------------------------------------------------------------");
                break;
            } else if (resp == 3) {
                ListaFuncionario.ListaFunc(funcionario);
            }
        }
    }
}
