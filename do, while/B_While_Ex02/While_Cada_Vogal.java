/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_While_Ex02;

/**
 *
 * @author Aluno
 */
public class While_Cada_Vogal {

    private String letra, resp;
    private int a, e, i, o, u, consoante;

    public void verificar_letra(String letra) {
        this.letra = letra;
        if (letra.equalsIgnoreCase("a")) {
            a++;
        } else {
            if (letra.equalsIgnoreCase("e")) {
                e++;
            } else {
                if (letra.equalsIgnoreCase("i")) {
                    i++;
                } else {
                    if (letra.equalsIgnoreCase("o")) {
                        o++;
                    } else {
                        if (letra.equalsIgnoreCase("u")) {
                            u++;
                        } else {
                            if (!letra.equalsIgnoreCase("0")) {
                                consoante++;
                            }
                        }
                    }

                }
            }
        }
    }

    public String mostra() {
        return "A quantidade de vogais A é de: " + a +
                "\nA quantidade de vogais E é de: " + e +
                "\nA quantidade de vogais I é de: " + i +
                "\nA quantidade de vogais O é de: " + o +
                "\nA quantidade de vogais U é de: " + u +
                "\nA quantidade de consoantes é de: " + consoante;

    }
}
