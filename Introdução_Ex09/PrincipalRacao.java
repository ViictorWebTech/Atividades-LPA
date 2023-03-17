/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Pedro comprou um saco de ração com peso em quilos.
Pedro possui dois gatos para os quais fornece a quantidade 
de ração em gramas.
Faça um programa que receba o peso do saco de ração e a
quantidade de ração fornecida para cada gato.
Calcule e mostre quanto restará de ração em quilos 
no saco após cinco dias.
*/
package Introdução_Ex09;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class PrincipalRacao {
    
  
       
    public static void main(String[] args) {
        
        Racao racao = new Racao();
        
        
          JOptionPane.showMessageDialog(null, racao.calcularRacao(
          Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do saco de Ração: ")),
              
           Double.parseDouble(JOptionPane.showInputDialog("Informe quantidade de ração fornecida para um gato: ")),
           
            Double.parseDouble(JOptionPane.showInputDialog("Informe quantidade de ração fornecida para outro gato: "))
            ));
        
        
        
      
    }       
}