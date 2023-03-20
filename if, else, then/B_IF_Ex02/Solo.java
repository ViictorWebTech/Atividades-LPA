/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_Ex02;

/**
 *
 * @author Aluno
 */
public class Solo {
    private double solo;
    private String resultado;
    
        public String calcular(double solo){
            this.solo = solo;
            
            if(solo <= 10){
                this.resultado = "Rochosa";
            }
            else{
                if((solo > 10) && (solo <= 40)){
                    this.resultado = "Firme";
                }
                else{
                    if((solo > 40) && (solo <= 80)){
                        this.resultado = "Pantanosa";
                    }
                    else{
                        this.resultado = "Quantidade de água inválida";
                    }
                }
            }
        return this.resultado;
        }
}
