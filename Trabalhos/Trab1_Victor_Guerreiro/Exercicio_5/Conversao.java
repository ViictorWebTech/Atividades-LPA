/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_5;

/**
 *
 * @author Aluno
 */
public class Conversao {
    private double v_reais, v_dolar, v_marcoale, v_libraester;
    
        public String resultado(double v_reais){
            this.v_reais = v_reais;
            this.v_dolar = v_reais / 5.25;
            this.v_marcoale = v_reais / 5.66;
            this.v_libraester = v_reais / 6.42;
     
           
           return "O valor em reais que está levando é: R$ " + this.v_reais 
                   + "\nO valor em Dólar é: $ " + this.v_dolar
                  + "\nO valor em Marco Alemão é: DEM " + this.v_marcoale 
                   + "\nO valor em Libra Esterlinas é: £ " + this.v_libraester;
        }
       
        }
