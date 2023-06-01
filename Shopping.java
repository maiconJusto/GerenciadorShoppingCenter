import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        lojas = new Loja[quantMaximaLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return nome + "/" + endereco + "/" + Arrays.toString(lojas);
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

    public boolean removeLoja(String nomeLoja) {
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

        if (tipoLoja.equalsIgnoreCase("Alimentacao") || 
                tipoLoja.equalsIgnoreCase("Bijuteria") || 
                tipoLoja.equalsIgnoreCase("Cosmetico") || 
                tipoLoja.equalsIgnoreCase("Informatica") && tipoLoja != null) {
            
            for (int i = 0; i < lojas.length; i++) {
                if (lojas[i] instanceof Cosmetico && tipoLoja.equalsIgnoreCase("Alimentacao")) {
                    quantidade++;
                }else if(lojas[i] instanceof Bijuteria && tipoLoja.equalsIgnoreCase("Bijuteria")){
                    quantidade++;
                }else if(lojas[i] instanceof Alimentacao && tipoLoja.equalsIgnoreCase("Cosmetico")){
                    quantidade++;
                }else if(lojas[i] instanceof Informatica && tipoLoja.equalsIgnoreCase("Informatica")){
                    quantidade++;
                }
            }
            return quantidade;
        } else {
            return -1;
        }
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorValorSeguro = 0;

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i] instanceof Informatica) {
                Informatica informatica = (Informatica) lojas[i];
                if (informatica.getSeguroEletronicos() > maiorValorSeguro) {
                    maiorValorSeguro = informatica.getSeguroEletronicos();
                    lojaMaisCara = (Informatica) lojas[i];
                }
            }
        }
        return lojaMaisCara;
    }

}
