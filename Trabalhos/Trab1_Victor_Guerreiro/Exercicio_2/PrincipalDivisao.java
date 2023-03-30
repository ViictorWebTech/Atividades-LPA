/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_2;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class PrincipalDivisao {
    public static void main(String args[]){
        String resposta;
        Divisao divisao = new Divisao();
        
        JOptionPane.showMessageDialog(null, "Digite dois números sem o segundo ser o 0"
                + "\npara ser feito a divisão do primeiro pelo segundo");
       JOptionPane.showMessageDialog(null, divisao.resultado(
        Double.parseDouble(
        JOptionPane.showInputDialog("Digite o primeiro número: ")),
        Double.parseDouble(
        JOptionPane.showInputDialog("Digite o segundo número: "))
       ));
    }
}