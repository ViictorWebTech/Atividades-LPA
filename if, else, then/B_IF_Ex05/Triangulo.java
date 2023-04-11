/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex05;

/**
 *
 * @author Aluno
 */
public class Triangulo {
        private double ladoa, ladob, ladoc;
    private String classificacao;
    
    public String classificar(double ladoa, double ladob, double ladoc) {
    this.ladoa = ladoa;
    this.ladob = ladob;
    this.ladoc = ladoc;
    
    
    if(((ladoa + ladob) > ladoc) ||
      ((ladoa + ladoc) > ladob) ||
      ((ladob + ladoc) > ladoa) &&
      (ladoa == ladob) && (ladoa != ladoc)){
        this.classificacao = "Equilátero";
    }
    else{
        if(((ladoa + ladob) > ladoc) ||
      ((ladoa + ladoc) > ladob) ||
      ((ladob + ladoc) > ladoa) &&
      (ladoa + ladob) && (ladoa == ladob) && (ladoa != ladoc)){
        this.classificacao = "Isósceles";
    }
            else{
        if(((ladoa + ladob) > ladoc) ||
      ((ladoa + ladoc) > ladob) ||
      ((ladob + ladoc) > ladoa) &&
      (ladoa == ladob) && (ladoa == ladoc)){
        this.classificacao = "Equilátero";
    }
        
            return null;
    
    }
}
