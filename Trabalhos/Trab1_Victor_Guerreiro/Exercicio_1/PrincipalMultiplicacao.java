/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_1;

/**
 *
 * @author Aluno
 */

import javax.swing.JOptionPane;

public class PrincipalMultiplicacao {
    public static void main(String args[]){
        String resposta;
        Multiplicacao multiplicacao = new Multiplicacao();
        
        JOptionPane.showMessageDialog(null, "Digite três números para ser feito a multiplicação deles");
       JOptionPane.showMessageDialog(null, multiplicacao.resultado(
        Double.parseDouble(
        JOptionPane.showInputDialog("Digite o primeiro número: ")),
        Double.parseDouble(
        JOptionPane.showInputDialog("Digite o segundo número: ")),
        Double.parseDouble(
        JOptionPane.showInputDialog("Digite o terceiro número: "))
       ));
    }
}
