package Exercicio_02;

public class AlunoCTR {
    AlunoDAO alunoDAO = new AlunoDAO();


    public String mostrarDadosPesso(AlunoDTO alunoDTO){
        return alunoDAO.mostrarDadosPesso(alunoDTO);
    }
    public String mostrarDadosAlu(AlunoDTO alunoDTO){
        return alunoDAO.mostrarDadosAlu(alunoDTO);
    }
}
