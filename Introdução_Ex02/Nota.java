/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introdução_Ex02;

/**
 *
 * @author Aluno
 */
public class Nota {
    
    private double n1, n2, n3, p1, p2, p3, media;
    
    public double calcularMedia(double n1, double n2, double n3, double p1, double p2, double p3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        
        //this.media = ((this.n1 * this.p1)+(this.n2 * this.p2)+(this.n3 * this.p3))/(this.p1 + this.p2 + this.p3);
        this.media = (n1 * p1 / 10) + (n2 * p2 / 10) + (n3 * p3 / 10);
        return this.media;
 
    }
}//Fecha classe

























































































