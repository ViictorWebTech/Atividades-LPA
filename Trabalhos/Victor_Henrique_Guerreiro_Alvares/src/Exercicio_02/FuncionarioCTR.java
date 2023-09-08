package Exercicio_02;

public class FuncionarioCTR {

    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();


    public String mostrarDadosPesso(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.mostrarDadosPesso(funcionarioDTO);
    }

public String mostrarDadosFunc(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.mostrarDadosFunc(funcionarioDTO);
    }

    public String calcularAnosAposentadoria(FuncionarioDTO funcionarioDTO){
/*
        return funcionarioDAO.calcularAposentadoria(funcionarioDTO);
        */
        if (funcionarioDAO.calcularAposentadoria(funcionarioDTO).anosAposentadoria <= 0) {
            return "Já possui idade para aposentar-se. ";
        }else{
            return "Faltam " + anosAposentadoria + " anos para aposentar-se.";
        }//Fecha else

    }
}
