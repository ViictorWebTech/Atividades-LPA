/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Encapsulamento_Ex05;

/**
 *
 * @author Aluno
 */
public class SoloCTR {

    SoloDAO soloDAO = new SoloDAO();

    public String classificar(SoloDTO soloDTO) {
        return soloDAO.classificar(soloDTO);
    }

}
