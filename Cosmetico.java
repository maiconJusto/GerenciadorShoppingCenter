public class Cosmetico extends Loja {

    private double taxaComercializacao;
    private String tipoLoja;

    public Cosmetico(String nomeLojaCosmetico,
            int quantidadeFuncionariosLojaCosmetico,
            double salarioBaseFuncionarioLojaCosmetico,
            Endereco enderecoLojaCosmetico,
            Data dataFundacaoLojaCosmetico,
            int tamanhoEstoqueLojaCosmetico,
            double taxaComercializacao) {

        super(nomeLojaCosmetico,
                quantidadeFuncionariosLojaCosmetico,
                salarioBaseFuncionarioLojaCosmetico,
                enderecoLojaCosmetico,
                dataFundacaoLojaCosmetico,
                tamanhoEstoqueLojaCosmetico);

        this.taxaComercializacao = taxaComercializacao;
        this.tipoLoja = "Cosmetico";
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public String getTipoLoja() {
        return tipoLoja;
    }

    public void setTipoLoja(String tipoLoja) {
        this.tipoLoja = tipoLoja;
    }

    @Override
    public String toString() {
        return super.toString() + " / " + taxaComercializacao;
    }
}
