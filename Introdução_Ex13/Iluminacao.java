/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introdução_Ex13;

/**
 *
 * @author Aluno
 */
public class Iluminacao {
    
       private double comprimento, largura, area, potencia; 
    
     public String calcularIluminacao(double comprimento, double largura){
        
        this.comprimento = comprimento;
       
        this.largura = largura;
        
        
        this.area = comprimento * largura;
        
        this.potencia = area * 18;
      
        return  "A área total do cômodo é de: " + this.area + "m²" + 
                "\nA potência de iluminação do cômodo deve ser de: " + this.potencia + "W";
        
    }  
}
