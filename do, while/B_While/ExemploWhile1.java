/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_While;

/**
 *
 * @author Aluno
 */
public class ExemploWhile1 {

    private int soma, numero;

    public void somar(int numero) {
        this.numero = numero;
        this.soma += numero;
    }

    public int mostra() {
        return soma;
    }
}
