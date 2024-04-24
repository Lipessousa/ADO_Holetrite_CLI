package Ganhos;

public class Ganhos {
    public static double horaExtra;
    
    public static double bonusPago;
    
    //método que calcula a hora extra
    public static double HoraExtra(int qtdHoraExtra, double salario){
        
        //calcúlo do salário por hora
        //200 é o valor médio de horas trabalhadas por mês
        double salarioHora = salario/200;
        
        //total recebido pelas horas extras
        double totalHoraExtra = qtdHoraExtra * salarioHora;
        
        horaExtra = totalHoraExtra;
          
        return horaExtra;
    }
    
    //método que calcula o bonus
    public static double Bonus(double bonus){
        bonusPago = bonus;
        
        return bonusPago;
    }
    
}