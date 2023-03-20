/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introdução_Ex04;

/**
 *
 * @author Aluno
 */
public class Salario_Vendas {
        private double sal, sal_f, vendas, comissao;
    
    public String calcularSalvendas(double sal, double vendas){
        this.sal = sal;
        this.vendas = vendas;
        
        this.comissao = vendas * 4/100;
        
        this.sal_f = this.comissao + this.sal;
        
        return "O valor da comissão é: " + this.comissao +
                "\nO salário final do funcionário é: " + this.sal_f;
        
    }//Fecha calcularSalvendas

}//Fecha classe
