/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
Faça um programa que receba o salário base de um funcionário.
Calcule e mostre o salário a receber, sabendo que esse funcionário tem
gratificação de R$50,00 e paga imposto de 10% sobre o salário base.

 */
package Introdução_Ex05;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalSalario {

    public static void main(String[] args) {
        Salario salario = new Salario();
        double sal;

        sal = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Informe o salario base do funcionário:"));

        JOptionPane.showMessageDialog(null, salario.calcularSalario(sal));

    }//Fecha main
}//Fecha class

