/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_FOR_Ex03;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class PrincipalNumeroSoma {

    public static void main(String[] args) {
        NumeroSoma ler_numeros = new NumeroSoma();
        for (int cont = 1; cont <= 10; cont++) {
            ler_numeros.soma_Numero(
                    Integer.parseInt(
                            JOptionPane.showInputDialog("Informe o número: "))
            );
        }

        JOptionPane.showMessageDialog(null,
                "A soma dos números é: " + ler_numeros.mostra_Soma());
    }
}
