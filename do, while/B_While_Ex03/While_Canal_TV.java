/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_While_Ex03;

/**
 *
 * @author Aluno
 */
public class While_Canal_TV {
    
    private String canal, resp;
    private int canal_9, canal_12, canal_23, canal_40, outro;

    public void verificar_canal(String canal) {
        this.canal = canal;
        if (canal.equalsIgnoreCase("9")) {
            canal_9++;
        } else {
            if (canal.equalsIgnoreCase("12")) {
                canal_12++;
            } else {
                if (canal.equalsIgnoreCase("23")) {
                    canal_23++;
                } else {
                    if (canal.equalsIgnoreCase("40")) {
                        canal_40++;
                    } else {
                            if (!canal.equalsIgnoreCase("0")) {
                                outro++;
                            }
                    }

                }
            }
        }
    }

    public String mostra() {
        return "O número de audiência do canal 9 é de: " + canal_9 +
                "\nO número de audiência do canal 12 é de: " + canal_12 +
                "\nO número de audiência do canal 23 é de: " + canal_23 +
                "\nO número de audiência do canal 40 é de: " + canal_40 +
                "\nO número de audiência do canal 40 é de: " + outro;

    }
}
