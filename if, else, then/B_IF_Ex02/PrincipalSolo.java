/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Você está fazendo um trabalho de classificação de solo.
Após colher uma amostra e verificar a pontuação de
água presente nela, classificou a amostra em:
    Rochosa: se menos ou igual a 10 pontos de água 
    Firme: se mais de 10 pontos e menos de ou igual a 40 pontos
    Pantanosa: se mais de 40 pontos e menos ou igual a 80 pontos
    Caso seja maior que 80 pontos escrever a mensagem:
        "Quantidade de água inválida"
*/
package B_IF_Ex02;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class PrincipalSolo {
    public static void main(String argd[]) {
        Solo solo = new Solo();
        
        JOptionPane.showMessageDialog(null, "A classificação da terra é: " +
                solo.calcular(
                    Double.parseDouble(JOptionPane.showInputDialog("Digite a pontuação de água presenta na rocha: "))
                ));
    }
    
}
