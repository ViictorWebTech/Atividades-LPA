package Exercicio_02;

public class AlunoDAO extends PessoaDAO{

    public String mostrarDadosAlu(AlunoDTO alunoDTO){
        return "\n O prontuário de " + alunoDTO.getNome() + " é " +
                alunoDTO.getProntuario() + " e o curso é " + alunoDTO.getCurso();
    }
}
