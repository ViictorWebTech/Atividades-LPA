/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

/**
 *
 * @author Aluno
 */
public class CrescenteDAO {

    private String mensagem;

    public String calcular(CrescenteDTO crescenteDTO) {
        if ((crescenteDTO.getNum1() > crescenteDTO.getNum2()) && (crescenteDTO.getNum2() > crescenteDTO.getNum3())) {
            this.mensagem = "A ordem crescente é: " + crescenteDTO.getNum3() + ", " + crescenteDTO.getNum2() + ", " + crescenteDTO.getNum1();
        } else {
            if ((crescenteDTO.getNum1() > crescenteDTO.getNum2()) && (crescenteDTO.getNum2() < crescenteDTO.getNum3())) {
                this.mensagem = "A ordem crescente é: " + crescenteDTO.getNum2() + ", " + crescenteDTO.getNum3() + ", " + crescenteDTO.getNum1();
            } else {
                if ((crescenteDTO.getNum1() < crescenteDTO.getNum2()) && (crescenteDTO.getNum2() > crescenteDTO.getNum3())) {
                    this.mensagem = "A ordem crescente é: " + crescenteDTO.getNum1() + ", " + crescenteDTO.getNum3() + ", " + crescenteDTO.getNum2();
                } else {
                    if ((crescenteDTO.getNum1() < crescenteDTO.getNum2()) && (crescenteDTO.getNum2() < crescenteDTO.getNum3())) {
                        this.mensagem = "A ordem crescente é: " + crescenteDTO.getNum1() + ", " + crescenteDTO.getNum2() + ", " + crescenteDTO.getNum3();
                    }

                }
            }
        }
        return this.mensagem;
    }

}
