package Beans;

/**
 *
 * @author José Isaias Lourenço
 */
public class ClienteBeans {
    private int Codigo;
    private String Nome;
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Telefone;
    private String DataCad;
    private String Busca;
    
    public ClienteBeans(){
        
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }
    
    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getDataCad() {
        return DataCad;
    }

    public void setDataCad(String DataCad) {
        this.DataCad = DataCad;
    }
    
    
    
}
