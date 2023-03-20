/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Faça um programa que receba o número de horas trabalhadas
e o valor do salário mínimo.
Calcule e mostre o salário a receber seguindo as regras abaixo:
    a) a hora trabalhada vale a metade do salário mínimo;
    b) o salário bruto equivale ao número de horas trabalhadas
multiplicado pelo valor da hora trabalhada;
    c) o imposto equivale a 3% do salário bruto;
    d) o salário a receber equivale ao salário bruto
menos o imposto.
*/
package Introdução_Ex08;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class PrincipalSalario {
    
       
    public static void main(String[] args) {
        
        Salario salario = new Salario();
        
        
          JOptionPane.showMessageDialog(null, salario.calcularSalario(
          Double.parseDouble(JOptionPane.showInputDialog("Informe o número de horas trabalhadas: ")),
              
           Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salário mínimo: "))
           ));
        
        
        
      
    }       
}