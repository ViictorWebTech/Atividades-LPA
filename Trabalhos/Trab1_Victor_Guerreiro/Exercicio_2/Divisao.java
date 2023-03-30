/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_2;

/**
 *
 * @author Aluno
 */
public class Divisao {
    private double num1, num2, resposta;
    
        public String resultado(double num1, double num2){
            this.num1 = num1;
            this.num2 = num2;
            
           resposta = num1 / num2;
     
           
           return "A divisão do primeiro número pelo segundo é: " + this.resposta;
        }
       
        }

