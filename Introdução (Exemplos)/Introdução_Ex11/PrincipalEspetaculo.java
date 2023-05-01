/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Faça um programa que receba o custo de um espetáculo 
teatral e o preço do convite desse espetáculo. Esse
programa deve calcular e mostrar a quantidade de 
convites que devem ser vendidos para que pelo menos
o custo do espetáculo seja alcançado.
*/





package Introdução_Ex11;

/**
 *
 * @author Aluno
 */

import javax.swing.JOptionPane;
public class PrincipalEspetaculo {
 
    public static void main(String[] args) {
  Espetaculo espetaculo = new Espetaculo();
        
        
          JOptionPane.showMessageDialog(null, espetaculo.calcularEspetaculo(
                  
          Double.parseDouble(JOptionPane.showInputDialog("Informe o custo do espetáculo: ")),
              
           Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do convite: "))
            ));
        
       
      
    }       
}