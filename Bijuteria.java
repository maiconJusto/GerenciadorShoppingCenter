public class Bijuteria extends Loja {

    double metaVendas;

    public Bijuteria(String nomeLojaVestuario, int quantidadeFuncionariosLojaVestuario, double salarioBaseFuncionarioLojaVestuario, Endereco enderecoLojaVestuario, Data dataFundacaoLojaVestuario, double metaVendas){
        super(nomeLojaVestuario, quantidadeFuncionariosLojaVestuario, salarioBaseFuncionarioLojaVestuario, enderecoLojaVestuario, dataFundacaoLojaVestuario);
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
