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
public class AltupesoDAO {
    private String mensagem;
    
    public String calcular(AltupesoDTO altupesoDTO){
        if(altupesoDTO.getAlt() < 120 && altupesoDTO.getPeso() <= 60){
            return "A";
        } 
        
    else
        if(altupesoDTO.getAlt() >= 120 && altupesoDTO.getAlt() < 170 && altupesoDTO.getPeso() <= 60){
            return "B";
        }
    
    else
        if(altupesoDTO.getAlt() > 170 && altupesoDTO.getPeso() <= 60){
            return "C";
        }
    
    else
        if(altupesoDTO.getAlt() < 120 && altupesoDTO.getPeso() > 60 && altupesoDTO.getPeso() <= 90){
            return "D";
        }
        
    else
        if(altupesoDTO.getAlt() >= 120 && altupesoDTO.getAlt() < 170 && altupesoDTO.getPeso() > 60 && altupesoDTO.getPeso() <= 90){
            return "E";
        }
        
    else
        if(altupesoDTO.getAlt() > 170 && altupesoDTO.getPeso() > 60 && altupesoDTO.getPeso() <= 90){
            return "F";
        }
        
    else
        if(altupesoDTO.getAlt() < 120 && altupesoDTO.getPeso() > 90){
            return "G";
        }
        
    else
        if(altupesoDTO.getAlt() >= 120 && altupesoDTO.getAlt() < 170 && altupesoDTO.getPeso() > 90){
            return "H";
        }
        
        else{
            return "I";
        }
    }
}
