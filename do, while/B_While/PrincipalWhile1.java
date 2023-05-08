/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_While;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class PrincipalWhile1 {

    public static void main(String[] args) {
        int numero = 1;
        ExemploWhile1 exemplowhile1 = new ExemploWhile1();
        while (numero != 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
            exemplowhile1.somar(numero);
        }
        JOptionPane.showMessageDialog(null, exemplowhile1.mostra());
    }
}
