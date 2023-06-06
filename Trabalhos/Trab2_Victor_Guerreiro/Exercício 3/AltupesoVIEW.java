/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

import javax.swing.JOptionPane;
public class AltupesoVIEW {
    public static void main(String[] args){
        try{
        AltupesoDTO altupesoDTO = new AltupesoDTO();
        AltupesoCTR altupesoCTR = new AltupesoCTR();
    
        altupesoDTO.setAlt(Integer.parseInt(JOptionPane.showInputDialog("Informe a altura(em centímetros): ")));
        altupesoDTO.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Informe o peso(em quilogramas): ")));
        
        JOptionPane.showMessageDialog(null, altupesoCTR.calcular(altupesoDTO));
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO NO SISTEMA: " + e.getMessage());
        }
    }
}
