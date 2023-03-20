/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Sabe-se que para iluminar de maneira correta os cômodos
de uma casa, para cada metro quadrado, deve-se usar 18 W
de potência. faça um programa que receba a sua área (em
metros quadrados) e a potência de iluminação que deverá
ser utilizada.
*/

package Introdução_Ex13;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class PrincipalIluminacao {
 
    
      public static void main(String[] args) {
  Iluminacao iluminacao = new Iluminacao();
        
        
          JOptionPane.showMessageDialog(null, iluminacao.calcularIluminacao(
                  
          Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento do cômodo: ")),
              
           Double.parseDouble(JOptionPane.showInputDialog("Informe a largura do cômodo: "))
            ));
        
       
      
    }       
}
