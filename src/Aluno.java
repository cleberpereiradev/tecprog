public class Aluno extends Pessoa{
    private String regAcademico;
    private String matricula;
    private String periodo;

    public Aluno(int id, String nome, String cpf, String email, String regAcademico, String matricula, String periodo){
        super(id, nome, cpf, email);
        this.regAcademico = regAcademico;
        this.matricula = matricula;
        this.periodo = periodo;
    }

    public String getRegAcademico() {
        return regAcademico;
    }

    public void setRegAcademico(String regAcademico) {
        this.regAcademico = regAcademico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

}
