/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex01;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String argd[]) {
        Media media = new Media();
        
        JOptionPane.showMessageDialog(null, "A situação do aluno é: " +
                media.calcular(
                    Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1")),
                    Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"))
                ));
    }
}
