/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança_Ex01;

/**
 *
 * @author Aluno
 */
public class CarroDTO extends VeiculoDTO{
    private int potencia, qtd_portas;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getQtd_portas() {
        return qtd_portas;
    }

    public void setQtd_portas(int qtd_portas) {
        this.qtd_portas = qtd_portas;
    }
}
