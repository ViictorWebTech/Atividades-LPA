/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Encapsulamento_Ex06;

/**
 *
 * @author Aluno
 */
public class TrianguloDAO {

    private String mensagem;
    public double l1, l2, l3;

    public String classificar(TrianguloDTO trianguloDTO) {
        l1 = trianguloDTO.getLadoA();
        l2 = trianguloDTO.getLadoB();
        l3 = trianguloDTO.getLadoC();

        if ((l1 + l2 > l3) && (l1 + l3 < l2) && (l3 + l2 > l1)) {
            if ((l1 == l2) && (l2 == l3)) {
                this.mensagem = "Triângulo equilátero.";
            } else if (((l1 == l2) && (l2 != l3)) || ((l1 == l3) && (l2 != l3)) || ((l2 == l3) && (l2 != l1))) {
                this.mensagem = "Triângulo Isósceles.";
            } else {
                this.mensagem = "Triângulo Escaleno";
            }
        } else {
            this.mensagem = "Não é um triângulo.";
        }
        return this.mensagem;
    }

}
