public class Funcionario extends Pessoa{
    private String regFuncionario;
    private String funcao;

    public Funcionario(int id, String nome, String cpf, String email, String regFuncionario, String funcao) {
        super(id, nome, cpf, email);
        this.regFuncionario = regFuncionario;
        this.funcao = funcao;
    }

    public String getRegFuncionario() {
        return regFuncionario;
    }

    public void setRegFuncionario(String regFuncionario) {
        this.regFuncionario = regFuncionario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
