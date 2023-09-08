package Exercicio_01;

public class FisicoDAO extends ClienteDAO{
    public String mostrarDadosFisi(FisicoDTO fisicoDTO){
        return "\n O CPF de " + fisicoDTO.getNome() + " é " +
                fisicoDTO.getCpf() + " e o RG é " + fisicoDTO.getRg();
    }
}
