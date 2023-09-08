package Exercicio_02;

import javax.swing.JOptionPane;
public class PessoaVIEW {
    public static void main(String[] args){
        try{
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o Funcionário");
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            FuncionarioCTR funcionarioCTR = new FuncionarioCTR();

            funcionarioDTO.setNome(JOptionPane.showInputDialog("Informe o nome do funcionário:"));
            funcionarioDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
            funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Informe o número de telefone: "));
            funcionarioDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do funcionário: ")));
            funcionarioDTO.setSiape(JOptionPane.showInputDialog("Informe o SIAPE: "));
            funcionarioDTO.setFuncao(JOptionPane.showInputDialog("Informe a função do funcionário: "));

            JOptionPane.showMessageDialog(null, funcionarioCTR.mostrarDadosPesso(funcionarioDTO));
            JOptionPane.showMessageDialog(null,funcionarioCTR.mostrarDadosFunc(funcionarioDTO));
            JOptionPane.showMessageDialog(null, funcionarioCTR.calcularAnosAposentadoria(funcionarioDTO));


            /*                     Separação dos objetos                         **/
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o objeto Aluno.");
            AlunoDTO alunoDTO = new AlunoDTO();
            AlunoDAO alunoDAO = new AlunoDAO();
            AlunoCTR alunoCTR = new AlunoCTR();

            alunoDTO.setNome(JOptionPane.showInputDialog("Informe o nome do aluno: "));
            alunoDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
            alunoDTO.setTelefone(JOptionPane.showInputDialog("Informe o número de telefone: "));
            alunoDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do aluno: ")));
            alunoDTO.setProntuario(JOptionPane.showInputDialog("Informe o prontuário: "));
            alunoDTO.setCurso(JOptionPane.showInputDialog("Informe o curso: "));

            JOptionPane.showMessageDialog(null, alunoCTR.mostrarDadosPesso(alunoDTO));
            JOptionPane.showMessageDialog(null, alunoCTR.mostrarDadosAlu(alunoDTO));
        }//Fecha try
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
        }
    }
}
