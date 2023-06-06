/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

/**
 *
 * @author Aluno
 */
public class CrescenteCTR {

   CrescenteDAO crescenteDAO = new CrescenteDAO();

    public String calcular(CrescenteDTO crescenteDTO) {
        return crescenteDAO.calcular(crescenteDTO);
    }

}
