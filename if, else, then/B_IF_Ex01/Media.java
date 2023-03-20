/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex01;

/**
 *
 * @author Aluno
 */
public class Media {
    private double num1, num2, media;
    private String resposta;
    
        public String calcular(double num1, double num2){
            this.num1 = num1;
            this.num2 = num2;
            this.media = (num1 + num2)/2;
            
            if(media >= 6){
              this.resposta = "Aprovado";  
            }
            else{
                if((media >= 4) && (media <6)){
                    this.resposta = "Recuperação";
                }
                else{
                    this.resposta = "Reprovado";
                }
            }
        return this.resposta;
        }
}
        

