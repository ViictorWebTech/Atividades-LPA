/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introdução_Ex05;

/**
 *
 * @author Aluno
 */
public class Salario {
private double sal, sal_f, imposto, sal_imposto;
    
    public String calcularSalario(double sal){
        this.sal = sal;
        
        
        this.imposto =  (this.sal * 0.1);
        
        this.sal_imposto = this.sal - this.imposto;
                
        this.sal_f = this.sal_imposto + 50;
        
        return "Salário Base: R$" + this.sal +
                "\nValor do imposto de 10%: R$" + this.imposto +
                "\nSalário Resultante do Imposto: R$" + this.sal_imposto +
                "\nCom gratificação de R$50,00, o salário final é de: R$" + this.sal_f;
        
    }//Fecha calcularSalvendas

}//Fecha classe

