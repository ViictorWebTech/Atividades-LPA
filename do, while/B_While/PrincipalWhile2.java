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
public class PrincipalWhile2 {
    public static void main(String[] args) {
        String letra;
        ExemploWhile2 exemplowhile2 = new ExemploWhile2();
        letra = JOptionPane.showInputDialog("Informe a letra");
        
        while(letra.equalsIgnoreCase("x")){
            exemplowhile2.verificar(letra);
            letra = JOptionPane.showInputDialog("Informe a letra");
        }
        JOptionPane.showMessageDialog(null, exemplowhile2.mostra());
    }
}
