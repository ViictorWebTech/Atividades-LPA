/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança_Ex02;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class ClienteVIEW {
    public static void main(String[] args){
        try{
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o objeto fisico.");
            FisicoDTO fisicoDTO = new FisicoDTO();
            FisicoDAO fisicoDAO = new FisicoDAO();
            FisicoCTR fisicoCTR = new FisicoCTR();

            fisicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome do cliente: "));
            fisicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
            fisicoDTO.setNumero(Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o número da casa: ")));
            fisicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
            fisicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado:"));
            fisicoDTO.setCpf(JOptionPane.showInputDialog("Informe o CPF: "));
            fisicoDTO.setRg(JOptionPane.showInputDialog("Informe o RG: "));

            JOptionPane.showMessageDialog(null, fisicoCTR.mostrarDadosCli(fisicoDTO));
            JOptionPane.showMessageDialog(null, fisicoCTR.mostrarDadosFisi(fisicoDTO));

            /**                     Separação dos objetos                         **/
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o objeto juridico.");
            JuridicoDTO juridicoDTO = new JuridicoDTO();
            JuridicoDAO juridicoDAO = new JuridicoDAO();
            JuridicoCTR juridicoCTR = new JuridicoCTR();

            juridicoDTO.setNome(JOptionPane.showInputDialog("Informe o nome do cliente: "));
            juridicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
            juridicoDTO.setNumero(Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o número da casa: ")));
            juridicoDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade: "));
            juridicoDTO.setEstado(JOptionPane.showInputDialog("Informe o estado: "));
            juridicoDTO.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ: "));
            juridicoDTO.setIe(JOptionPane.showInputDialog("Informe o IE: "));

            JOptionPane.showMessageDialog(null, juridicoCTR.mostrarDadosCli(juridicoDTO));
            JOptionPane.showMessageDialog(null, juridicoCTR.mostrarDadosJuri(juridicoDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
        }
    }
}
