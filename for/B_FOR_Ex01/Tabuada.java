/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_FOR_Ex01;

/**
 *
 * @author Aluno
 */
public class Tabuada {
    private int numero;
    private String imprimir="";
    public String calcular_Tabuada(int numero) {
        this.numero = numero;
        
        for(int cont=1; cont<=10; cont++){
            this.imprimir = imprimir + "\n" + cont + " x " + numero + " = " + 
                    cont*numero;
        }
        return imprimir;
    }
}
