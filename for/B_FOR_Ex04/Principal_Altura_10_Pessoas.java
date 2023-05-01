/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
Construir um algoritmo que leia a altura de 10
pessoas. O algoritmo deve calcular e imprimir
quantas pessoas possuem altura maior que 2
metros e a media das alturas.
OBS: Deve ser criado um método para fazer os cálculos,
um para mostrar a média das alturas e outro para mostrar
a quantidade de pessoas com mais de 2 metros.
 */
package B_FOR_Ex04;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class Principal_Altura_10_Pessoas {

    public static void main(String args[]) {
        Altura_10_Pessoas altura = new Altura_10_Pessoas();

        for (int cont = 1; cont <= 10; cont++) {
            altura.calcular_Altura(
                    Double.parseDouble(
                            JOptionPane.showInputDialog("Informe a altura: "))
            );
        }

        JOptionPane.showMessageDialog(null,
                "A média das alturas é de: " + altura.mostra_Media());
        JOptionPane.showMessageDialog(null,
                "A quantidade de pessoas com mais de 2 m de altura é de: " + altura.mostra_Maiores());
    }
}
