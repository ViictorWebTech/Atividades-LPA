package Exercicio_02;

public class FuncionarioCTR {

    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();


    public String mostrarDadosPessoFunc(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.mostrarDadosPesso(funcionarioDTO) + funcionarioDAO.mostrarDadosFunc(funcionarioDTO);
    }


    public String calcularAnosAposentadoria(FuncionarioDTO funcionarioDTO){
 return funcionarioDAO.resultadoAposentadoria(funcionarioDTO);


    }
}
