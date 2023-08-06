/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
    Você foi contratado para desenvolver um programa para
realizar uma pesquisa em uma cidade.
    A pesquisa consiste em saber a faixa salarial mensal
dos habitantes da cidade.
    A cada habitante informado, o programa deve perguntar se
você deseja informar os dados de outro habitante, deve ser
digitado o número 1 (um) caso deseje informar os dados de 
um novo habitante, ou 0 (zero) caso nao queira informar
mais nenhum dado.
    Ao escolher que não deseja mais informar os dados de outro 
habitante o sistema deve imprimir na tela:
        - a média salarial dos habitantes ouvidos
        - o percentual de homens ouvidos
        - o percentual de mulheres ouvidas
        - o percentual de mulheres que possuem salario menor ou igual a R$300,00
OBS1: O programa deve tratar o erro caso o sexo seja 
diferente de Masculino e Feminino.
*/
package B_Encapsulamento_Ex11;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class HabitantesVIEW {

    public static void main(String args[]) {
        try {
            String mensagem;
            HabitantesCTR habitantesCTR = new HabitantesCTR();
            HabitantesDTO habitantesDTO = new HabitantesDTO();

            habitantesDTO.setEntra_dados(1);
            while (habitantesDTO.getEntra_dados() != 0) {

                habitantesDTO.setSexo(
                    JOptionPane.showInputDialog(
                    "Digite o sexo do habitante"));
                habitantesDTO.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do habitante")));

                mensagem = habitantesCTR.calcularPessoas(habitantesDTO);
                if (!mensagem.equals("OK")) {
                    JOptionPane.showMessageDialog(null, mensagem);
                } //fecha if

                habitantesDTO.setEntra_dados(Integer.parseInt(JOptionPane.showInputDialog("Entra com os dados de outro habitante? \n 1-Sim | 0-Não")));

            } //fecha while

            JOptionPane.showMessageDialog(null, habitantesCTR.Imprimir(habitantesDTO));
        } //fecha try
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro 003");
        } //fecha catch
    } //fecha main	
} //fecha classe
