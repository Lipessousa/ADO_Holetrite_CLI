package Descontos;

public class Descontos {

    //variável que recebe o valor de desconto do vale tranporte
    public static double descontoVT;
    //variável que recebe o valor de desconto do vale refeição
    public static double descontoVR;
    //variável que recebe o valor de desconto do vale alimentação
    public static double descontoVA;
    //variável que recebe o valor de desconto do convênio médico
    public static double descontoConvenio;
    //variável que recebe o valor de desconto do INSS
    public static double descontoINSS;
    //variável que recebe o valor de desconto do vale IRRF
    public static double descontoIRPF;

    //método que calcula o valor de desconto de vt do salário
    public static double ValeTransporte(double salario) {

        int qtdConducaoDia = 2;

        //variável que contém o valor de total de dias onde o vt é usado
        // 22 é a média de dias trabalhados no mês
        // 4.40 é o valor de duas passagens(que é média de passagens usadas no dia)
        double totalDia = (qtdConducaoDia * 4.40) * 22; 
        
        //variável que contém o valor de desconto do vt em procentagem (neste caso, 6%)
        double vtDesc = salario * 0.6;

        //Caso o o valor de total do totalDia seja maior que a porcentagem prevista de descconto
        //o desconto a ser feito no salário será o valor da variável vtDesc
        //caso contrário, o valor a ser descontado do salário será o da variável totalDia
        if (totalDia > vtDesc) {
            descontoVT = vtDesc;   
        } else {
            descontoVT = totalDia;
        }

        return descontoVT;
    }

    //método que calcula o valor de desconto de vr do salário
    public static double ValeRefeicao(double salario) {

        if (salario > 1412) {
            descontoVR = salario * 0.02;
        }

        return descontoVR;
    }

    //método que calcula o valor de desconto de va do salário
    public static double ValeAlimentacao(double salario) {

        if (salario > 1412) {
            descontoVA = salario * 0.03;
        }

        return descontoVA;
    }

    //método que calcula o valor de desconto de convênio do salário
    public static double ConvenioMedico(double salario) {

        if (salario > 1412) {
            descontoConvenio = salario * 0.04;
        }

        return descontoConvenio;
    }

    //método que calcula o valor de desconto do INSS do salário
    public static double INSS(double salario) {

        //Aqui a porcentagem de desconto do salário será de acordo
        //com a renda do funcionário
        if (salario <= 1412) {
            descontoINSS = salario * 0.075;
        } else if (salario > 1412 && salario <= 2666.68) {
            descontoINSS = (salario * 0.09) - 21.18;
        } else if (salario > 2666.68 && salario <= 4000.03) {
            descontoINSS = (salario * 0.12) - 101.18;
        } else if (salario > 4000.03 && salario <= 7786.02) {
            descontoINSS = (salario * 0.14) - 181.18;
        }

        return descontoINSS;
    }

    //método que calcula o valor de desconto de IRPF do salário
    public static double IRRF(double salario) {

        //base salarial 1
        double base1 = salario - descontoINSS;

        //base salarial 2
        double base2 = salario - 528;

        //Variável que receberá ou o valor da base1 ou o da base2
        double baseIRRF;

        
        if (base1 > base2) {
            baseIRRF = base2;
        } else {
            baseIRRF = base1;
        }
        
        //Aqui a porcentagem de desconto do salário será de acordo
        //com a renda do funcionário
        if (baseIRRF < 2259.20) {
            descontoIRPF = 0;
        } else if (baseIRRF > 2259.20 && baseIRRF <= 2826.65) {
            descontoIRPF = (baseIRRF * 0.075) - 169.44;
        } else if (baseIRRF > 2826.66 && baseIRRF <= 3751.05) {
            descontoIRPF = (baseIRRF * 0.15) - 381.44;
        } else if (baseIRRF > 3751.06 && baseIRRF <= 4664.68) {
            descontoIRPF = (baseIRRF * 0.225) - 662.77;
        } else if (baseIRRF > 4664.68) {
            descontoIRPF = (baseIRRF * 0.275) - 896;
        }

        return descontoIRPF;
    }

}
