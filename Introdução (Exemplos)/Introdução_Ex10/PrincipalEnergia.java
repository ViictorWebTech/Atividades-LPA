/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Sabe-se que o quilowatt de energia custa um quinto do
salário mínimo. Faça um programa que receba o valor 
do salário mínimo e a quantidade de quilowatts consumida
por uma residência. Calcule e mostre:
    a) o valor, em reais, de cada quilowatt;
    b) o valor, em reais, a ser pago por essa residência;
    c) o valor em reais, a ser pago com desconto de 15%;
*/
package Introdução_Ex10;

/**
 *
 * @author Aluno
 */

import javax.swing.JOptionPane;

public class PrincipalEnergia {
    
    
    public static void main(String[] args) {
  Energia energia = new Energia();
        
        
          JOptionPane.showMessageDialog(null, energia.calcularEnergia(
                  
          Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salário mínimo: ")),
              
           Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de quilowatts consumida: "))
            ));
        
       
      
    }       
}