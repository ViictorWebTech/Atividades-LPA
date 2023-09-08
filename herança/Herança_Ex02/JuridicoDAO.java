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

public class JuridicoDAO extends ClienteDAO{

    public String mostrarDadosJuri(JuridicoDTO juridicoDTO){
        return "O cnpj de " + juridicoDTO.getNome() + " é " +
                juridicoDTO.getCnpj() + " e o IE é " + juridicoDTO.getIe();
    }
}
