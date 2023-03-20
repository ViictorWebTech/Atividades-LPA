/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas.
Faça um programa que receba o salário fixo de um funcionário e o valor de suas vendas,
calcule e motre a comissão e o salário final do funcionário.
*/

package Introdução_Ex04;
import javax.swing.JOptionPane;


/**
 *
 * @author Aluno
 */
public class PrincipalSalario_Vendas {
    public static void main(String[] args) {
        Salario_Vendas salario_vendas = new Salario_Vendas();
        double salario, vendas;
        
        salario = Double.parseDouble(
                JOptionPane.showInputDialog(
        "O salario fixo do funcionário:"));
        
        vendas = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Infome o valor total das vendas do funcionário: "));
             
        JOptionPane.showMessageDialog(null, salario_vendas.calcularSalvendas(salario, vendas));
        
    }//Fecha main
}//Fecha class
