/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_FOR_Ex00;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class ExemploFOR {
    public static void main(String[] args) {
        int soma;
        soma = 0;
        for(int cont=1; cont<=10; cont++) {
            soma = soma + cont;
        }
        JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);
    }//Fecha main
}//Fecha classe
