/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Encapsulamento_Ex04;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class MediaVIEW {

    public static void main(String[] args) {
        try {
            MediaDTO mediaDTO = new MediaDTO();
            MediaCTR mediaCTR = new MediaCTR();

            mediaDTO.setN1(
                    Double.parseDouble(
                            JOptionPane.showInputDialog("Informe a nota 1:")));
            mediaDTO.setN2(
                    Double.parseDouble(
                            JOptionPane.showInputDialog("Informe a nota 2: ")));

            JOptionPane.showMessageDialog(null, mediaCTR.calcular(mediaDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }//Fecha main
}//Fecha classe
