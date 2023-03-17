/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introdução_Ex09;

/**
 *
 * @author Aluno
 */
public class Racao {
    private double p_saco, qntd_forn, qntd_forn2, g_forn, g_forn2, qntd_rest;
    
    public String calcularRacao(double p_saco, double qntd_forn, double qntd_forn2){
        
        this.p_saco = p_saco;
       
        this.qntd_forn = qntd_forn;
        
        this.qntd_forn2 = qntd_forn2;
        
        this.g_forn = qntd_forn / 1000;
        
        this.g_forn2 = qntd_forn2 / 1000;
        
        this.qntd_rest = p_saco - (5 *(g_forn + g_forn2));
       
      
        return "O peso do saco de ração informado era de: " + this.p_saco + "Kg" +
                "\nA quantidade fornecida por dia ao primeiro gato foi de: " + this.qntd_forn + "g" +
                "\nA quantidade fornecida por dia ao segundo gato foi de: " + this.qntd_forn2 + "g" +
                "\nA quantidade restante de ração é de: " + this.qntd_rest + "Kg";
        
    }  
}
