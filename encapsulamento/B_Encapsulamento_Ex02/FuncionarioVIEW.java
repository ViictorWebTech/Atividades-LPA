/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Encapsulamento_Ex02;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class FuncionarioVIEW {

    public static void main(String args[]) {
        try {
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
            FuncionarioCTR funcionarioCTR = new FuncionarioCTR();

            funcionarioDTO.setCodigo(
                    Integer.parseInt(
                            JOptionPane.showInputDialog("Digite o código")));
            funcionarioDTO.setTelefone(
                    JOptionPane.showInputDialog("Digite o Telefone"));

            JOptionPane.showMessageDialog(null,
                    funcionarioCTR.imprimir(funcionarioDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro no sistema: " + e.getMessage());
        }
    }//Fecha main
}//Fecha classe
