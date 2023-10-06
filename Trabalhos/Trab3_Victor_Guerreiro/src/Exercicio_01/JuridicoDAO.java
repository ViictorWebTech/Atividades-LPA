package Exercicio_01;

public class JuridicoDAO extends ClienteDAO{

    public String mostrarDadosJuri(JuridicoDTO juridicoDTO){
        return "\n O CNPJ de " + juridicoDTO.getNome() + " é " +
                juridicoDTO.getCnpj() + " e a IE é " + juridicoDTO.getIe();
    }
}
