package Exercicio_01;

public class JuridicoCTR{
    JuridicoDAO juridicoDAO = new JuridicoDAO();

    public String mostrarDadosCliJuri(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostrarDadosCli(juridicoDTO) + juridicoDAO.mostrarDadosJuri(juridicoDTO);
    }

}
