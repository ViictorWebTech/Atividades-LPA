/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_FOR_Ex06;

/**
 *
 * @author Aluno
 */
public class Maior_Menor_Numero {

    private double numero, maior, menor;

    public double calcular_Numero(double numero) {
        this.numero = numero;
        this.maior = maior;
        this.menor = menor;

        if (numero > numero) {
            maior = numero;

            return maior;
        }//Fecha IF 1
        else {
            if (numero < numero) {
                menor = numero;
                
                return menor;

            }//Fecha IF 2

        }//Fecha else

    }//Fecha void

}//Fecha class
