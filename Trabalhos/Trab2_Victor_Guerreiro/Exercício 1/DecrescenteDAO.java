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
public class DecrescenteDAO {
    private String mensagem;
    
    public String calcular(DecrescenteDTO decrescenteDTO){
        if(decrescenteDTO.getN4() >= decrescenteDTO.getN3()){
            return decrescenteDTO.getN4() + ", " + decrescenteDTO.getN3() +
                    ", " + decrescenteDTO.getN2() + ", " + decrescenteDTO.getN1() + ".";
        }
        else
            if(decrescenteDTO.getN4() >= decrescenteDTO.getN2() && decrescenteDTO.getN4() < decrescenteDTO.getN3()){
                return decrescenteDTO.getN3() + ", " + decrescenteDTO.getN4() +
                    ", " + decrescenteDTO.getN2() + ", " + decrescenteDTO.getN1() + ".";
            }
        else
            if(decrescenteDTO.getN4() >= decrescenteDTO.getN1() && decrescenteDTO.getN4() < decrescenteDTO.getN2()){
                return decrescenteDTO.getN3() + ", " + decrescenteDTO.getN2() +
                    ", " + decrescenteDTO.getN4() + ", " + decrescenteDTO.getN1() + ".";
            }
        else{
                return decrescenteDTO.getN3() + ", " + decrescenteDTO.getN2() +
                    ", " + decrescenteDTO.getN1() + ", " + decrescenteDTO.getN4() + ".";
        }
    }
}
