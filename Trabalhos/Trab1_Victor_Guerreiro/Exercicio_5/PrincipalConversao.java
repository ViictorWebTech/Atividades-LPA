/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_5;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class PrincipalConversao {
    public static void main(String args[]){
        String resposta;
        Conversao conversao = new Conversao();
        
        JOptionPane.showMessageDialog(null, "Conta para a quantidade de dinheiro convertido");
       JOptionPane.showMessageDialog(null, conversao.resultado(
        Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dinheiro em reais: "))
       ));
    }
}