/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Encapsulamento_Ex01;

/**
 *
 * @author Aluno
 */
public class ClienteDAO {
    
    public String mostrarNomeRg(ClienteDTO clienteDTO) {
        return "O nome informado foi: "
                + clienteDTO.getNome() + "\n O RG informado foi: "
                + clienteDTO.getRg();
    }
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO) {
        return "O nome informado foi: "
                + clienteDTO.getNome()
                + "\n A idade informada foi: " + clienteDTO.getIdade();
    }
}//Fecha classe ClienteDAO
