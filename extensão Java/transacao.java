import java.time.LocalDate;

public class Transacao {
    private Imovel imovel;
    private Cliente cliente;
    private LocalDate data;
    private double valor;

    public Transacao(Imovel imovel, Cliente cliente, LocalDate data, double valor) {
        this.imovel = imovel;
        this.cliente = cliente;
        this.data = data;
        this.valor = valor;
    }

    // Getters e Setters
    public Imovel getImovel() { return imovel; }
    public void setImovel(Imovel imovel) { this.imovel = imovel; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    @Override
    public String toString() {
        return "Transação [Imóvel=" + imovel + ", Cliente=" + cliente + ", Data=" + data + ", Valor=" + valor + "]";
    }
}