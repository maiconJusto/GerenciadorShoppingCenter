public class Alimentacao extends Loja{
    
    Data dataAlvara;

    public Alimentacao(String nomeLojaAlimentacao, int quantidadeFuncionariosLojaAlimentacao, 
            double salarioBaseFuncionarioLojaAlimentacao, Endereco enderecoLojaAlimentacao, 
            Data dataFundacaoLojaAlimentacao, Data dataAlvara){
        super(nomeLojaAlimentacao, quantidadeFuncionariosLojaAlimentacao, salarioBaseFuncionarioLojaAlimentacao, enderecoLojaAlimentacao, dataFundacaoLojaAlimentacao);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara(){
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return getNome() + "/" + getQuantidadeFuncionarios() + "/" + getSalarioBaseFuncionario() + "/" 
                + getEndereco() + "/" + getDataFundacao() + "/" + dataAlvara;
    }
}