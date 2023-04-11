/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Dados 3 valores ladoA, ladoB, ladoC.
Estes valores representam lados de
um triângulo.
Com base nisso verificar:
a)Se podem ser valores dos lados formam um triângulo;
b)Se formar um triângulo, determine qual:
    equilátero
    isósceles ou
    escaleno.
c)A resposta deve ser devolvida para a classe principal para ser mostrada.
*/
package B_IF_Ex05;

/**
 *
 * @author Aluno
 */

import javax.swing.JOptionPane;
public class Principal_Triangulo {
        public static void main(String args[]) {
        Triangulo triangulo = new Triangulo();

        JOptionPane.showMessageDialog(null, triangulo.classificar(
                Double.parseDouble(
                        JOptionPane.showInputDialog("Digite o valor do lado A: ")),
                Double.parseDouble(
                        JOptionPane.showInputDialog("Digite o valor do lado B: ")),
                Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor do lado C: "))
        ));

    }
}


