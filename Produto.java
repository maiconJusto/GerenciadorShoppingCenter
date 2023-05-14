public class  Produto{

    private String nome;
    private double preco;
    private Data dataValidade;

    //construtor c/parâmetros
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    //métodos de acesso da classe Produto (Get)
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
    this.preco = preco;
    }

    public Data getDataValidade(){
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }

    /*public boolean estaVencido(Data dataAtual) {
        if (this.dataValidade == null) {
            return false;
        }

        if (this.dataValidade.getAno() < dataAtual.getAno()) {
            return true;
        } else if (this.dataValidade.getAno() == dataAtual.getAno()) {
            if (this.dataValidade.getMes() < dataAtual.getMes()) {
                return true;
            } else if (this.dataValidade.getMes() == dataAtual.getMes()) {
                if (this.dataValidade.getDia() < dataAtual.getDia()) {
                    return true;
                }
            }
        }

        return false;
    }*/

    public boolean estaVencido(Data dataAtual) {
        return dataAtual.compareTo(dataValidade) > 0;
    }
    
    @Override
    public String toString(){
        return String.format("Nome: %s\nPreço: %s\n", nome, preco);
    }

}