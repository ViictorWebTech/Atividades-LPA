/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4;

/*
 11
  @author Aluno
 */
import javax.swing.JOptionPane;
public class LanchesVIEW {


    public static void main(String args[]) {
        try {
            LanchesDTO lanchesDTO = new LanchesDTO();
            LanchesCTR lanchesCTR = new LanchesCTR();

      lanchesDTO.setCod(
                    Integer.parseInt(
                            JOptionPane.showInputDialog("Informe o código :")));

lanchesCTR.mostrarCod(lanchesDTO);

        while (lanchesDTO.getCod() != 0) {
            lanchesDTO.setCod(
             Integer.parseInt(JOptionPane.showInputDialog("Informe o código:")));
            lanchesCTR.mostrarCod(lanchesDTO);

        }

            JOptionPane.showMessageDialog(null, lanchesCTR.imprimirConta(lanchesDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: "
                    + e.getMessage());
        }
    }//Fecha metodo main
}

