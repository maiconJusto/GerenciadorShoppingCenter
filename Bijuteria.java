public class Bijuteria extends Loja {

    double metaVendas;

    public Bijuteria(String nomeLojaBijuteria, int quantidadeFuncionariosLojaBijuteria, double salarioBaseFuncionarioLojaBijuteria, Endereco enderecoLojaBijuteria, Data dataFundacaoLojaBijuteria, double metaVendas){
        super(nomeLojaBijuteria, quantidadeFuncionariosLojaBijuteria, salarioBaseFuncionarioLojaBijuteria, enderecoLojaBijuteria, dataFundacaoLojaBijuteria);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas(){
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return getNome() + "/" + getQuantidadeFuncionarios() + "/" + getSalarioBaseFuncionario() + "/" 
                + getEndereco() + "/" + getDataFundacao() + "/" + metaVendas;
    }
}
