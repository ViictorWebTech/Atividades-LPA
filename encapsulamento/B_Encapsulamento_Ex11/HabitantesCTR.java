/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Encapsulamento_Ex11;

/**
 *
 * @author Aluno
 */
public class HabitantesCTR {

    HabitantesDAO habitantesDAO = new HabitantesDAO();
    public String calcularPessoas(HabitantesDTO habitantesDTO) {
        return habitantesDAO.calcularPessoas(habitantesDTO);

    } //fecha o metodo

    public String Imprimir(HabitantesDTO habitantesDTO) {

        return habitantesDAO.Imprimir(habitantesDTO);

    } //fecha metodo
} //fecha calsse
