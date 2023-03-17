/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introdução_Ex10;

/**
 *
 * @author Aluno
 */
public class Energia {
    private double qntd_quilo, valor_quilo, sal_min, valor_casa, valorf_casa; 
    
     public String calcularEnergia(double sal_min, double qntd_quilo){
        
        this.sal_min = sal_min;
       
        this.qntd_quilo = qntd_quilo;
        
        
        
        this.valor_quilo = sal_min/5;
        
        this.valor_casa = valor_quilo * qntd_quilo;
        
        this.valorf_casa = valor_casa - (valor_casa * 0.15);
       
      
        return  "O valor do quilowatt é de: R$" + this.valor_quilo + 
                "\nO valor a ser pago pela conta é de: R$" + this.valor_casa +
                "\nO valor final com desconto de 15% é de: R$" + this.valorf_casa;
        
    }  
}
