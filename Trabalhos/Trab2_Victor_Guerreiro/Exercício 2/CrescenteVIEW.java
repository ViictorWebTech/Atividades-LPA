/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class CrescenteVIEW {

    public static void main(String args[]) {
        try {
            CrescenteDTO crescenteDTO = new CrescenteDTO();
            CrescenteCTR crescenteCTR = new CrescenteCTR();

            crescenteDTO.setNum1(Integer.parseInt(
                    JOptionPane.showInputDialog("Informe um número: ")));
            crescenteDTO.setNum2(Integer.parseInt(
                    JOptionPane.showInputDialog("Informe outro número: ")));
           crescenteDTO.setNum3(Integer.parseInt(
                    JOptionPane.showInputDialog("Informe outro número: ")));

          JOptionPane.showMessageDialog(null, crescenteCTR.calcular(crescenteDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: "
                    + e.getMessage());
        }
    }//Fecha metodo main
}