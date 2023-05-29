import java.util.Arrays;

public class Shopping {
    String nome;
    Endereco enderecoShopping;
    Loja[] lojas;

    public Shopping(String nome, Endereco enderecoShopping, Loja[] lojas, int quantMaximaLojas) {
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

    public boolean insereLoja(Loja novaLoja) {
        if (lojas != null) {
            for (int i = 0; i < lojas.length; i++) {
                if (lojas[i] == null) {
                    lojas[i] = novaLoja;
                    return true; // Loja inserida com sucesso
                }
            }
        }
        return false; // Loja não inserida
    }

    public boolean removeLoja(Loja nomeLoja) {
        if (lojas != null) {
            for (int i = 0; i < lojas.length; i++) {
                if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                    lojas[i] = null;
                    return true; // Loja removida com sucesso
                }
            }
        }
        return false; // Loja não encontrada
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int quantidade = 0;

        if (tipoLoja.equals("Cosmetico") || tipoLoja.equals("Bijuteria") || tipoLoja.equals("Alimentacao")
                || tipoLoja.equals("Informatica")) {
            for (Loja loja : lojas) {
                if (loja.getClass().getSimpleName().equals(tipoLoja)) {

                }
            }
            return quantidade;
        } else {
            return -1;
        }
    }

    public Loja lojaSeguroMaisCaro() {
        Loja lojaMaisCara = null;
        double maiorValorSeguro = 0;
        
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i] instanceof Informatica) {
                Informatica informatica = (Informatica) lojas[i];
                if (informatica.getSeguroEletronicos() > maiorValorSeguro) {
                    maiorValorSeguro = informatica.getSeguroEletronicos();
                    lojaMaisCara = lojas[i];
                }
            }
        }
        return lojaMaisCara;
    }

}
