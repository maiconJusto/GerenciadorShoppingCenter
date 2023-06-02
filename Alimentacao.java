public class Alimentacao extends Loja {

    private Data dataAlvara;
    private String tipoLoja;

    public Alimentacao(String nomeLojaAlimentacao,
            int quantidadeFuncionariosLojaAlimentacao,
            double salarioBaseFuncionarioLojaAlimentacao,
            Endereco enderecoLojaAlimentacao,
            Data dataFundacaoLojaAlimentacao,
            Data dataAlvara,
            int tamanhoEstoqueLojaAlimentacao) {

        super(nomeLojaAlimentacao,
                quantidadeFuncionariosLojaAlimentacao,
                salarioBaseFuncionarioLojaAlimentacao,
                enderecoLojaAlimentacao,
                dataFundacaoLojaAlimentacao,
                tamanhoEstoqueLojaAlimentacao);

        this.dataAlvara = dataAlvara;
        this.tipoLoja = "Alimentacao";
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public String getTipoLoja(){
        return tipoLoja;
    }

    public void setTipoLoja(String tipoLoja) {
        this.tipoLoja = tipoLoja;
    }

    @Override
    public String toString() {
        return super.toString() + "/" + dataAlvara;
    }
}
