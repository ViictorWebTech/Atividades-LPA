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
public class CarroDAO extends VeiculoDAO{
    public String imprimirPotencia(CarroDTO carroDTO){
        return "A Potência é: " + carroDTO.getPotencia();
    }
    
    public String imprimirQtd_portas(CarroDTO carroDTO){
        return "A Quantidade de portas é: " + carroDTO.getQtd_portas();
    }
}
