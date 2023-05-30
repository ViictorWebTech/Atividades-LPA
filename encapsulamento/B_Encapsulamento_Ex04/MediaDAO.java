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
public class MediaDAO {

    private String mensagem;
    private double media;

    public String calcular(MediaDTO mediaDTO) {
        this.media = ((mediaDTO.getN1() + mediaDTO.getN2()) / 2);
        if (media >= 7) {
            this.mensagem = "A média final é: " + media + "O aluno está aprovado";
        } else {
            this.mensagem = "A média final é: " + media + "O aluno está reprovado";
        }
        return this.mensagem;
    }
}
