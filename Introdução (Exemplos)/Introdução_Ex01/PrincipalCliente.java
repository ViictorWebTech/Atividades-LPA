/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introdução_Ex01;

import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class PrincipalCliente {
    
    public static void main(String[] args) {
    
        Cliente cliente = new Cliente();

        System.out.println("=== Chamando os métodos do objeto ===\n");
        
        cliente.mostrar(JOptionPane.showInputDialog("Informe o nome"),
                        JOptionPane.showInputDialog("Informe o RG"));
        
        cliente.mostrarNome(JOptionPane.showInputDialog("Informe o nome 2"));
    
        System.out.println("=== Fim da chamada ao métodos do objeto ===\n");
    
    }//Fecha main
}//Fecha classe
