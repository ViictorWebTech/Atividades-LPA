/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_4;

/**
 *
 * @author Aluno
 */
public class Salario {
    private double h_trab, v_hora, v_salmin, h_extras, v_extras, r_extras, sal_b, salf;
    
        public String resultado(double h_trab, double v_salmin, double h_extras){
            this.v_salmin = v_salmin;
            this.v_hora = v_salmin / 8;
            this.v_extras = v_salmin / 4;
            this.sal_b = h_trab * v_hora;
            this.r_extras = h_extras * v_extras;
            this.salf = sal_b + r_extras;
            
     
           
           return "O valor do salário mínimo é de: R$" + this.v_salmin 
                  + "\nO salário final é de: R$" + this.salf;
        }
       
        }
