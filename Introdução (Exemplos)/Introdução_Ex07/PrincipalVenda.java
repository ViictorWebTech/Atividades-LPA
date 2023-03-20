/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
O custo ao consumidor de um carro novo é a soma do preço
de fábrica com o percentual de lucro do distribuidor e 
dos impostos ao preço de fábrica. Faça um programa que
receba o preço de fábrica de um veículo, o porcetual de lucro
do distribuidor e o percentual de impostos.
Calcule e mostre:
    a) o valor correspondente ao lucro do distribuidor;
    b) o valor correspondente ao imposto;
    c) o preço final do veículo.
*/
package Introdução_Ex07;

/**
 *
 * @author Aluno
 */

import javax.swing.JOptionPane;

public class PrincipalVenda {
       
    public static void main(String[] args) {
        
        Venda venda = new Venda();
        
        
          JOptionPane.showMessageDialog(null, venda.calcularVenda(
          Double.parseDouble(JOptionPane.showInputDialog("Informe o preço de fábrica do carro: ")),
       
          Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem de lucro do distribuidor: ")),
        
           Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem de imposto: "))
           ));
        
        
        
      
    }       
}
