/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introdução_Ex11;

/**
 *
 * @author Aluno
 */
public class Espetaculo {

    private double val_esp, val_conv, qntd_conv; 
    
     public String calcularEspetaculo(double val_esp, double val_conv){
        
        this.val_esp = val_esp;
       
        this.val_conv = val_conv;
        
        
        
        this.qntd_conv = val_esp / val_conv;
        
       
      
        return  "A quantidade de convites que deve ser vendido é de: " + this.qntd_conv;
        
    }  
    
}
