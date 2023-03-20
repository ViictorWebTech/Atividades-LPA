/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
faça um algoritmo que receba três números
obrigatoriamente em ordem crescente
(do menor para o maior) e um quarto
número (número qualquer) que não siga a 
regra dos três primeiros. Ao final o
algoritmo deve imprimir os quatro números
em ordem decrescente (do maior par ao menor).
Os números devem ser do tipo inteiro.
*/
package B_IF_Ex03;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class Principal_Quatro_Numeros {
     public static void main(String argd[]) {
         String resultado;
         Quatro_Numeros_Ordem_Crescente quatro_numeros = new 
            Quatro_Numeros_Ordem_Crescente();
         
         JOptionPane.showMessageDialog(null,
                 "Digite os três Números em ordem crescente");
         JOptionPane.showMessageDialog(null,
                 quatro_numeros.ordem(
                 Integer.parseInt(
                    JOptionPane.showInputDialog("Digite o primeiro número: ")),
                 Integer.parseInt(       
                    JOptionPane.showInputDialog("Digite o segundo número: ")),
                 Integer.parseInt(
                    JOptionPane.showInputDialog("Digite o terceiro número: ")),
                 Integer.parseInt(
                    JOptionPane.showInputDialog("Digite o quarto número " 
                    + "fora da ordem"))
                 ));
     }
}
