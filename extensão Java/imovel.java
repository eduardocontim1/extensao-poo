public class Imovel {
    private String id;
    private String endereco;
    private double preco;

    public Imovel(String id, String endereco, double preco) {
        this.id = id;
        this.endereco = endereco;
        this.preco = preco;
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public String toString() {
        return "Imóvel [ID=" + id + ", Endereço=" + endereco + ", Preço=" + preco + "]";
    }
}