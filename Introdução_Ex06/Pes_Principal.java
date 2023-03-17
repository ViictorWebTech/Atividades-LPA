/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Faça um programa que receba uma medida em pés.
Faça as conversões a seguir e mostre os resultados.
a) polegadas
b) jardas
c) milhas
Sabe-se que:
1 pé = 12 polegadas
1 jarda = 3 pés
1 milha = 1760

https://brainly.com.br/tarefa/29104895
*/
package Introdução_Ex06;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;

public class Pes_Principal {
    
    public static void main(String[] args) {
        
        Pes pes = new Pes();
        JOptionPane.showMessageDialog(null, pes.calculaPes(
        Double.parseDouble(JOptionPane.showInputDialog("Informe o número de pés: "))
                ));
        
        
        
    }                                                                                                                                   
}
