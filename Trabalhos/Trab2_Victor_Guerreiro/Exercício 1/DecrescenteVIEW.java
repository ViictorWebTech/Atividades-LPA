/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import javax.swing.JOptionPane;
public class DecrescenteVIEW {
    public static void main(String[] args){
        try{
        DecrescenteDTO decrescenteDTO = new DecrescenteDTO();
        DecrescenteCTR decrescenteCTR = new DecrescenteCTR();
    
        decrescenteDTO.setN1(Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: ")));
        decrescenteDTO.setN2(Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: ")));
        decrescenteDTO.setN3(Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número: ")));
        decrescenteDTO.setN4(Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto número: ")));
        
        JOptionPane.showMessageDialog(null, decrescenteCTR.calcular(decrescenteDTO));
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO NO SISTEMA: " + e.getMessage());
        }
    }
}
