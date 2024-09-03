import java.util.ArrayList;
import java.util.List;

public class SistemaGerenciamento {
    private List<Imovel> imoveis;
    private List<Cliente> clientes;
    private List<Transacao> transacoes;

    public SistemaGerenciamento() {
        this.imoveis = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.transacoes = new ArrayList<>();
    }

    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarTransacao(Imovel imovel, Cliente cliente, LocalDate data, double valor) {
        Transacao transacao = new Transacao(imovel, cliente, data, valor);
        transacoes.add(transacao);
    }

    public void listarImoveis() {
        for (Imovel imovel : imoveis) {
            System.out.println(imovel);
        }
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void listarTransacoes() {
        for (Transacao transacao : transacoes) {
            System.out.println(transacao);
        }
    }
}