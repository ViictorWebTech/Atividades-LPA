/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

/**
 *
 * @author Aluno
 */
public class DecrescenteCTR {
    DecrescenteDAO decrescenteDAO = new DecrescenteDAO();
    
    public String calcular(DecrescenteDTO decrescenteDTO){
        return decrescenteDAO.calcular(decrescenteDTO);
    }
}
