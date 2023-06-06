/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

/**
 *
 * @author Aluno
 */
public class AltupesoCTR {
    AltupesoDAO altupesoDAO = new AltupesoDAO();
    
    public String calcular(AltupesoDTO altupesoDTO){
        return altupesoDAO.calcular(altupesoDTO);
    }
}
