public class App {
    public static void main(String[] args) {
        Receita receita = new Receita();
        receita.id = 1;
        receita.descricao = "Salário";
        receita.data = "2022-8-16";
        receita.valor = 2500.00;

        Despesa despesa = new Despesa();
        despesa.id = 1;
        despesa.descricao = "Conta de água";
        despesa.data = "2022-8-18";
        despesa.valor = 250.00;

        receita.consultarDados();

        despesa.consultarDados();

    }
}
