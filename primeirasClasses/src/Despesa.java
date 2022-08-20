public class Despesa {
    Integer id;
    String descricao;
    String data;
    double valor;

    void consultarDados(){
        System.out.println("Despesa");
        System.out.println("Id: " + id);
        System.out.println("Descricao: " + descricao);
        System.out.println("Data: " + data);
        System.out.println("Valor R$ " + valor);

    }
}
