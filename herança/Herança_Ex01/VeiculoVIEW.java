/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herança_Ex01;

/**
 *
 * @author Aluno
 */
import javax.swing.JOptionPane;
public class VeiculoVIEW {
    public static void main(String[] args){
        try{
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o Objeto carro");
            CarroDTO carroDTO = new CarroDTO();
            CarroDAO carroDAO = new CarroDAO();
            
            carroDTO.setPlaca(JOptionPane.showInputDialog("Informe a Placa do Carro"));
            carroDTO.setCor(JOptionPane.showInputDialog("Informe a Cor do carro"));
            carroDTO.setPotencia(Integer.parseInt(
            JOptionPane.showInputDialog("Informe a Potência do carro")));
            carroDTO.setQtd_portas(Integer.parseInt(
            JOptionPane.showInputDialog("Informe a Quantidade de portas do carro")));
            
            JOptionPane.showMessageDialog(null, carroDAO.imprimirPlaca(carroDTO));
            JOptionPane.showMessageDialog(null, carroDAO.imprimirCor(carroDTO));
            JOptionPane.showMessageDialog(null, carroDAO.imprimirPotencia(carroDTO));
            JOptionPane.showMessageDialog(null, carroDAO.imprimirQtd_portas(carroDTO));
            
             JOptionPane.showMessageDialog(null, "Vamos trabalhar com o Objeto moto");
            MotoDTO motoDTO = new MotoDTO();
            MotoDAO motoDAO = new MotoDAO();
            
            motoDTO.setPlaca(JOptionPane.showInputDialog("Informe a Placa da moto"));
            motoDTO.setCor(JOptionPane.showInputDialog("Informe a Cor da moto"));
            motoDTO.setCilindrada(Integer.parseInt(
            JOptionPane.showInputDialog("Informe a Cilindrada da moto")));
            motoDTO.setTipo_motor(
            JOptionPane.showInputDialog("Informe o tipo de Motor 2T ou 4T"));
            
            JOptionPane.showMessageDialog(null, motoDAO.imprimirPlaca(motoDTO));
            JOptionPane.showMessageDialog(null, motoDAO.imprimirCor(motoDTO));
            JOptionPane.showMessageDialog(null, motoDAO.imprimirCilindrada(motoDTO));
            JOptionPane.showMessageDialog(null, motoDAO.imprimirTipo_motor(motoDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
        }
    }//Fecha main
}//Fecha classe
