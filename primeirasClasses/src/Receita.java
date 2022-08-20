import java.util.Date;

public class Receita {
    Integer id;
    String descricao;
    String data;
    double valor;

    void consultarDados(){
        System.out.println("Receita");
        System.out.println("Id: " + id);
        System.out.println("Descricao: " + descricao);
        System.out.println("Data: " + data);
        System.out.println("Valor R$ " + valor);

    }

}
