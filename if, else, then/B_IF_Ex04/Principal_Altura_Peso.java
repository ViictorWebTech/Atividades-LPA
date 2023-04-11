/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
Faça um algoritmo que receba a altura e o peso de uma pessoa.
De acordo com a tabela a seguir verifique e
mostre qual a classificação dessa pessoa.
 */
package B_IF_Ex04;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class Principal_Altura_Peso {

    public static void main(String args[]) {
        Altura_Peso_Classificacao altura_peso = new Altura_Peso_Classificacao();

        JOptionPane.showMessageDialog(null, altura_peso.classificar(
                Double.parseDouble(
                        JOptionPane.showInputDialog("Digite sua altura (cm): ")),
                Double.parseDouble(
                        JOptionPane.showInputDialog("Digite seu peso (kg): "))
        ));

    }
}
