import java.util.Arrays;

public class Shopping {
    String nome;
    Endereco enderecoShopping;
    Loja[] lojas;
    
    public Shopping(String nome, Endereco enderecoShopping, Loja[] lojas, int quantMaximaLojas){
        this.nome = nome;
        this.enderecoShopping = enderecoShopping;
        lojas = new Loja[quantMaximaLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnderecoShopping() {
        return enderecoShopping;
    }

    public void setEnderecoShopping(Endereco enderecoShopping) {
        this.enderecoShopping = enderecoShopping;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return nome + "/" + enderecoShopping + "/" + Arrays.toString(lojas);
    }
    
    
    
}
