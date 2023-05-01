/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
* Faça um algoritmo que solicite 10 números inteiros.
* Ao final o algoritmo deve informar o maior e o
* menor número digitado.
* OBS: Deve ser criado um método para verificar os números 
* e outro para mostrar o resultado.
*/
package B_FOR_Ex06;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class Principal_Maior_Menor_Numero {

    public static void main(String args[]) {
        Maior_Menor_Numero numero = new Maior_Menor_Numero();

        for (int cont = 1; cont <= 10; cont++) {
            numero.calcular_Numero(
                    Double.parseDouble(
                            JOptionPane.showInputDialog("Informe o número: "))
            );
        }

        JOptionPane.showMessageDialog(null,
                "O maior número foi: " + numero.mostra_Maior());
        JOptionPane.showMessageDialog(null,
                "O menor número foi: " + numero.mostra_Menor());
    }
}
