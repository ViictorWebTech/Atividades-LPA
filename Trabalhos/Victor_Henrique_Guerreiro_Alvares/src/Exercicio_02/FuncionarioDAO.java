package Exercicio_02;


public class FuncionarioDAO extends PessoaDAO{

    public String mostrarDadosFunc(FuncionarioDTO funcionarioDTO){
        return "O siape de " + funcionarioDTO.getNome() + " é " +
                funcionarioDTO.getSiape() + " e a função é " + funcionarioDTO.getFuncao();
    }


    private int calcularAposentadoria(FuncionarioDTO funcionarioDTO) {
        int anosAposentadoria = 60 - funcionarioDTO.getIdade();

      return anosAposentadoria;
    }//Fecha calcularAposentadoria

    public boolean result(){
        return calcularAposentadoria();
    }




}
