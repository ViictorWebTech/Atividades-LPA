/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_FOR_Ex05;

/**
 *
 * @author Aluno
 */
public class Salario_Atual {
    
    private int ano_atual;
    private double salario, novo_salario, percentual;

    public double calcular_Salario(int ano_atual) {
        this.ano_atual = ano_atual;
        this.salario = 1000;
        this.percentual = 1.5;
        
        this.novo_salario = salario + (salario * (percentual / 100));
        
        for(int cont = 1997; cont <=ano_atual; cont++){
            percentual = percentual  * 2;
            novo_salario = novo_salario + (novo_salario * (percentual / 100));
        }//Fecha FOR
        return novo_salario;
    }//Fehca método

    }//Fecha classe

