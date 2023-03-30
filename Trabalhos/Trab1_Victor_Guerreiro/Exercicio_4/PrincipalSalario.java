/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_4;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class PrincipalSalario {
    public static void main(String args[]){
        String resposta;
        Salario salario = new Salario();
        
        JOptionPane.showMessageDialog(null, "Conta para saber o salário"
                + "\na receber");
       JOptionPane.showMessageDialog(null, salario.resultado(
        Double.parseDouble(JOptionPane.showInputDialog("Digite o número de horas trabalhadas: ")),
        Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário mínimo: ")),
        Double.parseDouble(JOptionPane.showInputDialog("Digite o número de horas extras feitas: "))
       ));
    }
}