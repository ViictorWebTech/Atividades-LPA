/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introdução_Ex02;

import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class PrincipalNota {
    public static void main(String[] args) {
        Nota nota = new Nota();
        
        JOptionPane.showMessageDialog(null, "Oi" +
                "\ntudo bem"
        );
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2:"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3:"));
        double p1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso 1:"));
        double p2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso 2:"));
        double p3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso 3:"));
        JOptionPane.showMessageDialog(null, nota.calcularMedia(n1, n2, n3, p1, p2, p3));
        
       
    }//Fecha Main
}//Fecha classe
