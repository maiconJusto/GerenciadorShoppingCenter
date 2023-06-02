public class Informatica extends Loja {

    private double seguroEletronicos;
    private String tipoLoja;

    public Informatica(String nomeLojaInformatica,
            int quantidadeFuncionariosLojaInformatica,
            double salarioBaseFuncionarioLojaInformatica,
            Endereco enderecoLojaInformatica,
            Data dataFundacaoLojaInformatica,
            int tamanhoEstoqueLojaInformatica,
            double seguroEletronicos) {

        super(nomeLojaInformatica,
                quantidadeFuncionariosLojaInformatica,
                salarioBaseFuncionarioLojaInformatica,
                enderecoLojaInformatica,
                dataFundacaoLojaInformatica,
                tamanhoEstoqueLojaInformatica);

        this.seguroEletronicos = seguroEletronicos;
        this.tipoLoja = "Informática";
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public String getTipoLoja() {
        return tipoLoja;
    }

    public void setTipoLoja(String tipoLoja) {
        this.tipoLoja = tipoLoja;
    }

    @Override
    public String toString() {
        return super.toString() + "/" + seguroEletronicos;
    }
}
