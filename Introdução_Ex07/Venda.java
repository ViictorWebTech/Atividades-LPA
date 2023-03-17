/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introdução_Ex07;

/**
 *
 * @author Aluno
 */
public class Venda {
    private double v_fab, v_lucro, v_imposto , v_final;
    
    public String calcularVenda(double v_fab, double v_lucro, double v_imposto){
        
        this.v_fab = v_fab;
        
        this.v_lucro = v_fab * (v_lucro * 0.01);
        
        this.v_imposto = v_fab * (v_imposto * 0.01);
                
        
        this.v_final = this.v_fab + this.v_lucro + this.v_imposto;
        
        
      
        return "O lucro do distribuidor é: R$" + this.v_lucro + 
                "\n O valor de imposto é: R$" + this.v_imposto +
                "\n O preço final é: " + this.v_final ;
        
    }  
}
