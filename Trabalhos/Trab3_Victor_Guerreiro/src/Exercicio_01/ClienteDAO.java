package Exercicio_01;

public class ClienteDAO {

    public String mostrarDadosCli(ClienteDTO clienteDTO){
        return "O NOME do cliente é "+ clienteDTO.getNome() +
                "\n O ENDEREÇO de " + clienteDTO.getNome() + " é " + clienteDTO.getEndereco() + ", " + clienteDTO.getNumero()
                + "\n Na cidade de " + clienteDTO.getCidade() +
                "\n No estado de " + clienteDTO.getEstado();
    }// fecha classe
} // fecha DAO
