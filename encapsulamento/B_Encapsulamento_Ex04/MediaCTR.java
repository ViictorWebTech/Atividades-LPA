/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Encapsulamento_Ex04;

/**
 *
 * @author Aluno
 */
public class MediaCTR {

    MediaDAO mediaDAO = new MediaDAO();

    public String calcular(MediaDTO mediaDTO) {
        return mediaDAO.calcular(mediaDTO);
    }

}
