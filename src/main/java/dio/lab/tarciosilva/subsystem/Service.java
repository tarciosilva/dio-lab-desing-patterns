package dio.lab.tarciosilva.subsystem;

public class Service {
    public static void clientPersist(String nome, String cep, String cidade, String estado) {
        System.out.println("Sucesso ao gravar: ");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
