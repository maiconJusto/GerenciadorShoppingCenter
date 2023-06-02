import java.util.Arrays;

public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    private String tipoLoja;

    // Primeiro construtor
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao,  int tamanhoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        estoqueProdutos = new Produto[tamanhoEstoque];
    }
    //Segundo construtor
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, 
            int tamanhoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        estoqueProdutos = new Produto[tamanhoEstoque];
    }

    // métodos Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    // Metodo Endereço da loja
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Metodos Data de fundação da loja
    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getTipoLoja(){
        return tipoLoja;
    }

    public void setTipoLoja(String tipoLoja){
        this.tipoLoja = tipoLoja;
    }

    //Método estoque da loja
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    // Método gastos com salario da loja
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return (salarioBaseFuncionario * quantidadeFuncionarios);
        }

    }

    // Método tamanho da loja
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    @Override
    public String toString() {
        return nome + " / " + quantidadeFuncionarios + " / " + salarioBaseFuncionario + " / " + endereco + " / " + dataFundacao
                + " / " + Arrays.toString(estoqueProdutos);
    }

    public void imprimeProdutos(){
            if (estoqueProdutos != null)            
                System.out.println(getEstoqueProdutos());
            else
                System.out.println("No momento não a produtos no estoque");
    }
    
    public boolean insereProduto(Produto novoProduto){
        if(estoqueProdutos != null){
            for(int i = 0; i < estoqueProdutos.length; i++){
                if(estoqueProdutos[i] == null){
                    estoqueProdutos[i] = novoProduto;
                    return true; // Produto inserido com sucesso
                }
            }
        }
        return false; // Produto não inserido no estoque
    }

    public boolean removeProduto(String nomeProduto){
        if(estoqueProdutos != null){
            for(int i = 0; i < estoqueProdutos.length; i++){
                if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)){
                    estoqueProdutos = null;
                    return true; // Produto removido com sucesso
                }
            }
        }
        return false; // Produto não encontrado no estoque
    }


}