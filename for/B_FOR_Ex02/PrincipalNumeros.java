/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*Faça um algoritmo que solicite dois números inteiros e mostre todos os 
números do intervalo
 */
package B_FOR_Ex02;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class PrincipalNumeros {

    public static void main(String[] args) {
        Numeros numeros = new Numeros();

   int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número 1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número 2"));
        
        JOptionPane.showMessageDialog(null, numeros.calcular(n1, n2));
    }
}
