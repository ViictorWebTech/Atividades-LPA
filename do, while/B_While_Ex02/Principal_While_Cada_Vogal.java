/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
Construa um algoritmo que solicite uma letra até que
o número 0 (zeri) seja digitado.
Ao final o algoritmo deve informar a quantidade de
cada vogal digitada e o número total de consoantes
que foram digitadas.
OBS: o número 0 (zero) não pode ser computado.
 */
package B_While_Ex02;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class Principal_While_Cada_Vogal {

    public static void main(String[] args) {
        String letra = "";
        While_Cada_Vogal while_cada_vogal = new While_Cada_Vogal();

        while (!letra.equalsIgnoreCase("0")) {
            letra = JOptionPane.showInputDialog("Informe a letra: ");
            while_cada_vogal.verificar_letra(letra);
        }
        JOptionPane.showMessageDialog(null, while_cada_vogal.mostra());
    }
}
