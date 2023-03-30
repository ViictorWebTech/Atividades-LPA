/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_1;

/**
 *
 * @author Aluno
 */
public class Multiplicacao {
    private double num1, num2, num3, resposta;
    
        public String resultado(double num1, double num2, double num3){
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
            
           resposta = num1 * num2 * num3;
     
           
           return "A multiplicação dos números é igual a: " + this.resposta;
        }
       
        }

