package Exercicio_02;

import Exercicio_01.ClienteDTO;

public class PessoaDAO {
    public String mostrarDadosPesso(PessoaDTO pessoaDTO){
        return "O NOME da pessoa é "+ pessoaDTO.getNome() +
                "\n O ENDEREÇO de " + pessoaDTO.getNome() + " é " + pessoaDTO.getEndereco()
                + "\n O TELEFONE é " + pessoaDTO.getTelefone() +
                "\n A IDADE é " + pessoaDTO.getIdade();
    }// fecha classe
} // fecha DAO
