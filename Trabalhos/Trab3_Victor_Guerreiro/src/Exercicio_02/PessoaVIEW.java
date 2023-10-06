package Exercicio_02;

import javax.swing.JOptionPane;
public class PessoaVIEW {
    public static void main(String[] args){
        try{
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o Funcionário");
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            FuncionarioCTR funcionarioCTR = new FuncionarioCTR();

            funcionarioDTO.setNome(JOptionPane.showInputDialog("Informe o NOME do funcionário:"));
            funcionarioDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
            funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Informe o NÚMERO DE TELEFONE: "));
            funcionarioDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a IDADE do funcionário: ")));
            funcionarioDTO.setSiape(JOptionPane.showInputDialog("Informe o SIAPE: "));
            funcionarioDTO.setFuncao(JOptionPane.showInputDialog("Informe a FUNÇÃO DO FUNCIONÁRIO: "));

            JOptionPane.showMessageDialog(null, funcionarioCTR.mostrarDadosPessoFunc(funcionarioDTO));
            JOptionPane.showMessageDialog(null, funcionarioCTR.calcularAnosAposentadoria(funcionarioDTO));


            /*                     Separação dos objetos                         **/
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o Aluno.");
            AlunoDTO alunoDTO = new AlunoDTO();
            AlunoDAO alunoDAO = new AlunoDAO();
            AlunoCTR alunoCTR = new AlunoCTR();

            alunoDTO.setNome(JOptionPane.showInputDialog("Informe o NOME do aluno: "));
            alunoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
            alunoDTO.setTelefone(JOptionPane.showInputDialog("Informe o NÚMERO DE TELEFONE: "));
            alunoDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a IDADE do aluno: ")));
            alunoDTO.setProntuario(JOptionPane.showInputDialog("Informe o PRONTUÁRIO: "));
            alunoDTO.setCurso(JOptionPane.showInputDialog("Informe o CURSO: "));

            JOptionPane.showMessageDialog(null, alunoCTR.mostrarDadosPessoAlu(alunoDTO));
        }//Fecha try
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
        }
    }
}
