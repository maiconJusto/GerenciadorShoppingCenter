public class Alimentacao extends Loja {

    private Data dataAlvara;

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
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return super.toString() + "/" + dataAlvara;
    }
}
