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

public class FisicoDAO extends ClienteDAO{
    public String mostrarDadosFisi(FisicoDTO fisicoDTO){
        return "O CPF de " + fisicoDTO.getNome() + " é " +
                fisicoDTO.getCpf() + " e o RG é " + fisicoDTO.getRg();
    }
}
