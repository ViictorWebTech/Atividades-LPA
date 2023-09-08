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
public class ClienteDAO {

    public String mostrarDadosCli(ClienteDTO clienteDTO){
        return "O nome do cliente é "+ clienteDTO.getNome() +
                "\n O endereço do " + clienteDTO.getNome() + " é " + clienteDTO.getEndereco() + " , " + clienteDTO.getNumero()
                + "\n Na cidade " + clienteDTO.getCidade() +
                "\n No estado " + clienteDTO.getEstado();
    }// fecha classe
} // fecha DAO
