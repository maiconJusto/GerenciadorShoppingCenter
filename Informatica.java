public class Informatica extends Loja{
     
    double seguroEletronicos;

    public Informatica(String nomeLojaInformatica, int quantidadeFuncionariosLojaInformatica, 
            double salarioBaseFuncionarioLojaInformatica, Endereco enderecoLojaInformatica, 
            Data dataFundacaoLojaInformatica, double seguroEletronicos){
        super(nomeLojaInformatica, quantidadeFuncionariosLojaInformatica, salarioBaseFuncionarioLojaInformatica, enderecoLojaInformatica, dataFundacaoLojaInformatica);
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return getNome() + "/" + getQuantidadeFuncionarios() + "/" + getSalarioBaseFuncionario() + "/" 
                + getEndereco() + "/" + getDataFundacao() + "/" + seguroEletronicos;
    }
}
