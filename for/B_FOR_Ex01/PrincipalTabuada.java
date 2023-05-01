/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_FOR_Ex01;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class PrincipalTabuada {

    public static void main(String[] args) {
        Tabuada tabuada = new Tabuada();

        JOptionPane.showMessageDialog(null,
                tabuada.calcular_Tabuada(Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Infome o número para calcular a tabuada")))
        );
    }
}
