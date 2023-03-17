/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introdução_Ex12;

/**
 *
 * @author Aluno
 */
public class Combustivel {
    
     private double tempo_gasto, km_litro, vel_med, distancia, litro_gasto; 
    
     public String calcularCombustivel(double tempo_gasto, double km_litro, double vel_med){
        
        this.tempo_gasto = tempo_gasto;
       
        this.km_litro = km_litro;
        
        this.vel_med = vel_med;
        
        
        this.distancia = vel_med * tempo_gasto;
        
        this.litro_gasto = distancia / km_litro;
        
       
      
        return  "A velocidade média foi de: " + this.vel_med + "Km/h" + 
                "\nO tempo gasto na viagem foi de: " + this.tempo_gasto + "h" +
                "\nA distância percorrida foi de: " + this.distancia + "km" + 
                "\nA quantidade de combustível utilizado foi de: " + this.litro_gasto + "l";
        
    }  
}
