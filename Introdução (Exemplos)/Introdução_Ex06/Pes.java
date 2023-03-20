/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Introdução_Ex06;

/**
 *
 * @author Aluno
 */
public class Pes {
    
    private double pes, p , j, m;
    
    public String calculaPes(double pes){
        
        this.pes = pes;
        
        this.p = pes * 12;

        this.j = pes/3;
        
        this.m = j/1760;
        
        return "O número de polegadas é: " + this.p + 
                "\n O número de jardas é: " + this.j + "\n O número de milhas é: " + this.m ;
        
    }   
}
//Fecha Classe