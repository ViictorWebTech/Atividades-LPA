/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introdução_Ex08;

/**
 *
 * @author Aluno
 */
public class Salario {
    private double n_horas, v_horas, v_salmin, salbru , imposto, sal_rec;
    
    public String calcularSalario(double n_horas, double v_salmin){
        
        this.n_horas = n_horas;
       
        this.v_salmin = v_salmin;
        
        this.v_horas = v_salmin / 2;
       
        this.salbru = n_horas * v_horas;
        
        this.imposto = salbru * 0.03;
        
        this.sal_rec = salbru - imposto;
       
      
        return "O número de horas trabalhadas foi de: " + this.n_horas + 
                "\nO valor do salário mínimo é: R$" + this.v_salmin +
                "\nO salário BRUTO foi de: R$" + this.salbru +
                "\nO imposto de 3% foi de: R$" + this.imposto +
                "\nO salário final que será recebido: R$" + this.sal_rec ;
        
    }  
}
