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
public class VeiculoDAO {
    
    public String imprimirPlaca(VeiculoDTO veiculoDTO){
        return "A Placa é: " + veiculoDTO.getPlaca();
    }
    
    public String imprimirCor(VeiculoDTO veiculoDTO){
        return "A Cor é: " + veiculoDTO.getCor();
    }
    
}
