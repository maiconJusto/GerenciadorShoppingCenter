public class Bijuteria extends Loja {

    private double metaVendas;
    private String tipoLoja;

    public Bijuteria(String nomeLojaBijuteria,
            int quantidadeFuncionariosLojaBijuteria,
            double salarioBaseFuncionarioLojaBijuteria,
            Endereco enderecoLojaBijuteria,
            Data dataFundacaoLojaBijuteria,
            int tamanhoEstoqueLojaBijuteria,
            double metaVendas) {

        super(nomeLojaBijuteria,
                quantidadeFuncionariosLojaBijuteria,
                salarioBaseFuncionarioLojaBijuteria,
                enderecoLojaBijuteria,
                dataFundacaoLojaBijuteria,
                tamanhoEstoqueLojaBijuteria);

        this.metaVendas = metaVendas;
        this.tipoLoja = "Bijuteria";
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public String getTipoLoja() {
        return tipoLoja;
    }

    public void setTipoLoja(String tipoLoja) {
        this.tipoLoja = tipoLoja;
    }

    @Override
    public String toString() {
        return super.toString() + " / " + metaVendas;
    }

}
