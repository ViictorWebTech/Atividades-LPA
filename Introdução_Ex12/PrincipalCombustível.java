/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Calcular a quantidade de litros de combustível gastos em 
uma viagem. Para obter o cálculo, o usuário deverá 
fornecer o tempo gasto em horas, quantos km/l que o carro
faz e a velocidade média durante a viagem. O programa 
deverá apresentar os valores da velocidade média,  tempo
gasto na viagem, a distância percorrida e a quantidade de 
litros utilizados na viagem.
*/
package Introdução_Ex12;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class PrincipalCombustível {
    
     public static void main(String[] args) {
  Combustivel combustivel = new Combustivel();
        
        
          JOptionPane.showMessageDialog(null, combustivel.calcularCombustivel(
                  
          Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo (em horas) gasto: ")),
              
           Double.parseDouble(JOptionPane.showInputDialog("Informe quantos km/l o carro fez: ")),
           
            Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade média durante a viagem: "))
            ));
        
       
      
    }       
}
