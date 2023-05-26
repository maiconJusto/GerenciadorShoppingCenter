public class Cosmetico extends Loja {

    double taxaComercializacao;

    public Cosmetico(String nomeLojaCosmetico, int quantidadeFuncionariosLojaCosmetico,
            double salarioBaseFuncionarioLojaCosmetico, Endereco enderecoLojaCosmetico, Data dataFundacaoLojaCosmetico, int tamanhoEstoqueLojaCosmetico,
            double taxaComercializacao) {
        super(nomeLojaCosmetico, quantidadeFuncionariosLojaCosmetico, salarioBaseFuncionarioLojaCosmetico,
                enderecoLojaCosmetico, dataFundacaoLojaCosmetico, tamanhoEstoqueLojaCosmetico);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return getNome() + "/" + getQuantidadeFuncionarios() + "/" + getSalarioBaseFuncionario() + "/"
                + getEndereco() + "/" + getDataFundacao() + "/" + taxaComercializacao;
    }
}
