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
/*
Foi feita uma pesquisa de audiência de canal de TV
em várias casas de uma certa cidade, num determinado dia.
Para cada casa visitada, é fornecido o número do
canal (9, 12, 23, ou 40).
    Fazer um algoritmo que:
        - leia um número indeterminado de dados,
          até que seja digitado o cancal 0(zero);
        - Calcule e mostre a quantidade de 
          audiência de cada emissora;
        - Caso seja digitado algum canal fora dos
          apresentados acima, informar como outros canais;
        - O número 0(zero) não pode ser considerado um canal.
*/
import javax.swing.JOptionPane;
public class Principal_Canal_TV {
    
    public static void main(String[] args) {
        String canal;
        While_Canal_TV while_canal_tv = new While_Canal_TV();
        canal = JOptionPane.showInputDialog("Informe o canal: ");
        
        while (!canal.equalsIgnoreCase("0")) {
            while_canal_tv.verificar_canal(canal);
            canal = JOptionPane.showInputDialog("Informe o canal: ");
        }
        JOptionPane.showMessageDialog(null, while_canal_tv.mostra());
    }
    
}
