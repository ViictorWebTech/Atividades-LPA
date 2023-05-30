/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Encapsulamento_Ex03;

/**
 *
 * @author Aluno
 */
public class MotoristaDAO {

    private String mensagem;

    public String calcular(MotoristaDTO motoristaDTO) {
        if (motoristaDTO.getIdade() >= 18) {
            this.mensagem = "O motorista pode ter CNH";
        } else {
            this.mensagem = "O motorista NÂO pode ter CNH";
        }
        return this.mensagem;
    }
}
