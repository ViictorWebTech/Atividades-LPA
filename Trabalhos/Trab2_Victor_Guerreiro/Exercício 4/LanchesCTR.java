/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4;

/**
 *
 * @author Aluno
 */
public class LanchesCTR {

   LanchesDAO lanchesDAO = new LanchesDAO();

    public void mostrarCod(LanchesDTO lanchesDTO) {
        lanchesDAO.mostrarCod(lanchesDTO);
    }

    public String imprimirConta(LanchesDTO lanchesDTO) {

        return lanchesDAO.imprimirConta(lanchesDTO);
    }
}
