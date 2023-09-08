package Exercicio_01;


import javax.swing.JOptionPane;

public class ClienteVIEW {
    public static void main(String[] args){
        try{
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o Cliente Físico.");
            FisicoDTO fisicoDTO = new FisicoDTO();
            FisicoDAO fisicoDAO = new FisicoDAO();
            FisicoCTR fisicoCTR = new FisicoCTR();

            fisicoDTO.setNome(JOptionPane.showInputDialog("Informe o NOME do cliente: "));
            fisicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
            fisicoDTO.setNumero(Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o NÚMERO DA CASA: ")));
            fisicoDTO.setCidade(JOptionPane.showInputDialog("Informe a CIDADE: "));
            fisicoDTO.setEstado(JOptionPane.showInputDialog("Informe o ESTADO:"));
            fisicoDTO.setCpf(JOptionPane.showInputDialog("Informe o CPF: "));
            fisicoDTO.setRg(JOptionPane.showInputDialog("Informe o RG: "));

            JOptionPane.showMessageDialog(null, fisicoCTR.mostrarDadosCliFi(fisicoDTO));

            /*                     Separação dos objetos                         **/
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o Cliente Jurídico.");
            JuridicoDTO juridicoDTO = new JuridicoDTO();
            JuridicoDAO juridicoDAO = new JuridicoDAO();
            JuridicoCTR juridicoCTR = new JuridicoCTR();

            juridicoDTO.setNome(JOptionPane.showInputDialog("Informe o NOME do cliente: "));
            juridicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
            juridicoDTO.setNumero(Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o NÚMERO DA CASA: ")));
            juridicoDTO.setCidade(JOptionPane.showInputDialog("Informe a CIDADE: "));
            juridicoDTO.setEstado(JOptionPane.showInputDialog("Informe o ESTADO: "));
            juridicoDTO.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ: "));
            juridicoDTO.setIe(JOptionPane.showInputDialog("Informe a IE: "));

            JOptionPane.showMessageDialog(null, juridicoCTR.mostrarDadosCliJuri(juridicoDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
        }
    }
}
