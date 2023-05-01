/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
Um funcionário de um aempresa recebe aumento salarial 
anualmente. Sabe-se que:
a - esse funcionário foi contratado em 1995, com salario 
inicial de R$ 1.000,00;
b - em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
c - a partir de 1997 (inclusive), os aumentos salariais
sempre corresponderam ao dobro do percentual do ano anterior.
Faça um programa que solicite o ano atual e 
determine p salario atual desse funcionário
 */
package B_FOR_Ex05;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Principal_Salario_Atual {

    public static void main(String[] args) {
        DecimalFormat formatando = new DecimalFormat("##,###.00");
        Salario_Atual salario_atual = new Salario_Atual();

        JOptionPane.showMessageDialog (null,
           "O novo salário é: " +
                   formatando.format(
                   salario_atual.calcular_Salario(
                   Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual")))
                   )
        );
    }//Fecha todo main

}
