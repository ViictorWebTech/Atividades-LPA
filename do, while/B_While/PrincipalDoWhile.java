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
import javax.swing.JOptionPane;
public class PrincipalDoWhile {
    public static void main(String[] args) {
        int numero;
        ExemploDoWhile exemplodowhile = new ExemploDoWhile();
        
        do{
            numero = Integer.parseInt(
            JOptionPane.showInputDialog("Informe o número"));
            exemplodowhile.somar(numero);
        }while(numero != 0);
        
        JOptionPane.showMessageDialog(null, exemplodowhile.mostra());
        }
    }

