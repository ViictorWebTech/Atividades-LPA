/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Introdução_Ex03;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class PrincipalSalario {
    public static void main(String[] args) {
        Salario salario = new Salario();
        
        JOptionPane.showMessageDialog(null, "O salario é: " +
                salario.calcularSalario(
                Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Infome a porcentagem de aumento: "))
                ));
    }//Fecha main
}//Fecha classe
