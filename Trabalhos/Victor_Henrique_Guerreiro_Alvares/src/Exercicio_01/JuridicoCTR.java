package Exercicio_01;

public class JuridicoCTR{
    JuridicoDAO juridicoDAO = new JuridicoDAO();

    public String mostrarDadosCli(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostrarDadosCli(juridicoDTO);
    }
    public String mostrarDadosJuri(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostrarDadosJuri(juridicoDTO);
    }
}
