/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4;

import java.text.DecimalFormat;

/**
 *
 * @author Aluno
 */
public class LanchesDAO {

    boolean valida;
    String conta;
    DecimalFormat decimalformat = new DecimalFormat("#,###.00");

    public void mostrarCod(LanchesDTO lanchesDTO) {
        try {
            valida = true;
            if (lanchesDTO.getCod() == 1) {
                lanchesDTO.setC1(lanchesDTO.getC1() + 1);
                lanchesDTO.setVt(lanchesDTO.getVt() + 1.50);
            } else if (lanchesDTO.getCod() == 2) {
                lanchesDTO.setC2(lanchesDTO.getC2() + 1);
                lanchesDTO.setVt(lanchesDTO.getVt() + 1.80);
            } else if (lanchesDTO.getCod() == 3) {
                lanchesDTO.setC3(lanchesDTO.getC3() + 1);
                lanchesDTO.setVt(lanchesDTO.getVt() + 1.20);
            } else if (lanchesDTO.getCod() == 4) {
                lanchesDTO.setC4(lanchesDTO.getC4() + 1);
                lanchesDTO.setVt(lanchesDTO.getVt() + 2.00);
            } else if (lanchesDTO.getCod() == 5) {
                lanchesDTO.setC5(lanchesDTO.getC5() + 1);
                lanchesDTO.setVt(lanchesDTO.getVt() + 1.00);
            } else if (lanchesDTO.getCod() != 0) {
                valida = false;
            }
        } /* Fecha try */


        catch (Exception e) {
            System.out.println("Erro 01");
        }  /* Fecha catch */

    }  /* Fecha método */


    public String imprimirConta(LanchesDTO lanchesDTO) {
        try {

            this.conta = "\n===========================================";
            this.conta += "\nProduto     | Quantidade    | Valor     ";
            this.conta += "\n===========================================";

            if (lanchesDTO.getC1() >= 1) {
                this.conta += "\nHamburger           " + lanchesDTO.getC1() + "               R$" + lanchesDTO.getC1() * 1.50;
            }
            if (lanchesDTO.getC2() >= 1) {
                this.conta += "\nCheeseburger     " + lanchesDTO.getC2() + "               R$" + lanchesDTO.getC2() * 1.80;
            }
            if (lanchesDTO.getC3() >= 1) {
                this.conta += "\nMisto Quente     " + lanchesDTO.getC3() + "               R$" + lanchesDTO.getC3() * 1.20;
            }
            if (lanchesDTO.getC4() >= 1) {
                this.conta += "\nAmericano           " + lanchesDTO.getC4() + "               R$" + lanchesDTO.getC4() * 2.00;
            }
            if (lanchesDTO.getC5() >= 1) {
                this.conta += "\nQueijo Prato        " + lanchesDTO.getC5() + "               R$" + lanchesDTO.getC5() * 1.0;
            }

            this.conta += "\n===========================================";
            this.conta += "\nTotal:   R$" + decimalformat.format(lanchesDTO.getVt());
        } /* Fecha try */

        catch (Exception e) {
            System.out.println("Erro 02");
        }  /* Fecha catch */

        return this.conta;
    }  /* Fecha metodo */
}  /* Fecha classe */

