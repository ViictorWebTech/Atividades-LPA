/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex04;

/**
 *
 * @author Aluno
 */
public class Altura_Peso_Classificacao {

    private double altura, peso;
    private String classificacao;

    public String classificar(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;

        if ((altura < 120) && (peso <= 60)) {
            this.classificacao = "A";
        }//Fecha IF 1
        else {
            if ((altura < 120) && (peso > 60) && (peso <= 90)) {
                this.classificacao = "D";
            }//Fecha IF 2
            else {
                if ((altura < 120) && (peso > 90)) {
                    this.classificacao = "G";
                }//Fecha IF 3
                else {
                    if ((altura >= 120) && (altura < 170) && (peso <= 60)) {
                        this.classificacao = "B";
                    }//Fecha IF 4
                    else {
                        if ((altura >= 120) && (altura < 170) && (peso > 60) && (peso < 90)) {
                            this.classificacao = "E";
                        }//Fecha IF 5
                        else {
                            if ((altura >= 120) && (altura < 170) && (peso > 90)) {
                                this.classificacao = "H";
                            }//Fecha IF 6
                            else {
                                if ((altura >= 170) && (peso <= 60)) {
                                    this.classificacao = "C";
                                }//Fecha IF 7
                                else {
                                    if ((altura >= 170) && (peso > 60) && (peso <= 90)) {
                                        this.classificacao = "F";
                                    }//Fecha IF 8
                                    else {
                                        if ((altura >= 170) && (peso > 90)) {
                                            this.classificacao = "I";
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
        return "A sua classificação é: " + this.classificacao;

    }

}
