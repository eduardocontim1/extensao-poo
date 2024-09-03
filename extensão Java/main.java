import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SistemaGerenciamento sistema = new SistemaGerenciamento();

        // Adicionar imóveis
        Imovel imovel1 = new Imovel("1", "Rua A, 123", 300000.00);
        Imovel imovel2 = new Imovel("2", "Rua B, 456", 150000.00);
        sistema.adicionarImovel(imovel1);
        sistema.adicionarImovel(imovel2);

        // Adicionar clientes
        Cliente cliente1 = new Cliente("12345678900", "João Silva");
        Cliente cliente2 = new Cliente("98765432100", "Maria Oliveira");
        sistema.adicionarCliente(cliente1);
        sistema.adicionarCliente(cliente2);

        // Registrar transações
        sistema.registrarTransacao(imovel1, cliente1, LocalDate.now(), 300000.00);
        sistema.registrarTransacao(imovel2, cliente2, LocalDate.now(), 150000.00);

        // Listar dados
        System.out.println("Imóveis:");
        sistema.listarImoveis();
        
        System.out.println("\nClientes:");
        sistema.listarClientes();
        
        System.out.println("\nTransações:");
        sistema.listarTransacoes();
    }
}