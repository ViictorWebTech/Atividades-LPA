/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex03;

/**
 *
 * @author Aluno
 */
public class Quatro_Numeros_Ordem_Crescente {
    private int num1, num2, num3, num4;
    private String resultado;
    
        public String ordem(int num1, int num2, int num3, int num4){
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
            this.num4 = num4;
            
            if(num4 >= num3){
                this.resultado = "A ordem decrescente é: " +
                        num4 + " - " + num3 + " - " +
                        num2 + " - " + num1;
            }//Fecha IF 1
            else{
                if((num4 >= num2) && (num4 < num3)){
                    this.resultado = "A ordem decrescente é: " +
                            num3 + " - " + num4 + " - " +
                            num2 + " - " + num1;
                }//Fecha IF 2
                else{
                    if((num4 >= num1) && (num4 < num2)){
                        this.resultado = "A ordem decrescente é: " +
                                num3 + " - " + num2 + " - " +
                                num4 + " - " + num1;
                    }//Fecha IF 3
                    else{
                        this.resultado = "A ordem decrescente é: " + 
                                num3 + " - " + num2 + " - " +
                                num1 + " - " + num4;
                    }//Fecha else 3
                }//Fecha else 2
            }//Fecha else 1
        return this.resultado;
        }
}
