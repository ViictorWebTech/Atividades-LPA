package Exercicio_02;

public class AlunoCTR {
    AlunoDAO alunoDAO = new AlunoDAO();


    public String mostrarDadosPessoAlu(AlunoDTO alunoDTO){
        return alunoDAO.mostrarDadosPesso(alunoDTO) + alunoDAO.mostrarDadosAlu(alunoDTO);
    }
}
