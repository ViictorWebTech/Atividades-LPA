/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Encapsulamento_Ex05;

/**
 *
 * @author Aluno
 */
/*
Você está fazendo um trabalho de classificação de solo.
Após colher uma amostra e verificar a pontuação de
água presente nela, classificou a amostra em:
Rochosa: se menos ou igual a 10 pontos de água
Firme: se mais de 10 pontos e menos ou igual a 40 pontos
Pantanosa: se mais de 40 pontos e menos ou igual a 80 pontos
Caso seja maior que 80 pontos escrever a mensagem:
"Quantidade de água invválida"
 */
import javax.swing.JOptionPane;

public class SoloVIEW {

    public static void main(String[] args) {
        try {
            SoloDTO soloDTO = new SoloDTO();
            SoloCTR soloCTR = new SoloCTR();

            soloDTO.setPontos(
                    Integer.parseInt(
                            JOptionPane.showInputDialog("Informe a quantidade de pontos de água:")));

            JOptionPane.showMessageDialog(null, soloCTR.classificar(soloDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }//Fecha main
}//Fecha classe
