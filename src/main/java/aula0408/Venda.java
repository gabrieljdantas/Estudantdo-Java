package aula0408;

import java.time.LocalDate;
import java.util.List;

public class Venda {

    private String cliente;
    private LocalDate dataRegistro;
    private List<String> produtos;
    private Double precoTotal;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Venda(String cliente, LocalDate dataRegistro, List<String> produtos, Double precoTotal) {
        this.cliente = cliente;
        this.dataRegistro = dataRegistro;
        this.produtos = produtos;
        this.precoTotal = precoTotal;
    }

    public Venda(String cliente, LocalDate dataRegistro) {
        this.cliente = cliente;
        this.dataRegistro = dataRegistro;
    }

    public Venda() {

    }

    @Override
    public String toString() {
        return "Venda{" +
                "cliente='" + cliente + '\'' +
                ", dataRegistro=" + dataRegistro +
                ", produtos=" + produtos +
                ", precoTotal=" + precoTotal +
                '}';
    }
}
