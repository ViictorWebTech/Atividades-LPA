/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_FOR_Ex04;

/**
 *
 * @author Aluno
 */
public class Altura_10_Pessoas {

    private int maiores;
    private double altura, media;

    public void calcular_Altura(double altura) {
        this.altura = altura;
        this.media += altura / 10;
        this.maiores = maiores;

        if (altura > 2) {
            this.maiores += 1;
        }//Fecha IF 1

    }

    public double mostra_Media() {
        return media;
    }

    public int mostra_Maiores() {
        return maiores;
    }

}
