/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_FOR_Ex03;

/**
 *
 * @author Aluno
 */
public class NumeroSoma {

    private int numero, soma;

    public void soma_Numero(int numero) {
        this.numero = numero;
        this.soma += numero;

    }

    public int mostra_Soma() {
        return soma;
    }

}
