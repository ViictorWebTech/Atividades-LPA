/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_3;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class PrincipalPreco {
    public static void main(String args[]){
        String resposta;
        Preco preco = new Preco();
        
        JOptionPane.showMessageDialog(null, "Digite o preço de um produto"
                + "\npara saber o valor a ser pago");
       JOptionPane.showMessageDialog(null, preco.resultado(
        Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "))
       ));
    }
}