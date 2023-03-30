/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_3;

/**
 *
 * @author Aluno
 */
public class Preco {
    private double valor, pvista, pprazo;
    
        public String resultado(double valor){
            this.valor = valor;
            this.pvista = valor - (0.05 * valor);
            this.pprazo = valor + (0.1 * valor);
     
           
           return "O valor do produto é R$" + this.valor
           + "\nO valor a vista é: R$" + this.pvista
           + "\nO valor a Prazo é: R$" + this.pprazo;
        }
       
        }
