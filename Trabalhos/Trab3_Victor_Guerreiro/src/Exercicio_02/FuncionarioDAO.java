package Exercicio_02;


public class FuncionarioDAO extends PessoaDAO{
    int anosAposentadoria;

    public String mostrarDadosFunc(FuncionarioDTO funcionarioDTO){
        return "\n O SIAPE de " + funcionarioDTO.getNome() + " é " +
                funcionarioDTO.getSiape() + " e a função é " + funcionarioDTO.getFuncao();
    }



    private int calculoAnosAposentadoria(int anosAposentadoria, FuncionarioDTO funcionarioDTO) {

        return this.anosAposentadoria = 60 - funcionarioDTO.getIdade();


    }//Fecha calcularAposentadoria


    public String resultadoAposentadoria(FuncionarioDTO funcionarioDTO){
        if (calculoAnosAposentadoria(anosAposentadoria, funcionarioDTO) <= 0) {
            return "Já possui idade para aposentar-se. ";
        }else{
            return "Faltam " + calculoAnosAposentadoria(anosAposentadoria, funcionarioDTO) + " ano(s) para aposentar-se.";
        }//Fecha else

    }
}
