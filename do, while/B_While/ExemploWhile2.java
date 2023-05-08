/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_While;

/**
 *
 * @author Aluno
 */
public class ExemploWhile2 {
    private String letra;
    private int qtd;
    
    public void verificar(String letra){
        this.letra = letra;
        if(letra.equalsIgnoreCase("x")){
            this.qtd++;
        }
    }
    public int mostra(){
        return qtd;
    }
}
