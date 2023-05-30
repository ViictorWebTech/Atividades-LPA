/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Encapsulamento_Ex06;

/**
 *
 * @author Aluno
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
OBS1: Deve ser desenvolvido um método para verificar se os lados
formam um triângulo e outro para verificar qual é o triângulo.
OBS2: só pode ser mostrado o tipo do triângulo deve ser mostrado
uma mensagem que os lados informados não formam um triângulo.
*/
import javax.swing.JOptionPane;
public class TrianguloVIEW {

    public static void main(String[] args) {
        try {
            TrianguloDTO trianguloDTO = new TrianguloDTO();
            TrianguloCTR trianguloCTR = new TrianguloCTR();

            trianguloDTO.setLadoA(
                    Double.parseDouble(
                            JOptionPane.showInputDialog("Informe o lado A do triângulo:")));
            trianguloDTO.setLadoB(
                    Double.parseDouble(
                            JOptionPane.showInputDialog("Informe o lado B do triângulo:")));
            trianguloDTO.setLadoC(
                    Double.parseDouble(
                            JOptionPane.showInputDialog("Informe o lado C do triângulo:")));

            JOptionPane.showMessageDialog(null, trianguloCTR.classificar(trianguloDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }//Fecha main
}//F