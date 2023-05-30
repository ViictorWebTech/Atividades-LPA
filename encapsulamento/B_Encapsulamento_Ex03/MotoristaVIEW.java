/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
Ler a idade do motorista
e informar se o mesmo pode ou não ter CNH
 */
package B_Encapsulamento_Ex03;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class MotoristaVIEW {

    public static void main(String[] args) {
        try {
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            MotoristaCTR motoristaCTR = new MotoristaCTR();

            motoristaDTO.setIdade(
                    Integer.parseInt(
                            JOptionPane.showInputDialog("Informe a idade")));

            JOptionPane.showMessageDialog(null, motoristaCTR.calcular(motoristaDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }//Fecha main
}//Fecha classe
