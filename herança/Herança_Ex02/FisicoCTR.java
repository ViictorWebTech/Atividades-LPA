/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança_Ex02;

/**
 *
 * @author Aluno
 */

public class FisicoCTR {

    FisicoDAO fisicoDAO = new FisicoDAO();

    public String mostrarDadosCli(FisicoDTO fisicoDTO){
        return fisicoDAO.mostrarDadosCli(fisicoDTO);
    }

    public String mostrarDadosFisi(FisicoDTO fisicoDTO){
        return fisicoDAO.mostrarDadosFisi(fisicoDTO);
    }
}
