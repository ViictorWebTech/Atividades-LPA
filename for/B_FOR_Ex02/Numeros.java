/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_FOR_Ex02;

/**
 *
 * @author Aluno
 */
public class Numeros {

    private int n1, n2;
    private String imprimir = "";

    public String calcular(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        
        for (int cont = n1; cont <= n2; cont++) {
            this.imprimir += cont + " | ";
        }
        return imprimir;
    }
}
