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
public class MotoDAO extends VeiculoDAO{
    public String imprimirCilindrada(MotoDTO motoDTO){
        return "A Cilindrada é: " + motoDTO.getCilindrada();
    }
    
    public String imprimirTipo_motor(MotoDTO motoDTO){
        return "O tipo do Moto é: " + motoDTO.getTipo_motor();
    }
}
