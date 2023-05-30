/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Encapsulamento_Ex05;

/**
 *
 * @author Aluno
 */
public class SoloDAO {

    private String mensagem;

    public String classificar(SoloDTO soloDTO) {
        if (soloDTO.getPontos() <= 10) {
            this.mensagem = "A quantidade de pontos de água é de: " + soloDTO.getPontos() + ". A classificação do solo é ROCHOSA";
        } else {
            if ((soloDTO.getPontos() > 10) && (soloDTO.getPontos() <= 40)) {
                this.mensagem = "A quantidade de pontos de água é de: " + soloDTO.getPontos() + ". A classificação do solo é FIRME";
            } else {
                if ((soloDTO.getPontos() > 40) && (soloDTO.getPontos() <= 80)) {
                    this.mensagem = "A quantidade de pontos de água é de: " + soloDTO.getPontos() + ". A classificação do solo é PANTANOSA";
                } else {
                    if (soloDTO.getPontos() > 80) {
                        this.mensagem = "Quantidade de água inválida";
                    }
                }
            }
        }
        return this.mensagem;
    }
}
