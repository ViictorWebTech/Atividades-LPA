package Exercicio_01;

public class FisicoCTR {

    FisicoDAO fisicoDAO = new FisicoDAO();

    public String mostrarDadosCli(FisicoDTO fisicoDTO){
        return fisicoDAO.mostrarDadosCli(fisicoDTO);
    }

    public String mostrarDadosFisi(FisicoDTO fisicoDTO){
        return fisicoDAO.mostrarDadosFisi(fisicoDTO);
    }
}
