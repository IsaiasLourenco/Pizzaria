package Beans;

import java.util.ArrayList;
import java.util.List;

public class PedidoBeans {
    
    private int CodigoPedido;
    private int CodigoCliente;
    private int CodigoFuncionario;
    private int CodigoEntregador;
    private String Data;
    private String Hora;
    private Double Valor;
    private String Status;
    private List<Integer> CodCardapio;
    private List<Integer> Quantidade;
    
    public PedidoBeans() {
        CodCardapio = new ArrayList<>();
        Quantidade = new ArrayList<>();
    }

    public int getCodCardapio(int Posicao) {
        return CodCardapio.get(Posicao);
    }

    public void setCodCardapio(int CodCardapio) {
        this.CodCardapio.add(CodCardapio);
    }

    public int getQuantidade(int Posicao) {
        return Quantidade.get(Posicao);
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade.add(Quantidade);
    }

    public int getCodigoPedido() {
        return CodigoPedido;
    }

    public void setCodigoPedido(int CodigoPedido) {
        this.CodigoPedido = CodigoPedido;
    }
    
    public int getCodigoCliente() {
        return CodigoCliente;
    }

    public void setCodigoCliente(int CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }

    public int getCodigoFuncionario() {
        return CodigoFuncionario;
    }

    public void setCodigoFuncionario(int CodigoFuncionario) {
        this.CodigoFuncionario = CodigoFuncionario;
    }

    public int getCodigoEntregador() {
        return CodigoEntregador;
    }

    public void setCodigoEntregador(int CodigoEntregador) {
        this.CodigoEntregador = CodigoEntregador;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
    
}
