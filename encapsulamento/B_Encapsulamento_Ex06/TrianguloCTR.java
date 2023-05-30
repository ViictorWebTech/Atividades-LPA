/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Encapsulamento_Ex06;

/**
 *
 * @author Aluno
 */
public class TrianguloCTR {
  
    TrianguloDAO trianguloDAO = new TrianguloDAO();

    public String classificar(TrianguloDTO trianguloDTO) {
        return trianguloDAO.classificar(trianguloDTO);
    }
  
}
