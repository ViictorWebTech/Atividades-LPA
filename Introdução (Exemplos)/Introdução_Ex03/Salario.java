/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* 
Faça um programa que receba o salário de um funcionárioe a porcentagem de aumento.
Calcule e mostre  o salário final.
*/

package Introdução_Ex03;

/**
 *
 * @author Aluno
 */
public class Salario {
    private double sal, sal_f, aumento;
    
    public double calcularSalario(double sal, double aumento){
        this.sal = sal;
        this.aumento = aumento;
        this.sal_f = this.sal + (this.sal*this.aumento/100);
        
        return sal_f;
    }//Fecha calcularSalario
}//Fecha classe
